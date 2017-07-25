package tr.edu.ege.store_manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Serializer {
	private static Gson gson = new GsonBuilder().serializeNulls().create();

	public static byte[] toBinary(Object arg0) {
		return gson.toJson(arg0).getBytes();
	}

	public static Object fromBinary(byte[] arg0, Class<?> arg1) {
		return gson.fromJson(new String(arg0), arg1);
	}
}
