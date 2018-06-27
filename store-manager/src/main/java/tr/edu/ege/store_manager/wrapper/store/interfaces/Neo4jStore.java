package tr.edu.ege.store_manager.wrapper.store.interfaces;

import java.io.File;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;

public class Neo4jStore implements AutoCloseable {
	public String DATABASE_URI = "bolt://localhost:7687/MovieDB";
	private static Neo4jStore store;
	private final Driver driver;

	private Neo4jStore() {
		driver = GraphDatabase.driver(DATABASE_URI, AuthTokens.none());
	}

	public static Neo4jStore getInstance() {
		if (store == null) {
			store = new Neo4jStore();
		}
		return store;
	}

	public Driver getDriver() {
		return getInstance().driver;
	}

	@Override
	public void close() throws Exception {
		driver.close();
	}

}
