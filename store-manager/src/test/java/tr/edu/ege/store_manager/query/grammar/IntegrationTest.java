package tr.edu.ege.store_manager.query.grammar;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryParser;

public class IntegrationTest {
	private final String QUERY_MONGO_REDIS_NEO4j = "SELECT doc.movieId, keyval.imdbId, graph.userId, graph.value, graph.timestamp FROM {"
			+ "<sub>'{'title':\"Fight Club (1999)\"}'</sub>#mongodb AS doc," + "<sub>'2959'</sub>#redis AS keyval,"
			+ "<sub>'MATCH (n1:User)-[r:TAGGED]->(n2:Movie) WHERE n2.movieId='2959' RETURN n1.userId as userId, r.value as value, r.timestamp as timestamp'</sub>#neo4j AS graph"
			+ "}";
	private final String QUERY_MONGO_REDIS = "SELECT doc.title, keyval.imdbId FROM {"
			+ "<sub>'{'movieId':3}'</sub>#mongodb AS doc, "
			+ "<sub>'3'</sub>#redis AS keyval"
			+ "}";
	@Test
	public void queryIntegrated() throws Exception {
		QueryParser parser = new QueryParser(QUERY_MONGO_REDIS_NEO4j);
		parser.parse();
	}
	@Test
	public void queryMongoRedis() throws Exception {
		QueryParser parser = new QueryParser(QUERY_MONGO_REDIS);
		parser.parse();
	}
}
