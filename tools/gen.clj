(ns gen
  (:require
    [clojure.data.json :as json]
    [clojure.reflect :as r]
    [clojure.string :as string]
    [rewrite-clj.node :as n])
  (:import
    (io.vertx.redis.client
      Command)))


(defn gen-fn
  [fn-name]
  (-> (n/list-node
        [(n/token-node 'defn)
         (n/spaces 1)
         (n/token-node (symbol fn-name))
         (n/spaces 1)
         (n/vector-node [(n/token-node 'args)])
         (n/newline-node "\n")
         (n/whitespace-node "  ")
         (n/list-node
           [(n/token-node 'core/cmd)
            (n/spaces 1)
            (n/token-node (symbol "Command" fn-name))
            (n/spaces 1)
            (n/token-node 'args)])])
      (n/string)))


(defn generate
  []
  (let [cmds   (->> (r/reflect Command)
                    (:members)
                    (filter #(string/ends-with? (str (:type %)) "Command"))
                    (map :name)
                    (sort))
        target "gen/clj_redis/command.clj"]
    (spit target
          "(ns clj-redis.command
  (:require [clj-redis.core :as core])
  (:import [io.vertx.redis.client Command]))\n")
    (mapv
      (fn [name]
        (let [cmd (-> name
                      (string/upper-case)
                      (string/replace ":" "")
                      (string/replace "-" "_"))]
          (spit
            target
            (gen-fn cmd)
            :append true)))
      cmds)))


(comment 
  (generate)
  (require '[rewrite-clj.node :as n])
  (-> (gen-fn "SADD")
      (print)))
