package tr.edu.ege.store_manager.wrapper.execution.keyvalue;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import redis.clients.jedis.Jedis;
import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.interfaces.RedisStore;

public class RedisExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String key) {
		Jedis jedis = RedisStore.getInstance().getJedis();
		List<String> values = jedis.lrange(key, 0, Integer.MAX_VALUE);
		JsonObject resultObj = new JsonObject();
		resultObj.addProperty("key", key);
		JsonArray valueArr = new JsonArray();
		for (String value : values) {
			valueArr.add(value);
		}
		resultObj.add("values", valueArr);
		
		return resultObj.toString();
	}

}
