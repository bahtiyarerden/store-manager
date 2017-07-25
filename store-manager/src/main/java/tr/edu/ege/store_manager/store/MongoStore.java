package tr.edu.ege.store_manager.store;

import com.mongodb.MongoClient;

public class MongoStore {
	private static MongoStore store;
	private MongoClient mongoClient;

	private MongoStore() {
		mongoClient = new MongoClient();
	}

	public static MongoStore getInstance() {
		if (store == null) {
			store = new MongoStore();
		}
		return store;
	}

	public MongoClient getMongoClient() {
		return mongoClient;
	}

}
