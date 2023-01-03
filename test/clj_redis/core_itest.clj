(ns clj-redis.core-itest
  (:require
    [clj-redis.command :as cmd]
    [clj-redis.core :as redis]
    [clj-redis.response :as resp]
    [clj-test-containers.core :as tc]
    [clojure.test :refer :all])
  (:import
    (io.vertx.core
      Vertx)))


(deftest send-tests
  (let [redis-server (-> (tc/create {:image-name "redis:6"
                                     :exposed-ports [6379]})
                         (tc/start!))
        redis-options {:endpoints [(str "redis://localhost:" (get-in redis-server [:mapped-ports 6379]))]
                       :max-pool-size 1}]
    (with-open [vertx (Vertx/vertx)
                client (redis/create vertx redis-options)]
      (is (= "PONG" @(redis/send client (cmd/PING [])))
          "cmd PING should return pong")
      (let [vals {"binary" (.getBytes "binary")
                  "double" 1111.11
                  "integer" 1111}
            set-vals-cmd (->> vals
                              (mapcat #(vector (key %) (val %)))
                              (cmd/MSET))
            mget-cmd (cmd/MGET (keys vals))]
        (is (= "OK" @(redis/send client set-vals-cmd)))
        (let [[v1 v2 v3] @(redis/send client mget-cmd)]
          ;; the result still response, cause BulkType cannot be auto resolve
          (is (= "binary" (resp/to-string v1)))
          (is (= 1111.11 (resp/to-double v2)))
          (is (= 1111 (resp/to-int v3)))))
      (let [hash-name "hashtest"
            kvs {"1" "123"
                 "2" "2229ee"
                 "3" "3333"}
            hset-cmd (->> kvs
                          (mapcat #(vector (key %) (val %)))
                          (concat [hash-name])
                          (cmd/HSET))
            hget-cmd (cmd/HGETALL [hash-name])
            str-mapper (fn [k v] (resp/to-string v))]
        (is (= 3 @(redis/send client hset-cmd)))
        (is (= kvs @(redis/send client hget-cmd {:mapper (resp/to-map str-mapper)})))))))
