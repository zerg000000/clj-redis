(ns gen
  (:require [clojure.data.json :as json]
            [clojure.string :as string]))

(def file "https://raw.githubusercontent.com/vert-x3/vertx-redis-client/4.2.5/tools/commands.json")

(defn generate []
  (let [cmds   (-> (slurp file)
                   (json/read-str)
                   (get "commands"))
        target "src/clj_redis/command.clj"]
    (spit target
          "(ns clj-redis.command
  (:require [clj-redis.core :as core])
  (:import [io.vertx.redis.client Command]))\n")
    (mapv
     (fn [{:strs [name]}]
       (let [cmd (-> name
                     (string/upper-case)
                     (string/replace ":" "")
                     (string/replace "-" "_"))]
       (spit
        target
        (str
         "(defn " cmd "\n"
         "  [args]\n"

         "  (core/cmd Command/" cmd " args))\n\n")
        :append true)))
    cmds)))

(comment 
  (generate))