(ns clj-redis.command
  (:require
    [clj-redis.core :as core])
  (:import
    (io.vertx.redis.client
      Command)))


(defn ACL [args]
  (core/cmd Command/ACL args))


(defn APPEND [args]
  (core/cmd Command/APPEND args))


(defn ASKING [args]
  (core/cmd Command/ASKING args))


(defn AUTH [args]
  (core/cmd Command/AUTH args))


(defn BGREWRITEAOF [args]
  (core/cmd Command/BGREWRITEAOF args))


(defn BGSAVE [args]
  (core/cmd Command/BGSAVE args))


(defn BITCOUNT [args]
  (core/cmd Command/BITCOUNT args))


(defn BITFIELD [args]
  (core/cmd Command/BITFIELD args))


(defn BITFIELD_RO [args]
  (core/cmd Command/BITFIELD_RO args))


(defn BITOP [args]
  (core/cmd Command/BITOP args))


(defn BITPOS [args]
  (core/cmd Command/BITPOS args))


(defn BLMOVE [args]
  (core/cmd Command/BLMOVE args))


(defn BLPOP [args]
  (core/cmd Command/BLPOP args))


(defn BRPOP [args]
  (core/cmd Command/BRPOP args))


(defn BRPOPLPUSH [args]
  (core/cmd Command/BRPOPLPUSH args))


(defn BZPOPMAX [args]
  (core/cmd Command/BZPOPMAX args))


(defn BZPOPMIN [args]
  (core/cmd Command/BZPOPMIN args))


(defn CLIENT [args]
  (core/cmd Command/CLIENT args))


(defn CLUSTER [args]
  (core/cmd Command/CLUSTER args))


(defn COMMAND [args]
  (core/cmd Command/COMMAND args))


(defn CONFIG [args]
  (core/cmd Command/CONFIG args))


(defn COPY [args]
  (core/cmd Command/COPY args))


(defn DBSIZE [args]
  (core/cmd Command/DBSIZE args))


(defn DEBUG [args]
  (core/cmd Command/DEBUG args))


(defn DECR [args]
  (core/cmd Command/DECR args))


(defn DECRBY [args]
  (core/cmd Command/DECRBY args))


(defn DEL [args]
  (core/cmd Command/DEL args))


(defn DISCARD [args]
  (core/cmd Command/DISCARD args))


(defn DUMP [args]
  (core/cmd Command/DUMP args))


(defn ECHO [args]
  (core/cmd Command/ECHO args))


(defn EVAL [args]
  (core/cmd Command/EVAL args))


(defn EVALSHA [args]
  (core/cmd Command/EVALSHA args))


(defn EXEC [args]
  (core/cmd Command/EXEC args))


(defn EXISTS [args]
  (core/cmd Command/EXISTS args))


(defn EXPIRE [args]
  (core/cmd Command/EXPIRE args))


(defn EXPIREAT [args]
  (core/cmd Command/EXPIREAT args))


(defn FAILOVER [args]
  (core/cmd Command/FAILOVER args))


(defn FLUSHALL [args]
  (core/cmd Command/FLUSHALL args))


(defn FLUSHDB [args]
  (core/cmd Command/FLUSHDB args))


(defn GEOADD [args]
  (core/cmd Command/GEOADD args))


(defn GEODIST [args]
  (core/cmd Command/GEODIST args))


(defn GEOHASH [args]
  (core/cmd Command/GEOHASH args))


(defn GEOPOS [args]
  (core/cmd Command/GEOPOS args))


(defn GEORADIUS [args]
  (core/cmd Command/GEORADIUS args))


(defn GEORADIUSBYMEMBER [args]
  (core/cmd Command/GEORADIUSBYMEMBER args))


(defn GEORADIUSBYMEMBER_RO [args]
  (core/cmd Command/GEORADIUSBYMEMBER_RO args))


(defn GEORADIUS_RO [args]
  (core/cmd Command/GEORADIUS_RO args))


(defn GEOSEARCH [args]
  (core/cmd Command/GEOSEARCH args))


(defn GEOSEARCHSTORE [args]
  (core/cmd Command/GEOSEARCHSTORE args))


(defn GET [args]
  (core/cmd Command/GET args))


(defn GETBIT [args]
  (core/cmd Command/GETBIT args))


(defn GETDEL [args]
  (core/cmd Command/GETDEL args))


(defn GETEX [args]
  (core/cmd Command/GETEX args))


(defn GETRANGE [args]
  (core/cmd Command/GETRANGE args))


(defn GETSET [args]
  (core/cmd Command/GETSET args))


(defn HDEL [args]
  (core/cmd Command/HDEL args))


(defn HELLO [args]
  (core/cmd Command/HELLO args))


(defn HEXISTS [args]
  (core/cmd Command/HEXISTS args))


(defn HGET [args]
  (core/cmd Command/HGET args))


(defn HGETALL [args]
  (core/cmd Command/HGETALL args))


(defn HINCRBY [args]
  (core/cmd Command/HINCRBY args))


(defn HINCRBYFLOAT [args]
  (core/cmd Command/HINCRBYFLOAT args))


(defn HKEYS [args]
  (core/cmd Command/HKEYS args))


(defn HLEN [args]
  (core/cmd Command/HLEN args))


(defn HMGET [args]
  (core/cmd Command/HMGET args))


(defn HMSET [args]
  (core/cmd Command/HMSET args))


(defn HOST [args]
  (core/cmd Command/HOST args))


(defn HRANDFIELD [args]
  (core/cmd Command/HRANDFIELD args))


(defn HSCAN [args]
  (core/cmd Command/HSCAN args))


(defn HSET [args]
  (core/cmd Command/HSET args))


(defn HSETNX [args]
  (core/cmd Command/HSETNX args))


(defn HSTRLEN [args]
  (core/cmd Command/HSTRLEN args))


(defn HVALS [args]
  (core/cmd Command/HVALS args))


(defn INCR [args]
  (core/cmd Command/INCR args))


(defn INCRBY [args]
  (core/cmd Command/INCRBY args))


(defn INCRBYFLOAT [args]
  (core/cmd Command/INCRBYFLOAT args))


(defn INFO [args]
  (core/cmd Command/INFO args))


(defn KEYS [args]
  (core/cmd Command/KEYS args))


(defn LASTSAVE [args]
  (core/cmd Command/LASTSAVE args))


(defn LATENCY [args]
  (core/cmd Command/LATENCY args))


(defn LINDEX [args]
  (core/cmd Command/LINDEX args))


(defn LINSERT [args]
  (core/cmd Command/LINSERT args))


(defn LLEN [args]
  (core/cmd Command/LLEN args))


(defn LMOVE [args]
  (core/cmd Command/LMOVE args))


(defn LOLWUT [args]
  (core/cmd Command/LOLWUT args))


(defn LPOP [args]
  (core/cmd Command/LPOP args))


(defn LPOS [args]
  (core/cmd Command/LPOS args))


(defn LPUSH [args]
  (core/cmd Command/LPUSH args))


(defn LPUSHX [args]
  (core/cmd Command/LPUSHX args))


(defn LRANGE [args]
  (core/cmd Command/LRANGE args))


(defn LREM [args]
  (core/cmd Command/LREM args))


(defn LSET [args]
  (core/cmd Command/LSET args))


(defn LTRIM [args]
  (core/cmd Command/LTRIM args))


(defn MEMORY [args]
  (core/cmd Command/MEMORY args))


(defn MGET [args]
  (core/cmd Command/MGET args))


(defn MIGRATE [args]
  (core/cmd Command/MIGRATE args))


(defn MODULE [args]
  (core/cmd Command/MODULE args))


(defn MONITOR [args]
  (core/cmd Command/MONITOR args))


(defn MOVE [args]
  (core/cmd Command/MOVE args))


(defn MSET [args]
  (core/cmd Command/MSET args))


(defn MSETNX [args]
  (core/cmd Command/MSETNX args))


(defn MULTI [args]
  (core/cmd Command/MULTI args))


(defn OBJECT [args]
  (core/cmd Command/OBJECT args))


(defn PERSIST [args]
  (core/cmd Command/PERSIST args))


(defn PEXPIRE [args]
  (core/cmd Command/PEXPIRE args))


(defn PEXPIREAT [args]
  (core/cmd Command/PEXPIREAT args))


(defn PFADD [args]
  (core/cmd Command/PFADD args))


(defn PFCOUNT [args]
  (core/cmd Command/PFCOUNT args))


(defn PFDEBUG [args]
  (core/cmd Command/PFDEBUG args))


(defn PFMERGE [args]
  (core/cmd Command/PFMERGE args))


(defn PFSELFTEST [args]
  (core/cmd Command/PFSELFTEST args))


(defn PING [args]
  (core/cmd Command/PING args))


(defn POST [args]
  (core/cmd Command/POST args))


(defn PSETEX [args]
  (core/cmd Command/PSETEX args))


(defn PSUBSCRIBE [args]
  (core/cmd Command/PSUBSCRIBE args))


(defn PSYNC [args]
  (core/cmd Command/PSYNC args))


(defn PTTL [args]
  (core/cmd Command/PTTL args))


(defn PUBLISH [args]
  (core/cmd Command/PUBLISH args))


(defn PUBSUB [args]
  (core/cmd Command/PUBSUB args))


(defn PUNSUBSCRIBE [args]
  (core/cmd Command/PUNSUBSCRIBE args))


(defn RANDOMKEY [args]
  (core/cmd Command/RANDOMKEY args))


(defn READONLY [args]
  (core/cmd Command/READONLY args))


(defn READWRITE [args]
  (core/cmd Command/READWRITE args))


(defn RENAME [args]
  (core/cmd Command/RENAME args))


(defn RENAMENX [args]
  (core/cmd Command/RENAMENX args))


(defn REPLCONF [args]
  (core/cmd Command/REPLCONF args))


(defn REPLICAOF [args]
  (core/cmd Command/REPLICAOF args))


(defn RESET [args]
  (core/cmd Command/RESET args))


(defn RESTORE [args]
  (core/cmd Command/RESTORE args))


(defn RESTORE_ASKING [args]
  (core/cmd Command/RESTORE_ASKING args))


(defn ROLE [args]
  (core/cmd Command/ROLE args))


(defn RPOP [args]
  (core/cmd Command/RPOP args))


(defn RPOPLPUSH [args]
  (core/cmd Command/RPOPLPUSH args))


(defn RPUSH [args]
  (core/cmd Command/RPUSH args))


(defn RPUSHX [args]
  (core/cmd Command/RPUSHX args))


(defn SADD [args]
  (core/cmd Command/SADD args))


(defn SAVE [args]
  (core/cmd Command/SAVE args))


(defn SCAN [args]
  (core/cmd Command/SCAN args))


(defn SCARD [args]
  (core/cmd Command/SCARD args))


(defn SCRIPT [args]
  (core/cmd Command/SCRIPT args))


(defn SDIFF [args]
  (core/cmd Command/SDIFF args))


(defn SDIFFSTORE [args]
  (core/cmd Command/SDIFFSTORE args))


(defn SELECT [args]
  (core/cmd Command/SELECT args))


(defn SENTINEL [args]
  (core/cmd Command/SENTINEL args))


(defn SET [args]
  (core/cmd Command/SET args))


(defn SETBIT [args]
  (core/cmd Command/SETBIT args))


(defn SETEX [args]
  (core/cmd Command/SETEX args))


(defn SETNX [args]
  (core/cmd Command/SETNX args))


(defn SETRANGE [args]
  (core/cmd Command/SETRANGE args))


(defn SHUTDOWN [args]
  (core/cmd Command/SHUTDOWN args))


(defn SINTER [args]
  (core/cmd Command/SINTER args))


(defn SINTERSTORE [args]
  (core/cmd Command/SINTERSTORE args))


(defn SISMEMBER [args]
  (core/cmd Command/SISMEMBER args))


(defn SLAVEOF [args]
  (core/cmd Command/SLAVEOF args))


(defn SLOWLOG [args]
  (core/cmd Command/SLOWLOG args))


(defn SMEMBERS [args]
  (core/cmd Command/SMEMBERS args))


(defn SMISMEMBER [args]
  (core/cmd Command/SMISMEMBER args))


(defn SMOVE [args]
  (core/cmd Command/SMOVE args))


(defn SORT [args]
  (core/cmd Command/SORT args))


(defn SPOP [args]
  (core/cmd Command/SPOP args))


(defn SRANDMEMBER [args]
  (core/cmd Command/SRANDMEMBER args))


(defn SREM [args]
  (core/cmd Command/SREM args))


(defn SSCAN [args]
  (core/cmd Command/SSCAN args))


(defn STRALGO [args]
  (core/cmd Command/STRALGO args))


(defn STRLEN [args]
  (core/cmd Command/STRLEN args))


(defn SUBSCRIBE [args]
  (core/cmd Command/SUBSCRIBE args))


(defn SUBSTR [args]
  (core/cmd Command/SUBSTR args))


(defn SUNION [args]
  (core/cmd Command/SUNION args))


(defn SUNIONSTORE [args]
  (core/cmd Command/SUNIONSTORE args))


(defn SWAPDB [args]
  (core/cmd Command/SWAPDB args))


(defn SYNC [args]
  (core/cmd Command/SYNC args))


(defn TIME [args]
  (core/cmd Command/TIME args))


(defn TOUCH [args]
  (core/cmd Command/TOUCH args))


(defn TTL [args]
  (core/cmd Command/TTL args))


(defn TYPE [args]
  (core/cmd Command/TYPE args))


(defn UNLINK [args]
  (core/cmd Command/UNLINK args))


(defn UNSUBSCRIBE [args]
  (core/cmd Command/UNSUBSCRIBE args))


(defn UNWATCH [args]
  (core/cmd Command/UNWATCH args))


(defn WAIT [args]
  (core/cmd Command/WAIT args))


(defn WATCH [args]
  (core/cmd Command/WATCH args))


(defn XACK [args]
  (core/cmd Command/XACK args))


(defn XADD [args]
  (core/cmd Command/XADD args))


(defn XAUTOCLAIM [args]
  (core/cmd Command/XAUTOCLAIM args))


(defn XCLAIM [args]
  (core/cmd Command/XCLAIM args))


(defn XDEL [args]
  (core/cmd Command/XDEL args))


(defn XGROUP [args]
  (core/cmd Command/XGROUP args))


(defn XINFO [args]
  (core/cmd Command/XINFO args))


(defn XLEN [args]
  (core/cmd Command/XLEN args))


(defn XPENDING [args]
  (core/cmd Command/XPENDING args))


(defn XRANGE [args]
  (core/cmd Command/XRANGE args))


(defn XREAD [args]
  (core/cmd Command/XREAD args))


(defn XREADGROUP [args]
  (core/cmd Command/XREADGROUP args))


(defn XREVRANGE [args]
  (core/cmd Command/XREVRANGE args))


(defn XSETID [args]
  (core/cmd Command/XSETID args))


(defn XTRIM [args]
  (core/cmd Command/XTRIM args))


(defn ZADD [args]
  (core/cmd Command/ZADD args))


(defn ZCARD [args]
  (core/cmd Command/ZCARD args))


(defn ZCOUNT [args]
  (core/cmd Command/ZCOUNT args))


(defn ZDIFF [args]
  (core/cmd Command/ZDIFF args))


(defn ZDIFFSTORE [args]
  (core/cmd Command/ZDIFFSTORE args))


(defn ZINCRBY [args]
  (core/cmd Command/ZINCRBY args))


(defn ZINTER [args]
  (core/cmd Command/ZINTER args))


(defn ZINTERSTORE [args]
  (core/cmd Command/ZINTERSTORE args))


(defn ZLEXCOUNT [args]
  (core/cmd Command/ZLEXCOUNT args))


(defn ZMSCORE [args]
  (core/cmd Command/ZMSCORE args))


(defn ZPOPMAX [args]
  (core/cmd Command/ZPOPMAX args))


(defn ZPOPMIN [args]
  (core/cmd Command/ZPOPMIN args))


(defn ZRANDMEMBER [args]
  (core/cmd Command/ZRANDMEMBER args))


(defn ZRANGE [args]
  (core/cmd Command/ZRANGE args))


(defn ZRANGEBYLEX [args]
  (core/cmd Command/ZRANGEBYLEX args))


(defn ZRANGEBYSCORE [args]
  (core/cmd Command/ZRANGEBYSCORE args))


(defn ZRANGESTORE [args]
  (core/cmd Command/ZRANGESTORE args))


(defn ZRANK [args]
  (core/cmd Command/ZRANK args))


(defn ZREM [args]
  (core/cmd Command/ZREM args))


(defn ZREMRANGEBYLEX [args]
  (core/cmd Command/ZREMRANGEBYLEX args))


(defn ZREMRANGEBYRANK [args]
  (core/cmd Command/ZREMRANGEBYRANK args))


(defn ZREMRANGEBYSCORE [args]
  (core/cmd Command/ZREMRANGEBYSCORE args))


(defn ZREVRANGE [args]
  (core/cmd Command/ZREVRANGE args))


(defn ZREVRANGEBYLEX [args]
  (core/cmd Command/ZREVRANGEBYLEX args))


(defn ZREVRANGEBYSCORE [args]
  (core/cmd Command/ZREVRANGEBYSCORE args))


(defn ZREVRANK [args]
  (core/cmd Command/ZREVRANK args))


(defn ZSCAN [args]
  (core/cmd Command/ZSCAN args))


(defn ZSCORE [args]
  (core/cmd Command/ZSCORE args))


(defn ZUNION [args]
  (core/cmd Command/ZUNION args))


(defn ZUNIONSTORE
  [args]
  (core/cmd Command/ZUNIONSTORE args))
