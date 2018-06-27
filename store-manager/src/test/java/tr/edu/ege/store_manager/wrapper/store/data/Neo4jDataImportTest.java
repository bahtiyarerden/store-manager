package tr.edu.ege.store_manager.wrapper.store.data;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.Test;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.Transaction;
import org.neo4j.driver.v1.TransactionWork;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import tr.edu.ege.store_manager.wrapper.store.interfaces.Neo4jStore;

public class Neo4jDataImportTest {
	private static final String FIRST_LINE_VALUE_FOR_RATINGS = "userId,movieId,rating,timestamp";
	private static final String FIRST_LINE_VALUE_FOR_TAGS = "userId,movieId,tag,timestamp";

	@Test
	public void importTest() throws Exception {
		Neo4jStore neo4jInstance = Neo4jStore.getInstance();

		Driver driver = neo4jInstance.getDriver();

		ClassLoader classLoader = this.getClass().getClassLoader();
		// try (Stream<String> stream =
		// Files.lines(Paths.get(classLoader.getResource("ratings.csv").getFile()))) {
		// stream.forEach(str -> {
		// if (str.equals(FIRST_LINE_VALUE_FOR_RATINGS))
		// return; // only skips this iteration.
		// String[] fields = str.split(",");
		// assertNotNull(fields);
		// assertTrue(fields.length == 4);
		// try (Session session = driver.session()) {
		// session.writeTransaction(new TransactionWork<String>() {
		// @Override
		// public String execute(Transaction tx) {
		// String query = "CREATE (u:User {id: %s})-[:RATED {value: %s, timestamp:
		// %s}]->(m:Movie {id: %s})";
		//
		// tx.run(String.format(query, fields[0], fields[2], fields[3], fields[1]));
		// return null;
		// }
		// });
		// }
		// });
		// }

		try (Stream<String> stream = Files.lines(Paths.get(classLoader.getResource("tags.csv").getFile()))) {
			stream.forEach(str -> {
				if (str.equals(FIRST_LINE_VALUE_FOR_TAGS))
					return; // only skips this iteration.
				String[] fields = str.split(",");
				assertNotNull(fields);
				assertTrue(fields.length == 4);
				try (Session session = driver.session()) {
					session.writeTransaction(new TransactionWork<String>() {
						@Override
						public String execute(Transaction tx) {
							String user = String.format("MERGE (u:User {id:%s}) ", fields[0]);
							String movie = String.format("MERGE (m:Movie {id:%s}) ", fields[1]);
							String relation = String.format("MERGE (u)-[:TAGGED {value: \"%s\", timestamp: %s}]->(m)",
									fields[2], fields[3]);
							StringBuilder build = new StringBuilder();
							build.append(user).append(movie).append(relation);
							tx.run(build.toString());
							return null;
						}
					});
				}
			});
		}
		neo4jInstance.close();

	}
}
