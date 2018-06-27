package tr.edu.ege.store_manager.wrapper.execution.graph;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;
import org.neo4j.driver.v1.TransactionWork;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.interfaces.Neo4jStore;

public class Neo4jExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String query) {
		JsonArray resultArr = new JsonArray();
		try {
			Driver driver = Neo4jStore.getInstance().getDriver();
			try (Session session = driver.session()) {
				StatementResult results = session.writeTransaction(new TransactionWork<StatementResult>() {

					@Override
					public StatementResult execute(Transaction tx) {
						StatementResult result = tx.run(query);
						return result;
					}

				});
				Gson gson = new GsonBuilder().disableHtmlEscaping().create();
				while (results.hasNext()) {
					Record record = results.next();
					resultArr.add(gson.toJsonTree(record.asMap()));

				}
			}
			Neo4jStore.getInstance().close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultArr.toString();
	}

}
