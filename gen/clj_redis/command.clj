(ns clj-redis.command
  (:require
    [clj-redis.core :as core])
  (:import
    (io.vertx.redis.client
      Command)))


(defn SUNION [args]
  (core/cmd Command/SUNION args))


(defn PFSELFTEST [args]
  (core/cmd Command/PFSELFTEST args))


(defn STRALGO [args]
  (core/cmd Command/STRALGO args))


(defn ZADD [args]
  (core/cmd Command/ZADD args))


(defn ECHO [args]
  (core/cmd Command/ECHO args))


(defn HMSET [args]
  (core/cmd Command/HMSET args))


(defn EVALSHA [args]
  (core/cmd Command/EVALSHA args))


(defn HINCRBY [args]
  (core/cmd Command/HINCRBY args))


(defn ZINTER [args]
  (core/cmd Command/ZINTER args))


(defn BRPOP [args]
  (core/cmd Command/BRPOP args))


(defn READWRITE [args]
  (core/cmd Command/READWRITE args))


(defn XGROUP [args]
  (core/cmd Command/XGROUP args))


(defn SHUTDOWN [args]
  (core/cmd Command/SHUTDOWN args))


(defn BITFIELD_RO [args]
  (core/cmd Command/BITFIELD_RO args))


(defn PFADD [args]
  (core/cmd Command/PFADD args))


(defn XPENDING [args]
  (core/cmd Command/XPENDING args))


(defn DEL [args]
  (core/cmd Command/DEL args))


(defn EVAL [args]
  (core/cmd Command/EVAL args))


(defn SCAN [args]
  (core/cmd Command/SCAN args))


(defn UNWATCH [args]
  (core/cmd Command/UNWATCH args))


(defn TYPE [args]
  (core/cmd Command/TYPE args))


(defn GETSET [args]
  (core/cmd Command/GETSET args))


(defn LSET [args]
  (core/cmd Command/LSET args))


(defn MONITOR [args]
  (core/cmd Command/MONITOR args))


(defn WAIT [args]
  (core/cmd Command/WAIT args))


(defn LPOP [args]
  (core/cmd Command/LPOP args))


(defn ZLEXCOUNT [args]
  (core/cmd Command/ZLEXCOUNT args))


(defn PING [args]
  (core/cmd Command/PING args))


(defn ZINCRBY [args]
  (core/cmd Command/ZINCRBY args))


(defn DISCARD [args]
  (core/cmd Command/DISCARD args))


(defn ZREMRANGEBYSCORE [args]
  (core/cmd Command/ZREMRANGEBYSCORE args))


(defn HSET [args]
  (core/cmd Command/HSET args))


(defn EXPIRE [args]
  (core/cmd Command/EXPIRE args))


(defn FLUSHDB [args]
  (core/cmd Command/FLUSHDB args))


(defn INCRBYFLOAT [args]
  (core/cmd Command/INCRBYFLOAT args))


(defn LMOVE [args]
  (core/cmd Command/LMOVE args))


(defn RESTORE [args]
  (core/cmd Command/RESTORE args))


(defn LREM [args]
  (core/cmd Command/LREM args))


(defn GEORADIUS_RO [args]
  (core/cmd Command/GEORADIUS_RO args))


(defn RESTORE_ASKING [args]
  (core/cmd Command/RESTORE_ASKING args))


(defn RPUSH [args]
  (core/cmd Command/RPUSH args))


(defn LASTSAVE [args]
  (core/cmd Command/LASTSAVE args))


(defn DBSIZE [args]
  (core/cmd Command/DBSIZE args))


(defn ZSCAN [args]
  (core/cmd Command/ZSCAN args))


(defn ZPOPMAX [args]
  (core/cmd Command/ZPOPMAX args))


(defn GEOPOS [args]
  (core/cmd Command/GEOPOS args))


(defn RPUSHX [args]
  (core/cmd Command/RPUSHX args))


(defn LPOS [args]
  (core/cmd Command/LPOS args))


(defn DUMP [args]
  (core/cmd Command/DUMP args))


(defn SMEMBERS [args]
  (core/cmd Command/SMEMBERS args))


(defn ZRANGEBYSCORE [args]
  (core/cmd Command/ZRANGEBYSCORE args))


(defn SINTERSTORE [args]
  (core/cmd Command/SINTERSTORE args))


(defn SREM [args]
  (core/cmd Command/SREM args))


(defn READONLY [args]
  (core/cmd Command/READONLY args))


(defn BGSAVE [args]
  (core/cmd Command/BGSAVE args))


(defn SETBIT [args]
  (core/cmd Command/SETBIT args))


(defn MIGRATE [args]
  (core/cmd Command/MIGRATE args))


(defn COMMAND [args]
  (core/cmd Command/COMMAND args))


(defn XREADGROUP [args]
  (core/cmd Command/XREADGROUP args))


(defn SSCAN [args]
  (core/cmd Command/SSCAN args))


(defn ZSCORE [args]
  (core/cmd Command/ZSCORE args))


(defn ROLE [args]
  (core/cmd Command/ROLE args))


(defn XREVRANGE [args]
  (core/cmd Command/XREVRANGE args))


(defn REPLCONF [args]
  (core/cmd Command/REPLCONF args))


(defn ZCOUNT [args]
  (core/cmd Command/ZCOUNT args))


(defn PERSIST [args]
  (core/cmd Command/PERSIST args))


(defn GEODIST [args]
  (core/cmd Command/GEODIST args))


(defn EXISTS [args]
  (core/cmd Command/EXISTS args))


(defn GEORADIUSBYMEMBER_RO [args]
  (core/cmd Command/GEORADIUSBYMEMBER_RO args))


(defn GETDEL [args]
  (core/cmd Command/GETDEL args))


(defn HSTRLEN [args]
  (core/cmd Command/HSTRLEN args))


(defn GETBIT [args]
  (core/cmd Command/GETBIT args))


(defn INCRBY [args]
  (core/cmd Command/INCRBY args))


(defn HEXISTS [args]
  (core/cmd Command/HEXISTS args))


(defn PUBLISH [args]
  (core/cmd Command/PUBLISH args))


(defn APPEND [args]
  (core/cmd Command/APPEND args))


(defn SDIFF [args]
  (core/cmd Command/SDIFF args))


(defn CLUSTER [args]
  (core/cmd Command/CLUSTER args))


(defn SORT [args]
  (core/cmd Command/SORT args))


(defn RENAMENX [args]
  (core/cmd Command/RENAMENX args))


(defn GEORADIUS [args]
  (core/cmd Command/GEORADIUS args))


(defn RPOP [args]
  (core/cmd Command/RPOP args))


(defn BITCOUNT [args]
  (core/cmd Command/BITCOUNT args))


(defn SMISMEMBER [args]
  (core/cmd Command/SMISMEMBER args))


(defn HGET [args]
  (core/cmd Command/HGET args))


(defn BGREWRITEAOF [args]
  (core/cmd Command/BGREWRITEAOF args))


(defn XLEN [args]
  (core/cmd Command/XLEN args))


(defn DEBUG [args]
  (core/cmd Command/DEBUG args))


(defn XADD [args]
  (core/cmd Command/XADD args))


(defn FAILOVER [args]
  (core/cmd Command/FAILOVER args))


(defn HINCRBYFLOAT [args]
  (core/cmd Command/HINCRBYFLOAT args))


(defn HVALS [args]
  (core/cmd Command/HVALS args))


(defn BLMOVE [args]
  (core/cmd Command/BLMOVE args))


(defn BZPOPMIN [args]
  (core/cmd Command/BZPOPMIN args))


(defn UNSUBSCRIBE [args]
  (core/cmd Command/UNSUBSCRIBE args))


(defn ZMSCORE [args]
  (core/cmd Command/ZMSCORE args))


(defn SPOP [args]
  (core/cmd Command/SPOP args))


(defn BRPOPLPUSH [args]
  (core/cmd Command/BRPOPLPUSH args))


(defn PUBSUB [args]
  (core/cmd Command/PUBSUB args))


(defn SRANDMEMBER [args]
  (core/cmd Command/SRANDMEMBER args))


(defn RENAME [args]
  (core/cmd Command/RENAME args))


(defn SYNC [args]
  (core/cmd Command/SYNC args))


(defn ZRANGEBYLEX [args]
  (core/cmd Command/ZRANGEBYLEX args))


(defn XREAD [args]
  (core/cmd Command/XREAD args))


(defn XRANGE [args]
  (core/cmd Command/XRANGE args))


(defn LRANGE [args]
  (core/cmd Command/LRANGE args))


(defn LPUSH [args]
  (core/cmd Command/LPUSH args))


(defn XSETID [args]
  (core/cmd Command/XSETID args))


(defn SUBSTR [args]
  (core/cmd Command/SUBSTR args))


(defn PFMERGE [args]
  (core/cmd Command/PFMERGE args))


(defn ZREMRANGEBYRANK [args]
  (core/cmd Command/ZREMRANGEBYRANK args))


(defn ZRANGESTORE [args]
  (core/cmd Command/ZRANGESTORE args))


(defn ZREMRANGEBYLEX [args]
  (core/cmd Command/ZREMRANGEBYLEX args))


(defn GEORADIUSBYMEMBER [args]
  (core/cmd Command/GEORADIUSBYMEMBER args))


(defn LTRIM [args]
  (core/cmd Command/LTRIM args))


(defn ACL [args]
  (core/cmd Command/ACL args))


(defn XCLAIM [args]
  (core/cmd Command/XCLAIM args))


(defn MEMORY [args]
  (core/cmd Command/MEMORY args))


(defn ZRANGE [args]
  (core/cmd Command/ZRANGE args))


(defn BITFIELD [args]
  (core/cmd Command/BITFIELD args))


(defn HRANDFIELD [args]
  (core/cmd Command/HRANDFIELD args))


(defn GETRANGE [args]
  (core/cmd Command/GETRANGE args))


(defn XACK [args]
  (core/cmd Command/XACK args))


(defn GEOADD [args]
  (core/cmd Command/GEOADD args))


(defn HMGET [args]
  (core/cmd Command/HMGET args))


(defn BLPOP [args]
  (core/cmd Command/BLPOP args))


(defn ZDIFF [args]
  (core/cmd Command/ZDIFF args))


(defn KEYS [args]
  (core/cmd Command/KEYS args))


(defn MULTI [args]
  (core/cmd Command/MULTI args))


(defn AUTH [args]
  (core/cmd Command/AUTH args))


(defn SCRIPT [args]
  (core/cmd Command/SCRIPT args))


(defn ASKING [args]
  (core/cmd Command/ASKING args))


(defn LPUSHX [args]
  (core/cmd Command/LPUSHX args))


(defn TTL [args]
  (core/cmd Command/TTL args))


(defn ZREVRANGE [args]
  (core/cmd Command/ZREVRANGE args))


(defn PFCOUNT [args]
  (core/cmd Command/PFCOUNT args))


(defn BITOP [args]
  (core/cmd Command/BITOP args))


(defn SLOWLOG [args]
  (core/cmd Command/SLOWLOG args))


(defn HSETNX [args]
  (core/cmd Command/HSETNX args))


(defn PSYNC [args]
  (core/cmd Command/PSYNC args))


(defn BZPOPMAX [args]
  (core/cmd Command/BZPOPMAX args))


(defn HDEL [args]
  (core/cmd Command/HDEL args))


(defn XINFO [args]
  (core/cmd Command/XINFO args))


(defn SDIFFSTORE [args]
  (core/cmd Command/SDIFFSTORE args))


(defn SUNIONSTORE [args]
  (core/cmd Command/SUNIONSTORE args))


(defn LINSERT [args]
  (core/cmd Command/LINSERT args))


(defn SELECT [args]
  (core/cmd Command/SELECT args))


(defn EXEC [args]
  (core/cmd Command/EXEC args))


(defn SENTINEL [args]
  (core/cmd Command/SENTINEL args))


(defn INFO [args]
  (core/cmd Command/INFO args))


(defn OBJECT [args]
  (core/cmd Command/OBJECT args))


(defn BITPOS [args]
  (core/cmd Command/BITPOS args))


(defn ZREVRANGEBYSCORE [args]
  (core/cmd Command/ZREVRANGEBYSCORE args))


(defn ZUNIONSTORE [args]
  (core/cmd Command/ZUNIONSTORE args))


(defn SETRANGE [args]
  (core/cmd Command/SETRANGE args))


(defn GET [args]
  (core/cmd Command/GET args))


(defn PEXPIRE [args]
  (core/cmd Command/PEXPIRE args))


(defn SLAVEOF [args]
  (core/cmd Command/SLAVEOF args))


(defn HOST [args]
  (core/cmd Command/HOST args))


(defn XAUTOCLAIM [args]
  (core/cmd Command/XAUTOCLAIM args))


(defn INCR [args]
  (core/cmd Command/INCR args))


(defn DECR [args]
  (core/cmd Command/DECR args))


(defn SINTER [args]
  (core/cmd Command/SINTER args))


(defn HGETALL [args]
  (core/cmd Command/HGETALL args))


(defn STRLEN [args]
  (core/cmd Command/STRLEN args))


(defn PUNSUBSCRIBE [args]
  (core/cmd Command/PUNSUBSCRIBE args))


(defn SET [args]
  (core/cmd Command/SET args))


(defn ZRANK [args]
  (core/cmd Command/ZRANK args))


(defn ZCARD [args]
  (core/cmd Command/ZCARD args))


(defn FLUSHALL [args]
  (core/cmd Command/FLUSHALL args))


(defn ZINTERSTORE [args]
  (core/cmd Command/ZINTERSTORE args))


(defn UNLINK [args]
  (core/cmd Command/UNLINK args))


(defn GETEX [args]
  (core/cmd Command/GETEX args))


(defn PSETEX [args]
  (core/cmd Command/PSETEX args))


(defn ZDIFFSTORE [args]
  (core/cmd Command/ZDIFFSTORE args))


(defn ZREM [args]
  (core/cmd Command/ZREM args))


(defn DECRBY [args]
  (core/cmd Command/DECRBY args))


(defn GEOSEARCHSTORE [args]
  (core/cmd Command/GEOSEARCHSTORE args))


(defn SWAPDB [args]
  (core/cmd Command/SWAPDB args))


(defn HLEN [args]
  (core/cmd Command/HLEN args))


(defn LATENCY [args]
  (core/cmd Command/LATENCY args))


(defn RANDOMKEY [args]
  (core/cmd Command/RANDOMKEY args))


(defn ZPOPMIN [args]
  (core/cmd Command/ZPOPMIN args))


(defn XDEL [args]
  (core/cmd Command/XDEL args))


(defn SETEX [args]
  (core/cmd Command/SETEX args))


(defn LOLWUT [args]
  (core/cmd Command/LOLWUT args))


(defn HSCAN [args]
  (core/cmd Command/HSCAN args))


(defn TIME [args]
  (core/cmd Command/TIME args))


(defn ZRANDMEMBER [args]
  (core/cmd Command/ZRANDMEMBER args))


(defn XTRIM [args]
  (core/cmd Command/XTRIM args))


(defn SISMEMBER [args]
  (core/cmd Command/SISMEMBER args))


(defn SADD [args]
  (core/cmd Command/SADD args))


(defn PFDEBUG [args]
  (core/cmd Command/PFDEBUG args))


(defn MOVE [args]
  (core/cmd Command/MOVE args))


(defn WATCH [args]
  (core/cmd Command/WATCH args))


(defn HKEYS [args]
  (core/cmd Command/HKEYS args))


(defn PEXPIREAT [args]
  (core/cmd Command/PEXPIREAT args))


(defn CLIENT [args]
  (core/cmd Command/CLIENT args))


(defn MGET [args]
  (core/cmd Command/MGET args))


(defn LINDEX [args]
  (core/cmd Command/LINDEX args))


(defn SUBSCRIBE [args]
  (core/cmd Command/SUBSCRIBE args))


(defn TOUCH [args]
  (core/cmd Command/TOUCH args))


(defn POST [args]
  (core/cmd Command/POST args))


(defn LLEN [args]
  (core/cmd Command/LLEN args))


(defn PSUBSCRIBE [args]
  (core/cmd Command/PSUBSCRIBE args))


(defn MSET [args]
  (core/cmd Command/MSET args))


(defn ZREVRANK [args]
  (core/cmd Command/ZREVRANK args))


(defn SCARD [args]
  (core/cmd Command/SCARD args))


(defn COPY [args]
  (core/cmd Command/COPY args))


(defn GEOHASH [args]
  (core/cmd Command/GEOHASH args))


(defn REPLICAOF [args]
  (core/cmd Command/REPLICAOF args))


(defn RESET [args]
  (core/cmd Command/RESET args))


(defn MODULE [args]
  (core/cmd Command/MODULE args))


(defn ZUNION [args]
  (core/cmd Command/ZUNION args))


(defn RPOPLPUSH [args]
  (core/cmd Command/RPOPLPUSH args))


(defn MSETNX [args]
  (core/cmd Command/MSETNX args))


(defn SAVE [args]
  (core/cmd Command/SAVE args))


(defn HELLO [args]
  (core/cmd Command/HELLO args))


(defn PTTL [args]
  (core/cmd Command/PTTL args))


(defn GEOSEARCH [args]
  (core/cmd Command/GEOSEARCH args))


(defn EXPIREAT [args]
  (core/cmd Command/EXPIREAT args))


(defn SMOVE [args]
  (core/cmd Command/SMOVE args))


(defn CONFIG [args]
  (core/cmd Command/CONFIG args))


(defn ZREVRANGEBYLEX [args]
  (core/cmd Command/ZREVRANGEBYLEX args))


(defn SETNX
  [args]
  (core/cmd Command/SETNX args))
