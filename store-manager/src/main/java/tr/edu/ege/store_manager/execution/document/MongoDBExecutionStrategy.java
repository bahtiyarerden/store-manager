package tr.edu.ege.store_manager.execution.document;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import tr.edu.ege.store_manager.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.store.MongoStore;

public class MongoDBExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String query) {
		MongoClient client = MongoStore.getInstance().getMongoClient();
		MongoDatabase database = client.getDatabase("moviedata");
		MongoCollection<Document> collection = database.getCollection("movies");

		Document queryObject = Document.parse(query);
		Document first = collection.find(queryObject).first();
		return first.toJson();
	}

}
