package tr.edu.ege.store_manager.wrapper.execution.document;

import org.bson.Document;

import com.mongodb.BasicDBList;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.interfaces.MongoStore;

public class MongoDBExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String query) {
		MongoClient client = MongoStore.getInstance().getMongoClient();
		MongoDatabase database = client.getDatabase("moviedata");
		MongoCollection<Document> collection = database.getCollection("movies");

		Document queryObject = Document.parse(query);
		FindIterable<Document> documents = collection.find(queryObject);
		BasicDBList list = new BasicDBList();

		for (Document doc : documents) {
			list.add(doc);
		}
		return JSON.serialize(list);
	}

}
