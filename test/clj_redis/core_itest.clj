(ns clj-redis.core-itest
  (:require [clojure.test :refer :all]
            [clj-test-containers.core :as tc]
            [clj-redis.core :as redis]
            [clj-redis.response :as resp]
            [clj-redis.response :as response])
  (:import (io.vertx.core Vertx)
           (io.vertx.redis.client Command)))

(deftest send-tests
  (let [redis-server (-> (tc/create {:image-name "redis:6"
                                     :exposed-ports [6379]})
                         (tc/start!))
        redis-options {:endpoints [(str "redis://localhost:" (get-in redis-server [:mapped-ports 6379]))]
                       :max-pool-size 1}]
    (with-open [vertx (Vertx/vertx)
                client (redis/create vertx redis-options)]
      (is (= "PONG" @(redis/send client (redis/cmd Command/PING [])))
          "cmd PING should return pong")
      (let [vals {"binary" (.getBytes "binary")
                  "double" 1111.11
                  "integer" 1111}
            set-vals-cmd (->> vals
                              (mapcat #(vector (key %) (val %)))
                              (redis/cmd Command/MSET))
            mget-cmd (redis/cmd Command/MGET (keys vals))]
        (is (= "OK" @(redis/send client set-vals-cmd)))
        (let [[v1 v2 v3] @(redis/send client mget-cmd)]
          ;; the result still response, cause BulkType cannot be auto resolve
          (is (= "binary" (response/to-string v1)))
          (is (= 1111.11 (response/to-double v2)))
          (is (= 1111 (response/to-int v3)))))
      (let [hash-name "hashtest"
            kvs {"1" "123"
                 "2" "2229ee"
                 "3" "3333"}
            hset-cmd (->> kvs
                          (mapcat #(vector (key %) (val %)))
                          (concat [hash-name])
                          (redis/cmd Command/HSET))
            hget-cmd (redis/cmd Command/HGETALL [hash-name])
            str-mapper (fn [k v] (resp/to-string v))]
        (is (= 3 @(redis/send client hset-cmd)))
        (is (= kvs @(redis/send client hget-cmd {:mapper (resp/to-map str-mapper)})))))))
