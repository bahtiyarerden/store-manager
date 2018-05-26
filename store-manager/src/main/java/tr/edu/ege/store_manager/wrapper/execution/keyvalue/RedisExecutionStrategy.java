package tr.edu.ege.store_manager.wrapper.execution.keyvalue;

import com.google.gson.JsonObject;

import redis.clients.jedis.Jedis;
import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.interfaces.RedisStore;

public class RedisExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String key) {
		Jedis jedis = RedisStore.getInstance().getJedis();
		String value = jedis.get(key);
		JsonObject resultObj = new JsonObject();
		resultObj.addProperty("key", key);
		resultObj.addProperty("value", value);
		return resultObj.toString();
	}

}
