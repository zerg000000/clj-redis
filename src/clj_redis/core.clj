(ns clj-redis.core
  (:refer-clojure :exclude [send])
  (:require [clj-redis.response :as response])
  (:import
    (io.vertx.core
      Future
      Vertx)
    (io.vertx.core.buffer
      Buffer)
    (io.vertx.core.json
      JsonArray
      JsonObject)
    (io.vertx.redis.client
      Redis
      RedisClientType
      RedisOptions
      RedisReplicas
      RedisRole
      Request)
    (java.util
      List)
    (java.util.concurrent
      CompletionStage)
    (java.util.function Function)))

(defn jfn [f]
  (reify Function
    (apply [this t] (f t))))


(defn ^RedisOptions map->redis-options
  "Configure and return RedisOption"
  [{:keys [max-waiting-handler type net-client-options
           endpoints master-name role use-replicas
           max-nested-arrays pool-cleaner-interval
           max-pool-size pool-recycle-timeout password
           protocol-negotiation pool-name]}]
  (cond-> (RedisOptions.)
    max-waiting-handler (.setMaxPoolWaiting max-waiting-handler)
    type (.setType (RedisClientType/valueOf (name type)))
    net-client-options (.setNetClientOptions net-client-options)
    endpoints (.setEndpoints endpoints)
    master-name (.setMasterName master-name)
    role (.setRole (RedisRole/valueOf (name role)))
    use-replicas (.setUseReplicas (RedisReplicas/valueOf (name use-replicas)))
    max-nested-arrays (.setMaxNestedArrays max-nested-arrays)
    pool-cleaner-interval (.setPoolCleanerInterval pool-cleaner-interval)
    max-pool-size (.setMaxPoolSize max-pool-size)
    pool-recycle-timeout (.setPoolRecycleTimeout pool-recycle-timeout)
    password (.setPassword password)
    protocol-negotiation (.setProtocolNegotiation protocol-negotiation)
    pool-name (.setPoolName pool-name)))


(defn ^Redis create
  "Create Redis instance"
  ([^Vertx vertx]
   (Redis/createClient vertx))
  ([^Vertx vertx options]
   (Redis/createClient vertx (map->redis-options options))))


(defn ^Future send*
  [^Redis client ^Request req]
  (.send client req))


(defn ^Future batch*
  [^Redis client ^List reqs]
  (.batch client reqs))


(defn ^CompletionStage send
  "Return CompletionStage<Response|nil>. Sends a command"
  ([^Redis client ^Request req] (send client req {}))
  ([^Redis client ^Request req {:keys [mapper]
                                :or {mapper response/to-val}}]
   (cond-> (-> (send* client req)
               (.toCompletionStage))
     mapper (.thenApply (jfn mapper)))))


(defn ^CompletionStage batch
  "Return CompletionStage<List<Response|nil>>. Sends a list of commands in a single IO operation"
  [client reqs]
  (-> (batch* client reqs)
      (.toCompletionStage)))


(defn ^Request cmd
  "Return Redis Request"
  [command args]
  (let [req (Request/cmd command)]
    (doseq [arg args]
      (cond
        (instance? String arg)
        (.arg req ^String arg)
        (instance? JsonObject arg)
        (.arg req ^JsonObject arg)
        (instance? JsonArray arg)
        (.arg req ^JsonArray arg)
        (instance? Buffer arg)
        (.arg req ^Buffer arg)
        (boolean? arg)
        (.arg req ^boolean arg)
        (int? arg)
        (.arg req ^int arg)
        (double? arg)
        (.arg req ^double arg)
        (bytes? arg)
        (.arg req ^bytes arg)
        :default
        (throw (ex-info (str "Unsupported arg type: " (.getClass arg)) {:arg arg}))))
    req))
