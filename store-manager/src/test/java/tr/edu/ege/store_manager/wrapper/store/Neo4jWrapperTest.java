package tr.edu.ege.store_manager.wrapper.store;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;

public class Neo4jWrapperTest {
	public String query = "MATCH (n1:User)-[r:TAGGED]->(n2:Movie) WHERE n2.movieId=\"2959\"\n"
			+ "RETURN n1.userId as userId, r.value as value, r.timestamp as timestamp";

	@Test
	public void execution() throws Exception {
		AbstractWrapper wrapper = WrapperFactory.create(Wrappers.Neo4j);

		List<String> variables = new ArrayList<String>();
		variables.add("userId");
		variables.add("value");
		variables.add("timestamp");
		QueryAssignment assignment = new QueryAssignment();
		assignment.setQuery(query);
		assignment.setResultColumns(variables);

		String result = wrapper.executeTransform(assignment);
		System.out.println(result);
		assertEquals("Transformed Neo4j Result", result);
	}
}
