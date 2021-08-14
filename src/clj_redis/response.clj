(ns clj-redis.response
  (:import
    (io.vertx.core.buffer
      Buffer)
    (io.vertx.redis.client
      Response
      ResponseType)
    (java.nio.charset
      Charset)
    (java.util
      Map)))


(declare to-val)


(defn ^Integer to-int
  [^Response resp]
  (some-> resp (.toInteger)))


(defn ^Long to-long
  [^Response resp]
  (some-> resp (.toLong)))


(defn ^Short to-short
  [^Response resp]
  (some-> resp (.toShort)))


(defn ^Byte to-byte
  [^Response resp]
  (some-> resp (.toByte)))


(defn ^Boolean to-boolean
  [^Response resp]
  (some-> resp (.toBoolean)))


(defn ^BigInteger to-bigint
  [^Response resp]
  (some-> resp (.toBigInteger)))


(defn ^Float to-float
  [^Response resp]
  (some-> resp (.toFloat)))


(defn ^Double to-double
  [^Response resp]
  (some-> resp (.toDouble)))


(defn ^Number to-num
  [^Response resp]
  (some-> resp (.toNumber)))


(defn to-seq
  [^Response resp]
  (some-> resp (.iterator) (iterator-seq)))


(defn ^String to-string
  [^Response resp ^Charset charset]
  (some-> resp (.toString charset)))


(defn ^Buffer to-buffer
  [^Response resp]
  (some-> resp (.toBuffer)))


(defn ^bytes to-bytes
  [^Response resp]
  (some-> resp (.toBytes)))


(defn ^Map to-attribute-map
  [^Response resp]
  (some-> resp (.attributes)))


(defn ^Map to-map
  [^Response resp]
  (when resp
    (loop [m (transient {})
           [k & ks]  (.getKeys resp)]
      (if k
        (recur (assoc! m k (to-val (.get resp ^String k))) ks)
        (persistent! m)))))


(defn to-val
  [^Response resp]
  (when resp
    (condp = (.type resp)
      ResponseType/ATTRIBUTE (to-map resp)
      ResponseType/BOOLEAN (to-boolean resp)
      ResponseType/BULK (to-bytes resp)
      ResponseType/ERROR (to-string resp (Charset/forName "UTF-8"))
      ResponseType/NUMBER (to-num resp)
      ResponseType/SIMPLE (to-string resp (Charset/forName "UTF-8"))
      ResponseType/MULTI (to-seq resp))))
