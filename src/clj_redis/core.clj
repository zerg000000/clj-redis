(ns clj-redis.core
  (:refer-clojure :exclude [send])
  (:require
    [clj-redis.response :as response])
  (:import
    (io.vertx.core
      Future
      Vertx)
    (io.vertx.redis.client
      Command
      Redis
      RedisClientType
      RedisOptions
      RedisReplicas
      RedisRole
      Request)
    (io.vertx.redis.client.impl
      RequestImpl)
    (java.util
      List)
    (java.util.concurrent
      CompletionStage)
    (java.util.function
      Function)))


(defn jfn
  [f]
  (reify Function
    (apply [_ t] (f t))))


(defn map->redis-options
  "Configure and return RedisOption"
  ^RedisOptions
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


(defn create
  "Create Redis instance"
  (^Redis [^Vertx vertx]
   (Redis/createClient vertx))
  (^Redis [^Vertx vertx options]
   (Redis/createClient vertx (map->redis-options options))))


(defn send*
  ^Future [^Redis client ^Request req]
  (.send client req))


(defn batch*
  ^Future [^Redis client ^List reqs]
  (.batch client reqs))


(defn send
  "Return CompletionStage<Response|nil>. Sends a command"
  (^CompletionStage [^Redis client ^Request req] (send client req {}))
  (^CompletionStage [^Redis client ^Request req {:keys [mapper]
                                                 :or {mapper response/to-val}}]
   (cond-> (-> (send* client req)
               (.toCompletionStage))
     mapper (.thenApply (jfn mapper)))))


(defn batch
  "Return CompletionStage<List<Response|nil>>. Sends a list of commands in a single IO operation"
  ^CompletionStage [client reqs]
  (-> (batch* client reqs)
      (.toCompletionStage)))


(defn cmd
  "Return Redis Request"
  ^Request [^Command command args]
  (let [req (RequestImpl. command)]
    (doseq [arg args]
      (.arg req arg))
    req))
