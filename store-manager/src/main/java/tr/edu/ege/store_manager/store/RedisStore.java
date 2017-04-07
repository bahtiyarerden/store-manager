package tr.edu.ege.store_manager.store;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisStore {
	private JedisPool jedisPool;

	private static RedisStore instance;

	private RedisStore() {
		super();
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(128);
		jedisPool = new JedisPool(config, "127.0.0.1", 6379);
		// JEDIS.select(0);
	}

	public void deleteRedisStore() {
		jedisPool.getResource().flushAll();
	}

	public static RedisStore getInstance() {
		if (instance == null) {
			instance = new RedisStore();
		}
		return instance;
	}

	public void insertList(String key, String... vals) {
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.lpush(key, vals);
		}
	}

	public long getDBSize(int dbNumber) {
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.select(dbNumber);
			return jedis.dbSize();
		}
	}

	public Jedis getJedis() {
		try (Jedis jedis = jedisPool.getResource()) {
			return jedis;
		}
	}

}
