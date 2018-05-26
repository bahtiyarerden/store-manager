package tr.edu.ege.store_manager.wrapper.store;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.junit.Test;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.wrapper.MovieVocabulary;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.store.WrapperFactory;
import tr.edu.ege.store_manager.wrapper.store.Wrappers;
import tr.edu.ege.store_manager.wrapper.store.document.MongoDBWrapper;

public class MongoDBWrapperTest {

	@Test
	public void creation() throws Exception {
		AbstractWrapper wrapper = WrapperFactory.create(Wrappers.MongoDB);
		assertNotNull(wrapper);
		assertTrue(wrapper instanceof MongoDBWrapper);
	}

	@Test
	public void execution() throws Exception {
		AbstractWrapper wrapper = WrapperFactory.create(Wrappers.MongoDB);
		List<String> variables = new ArrayList<String>();
		variables.add("movieId");
		variables.add("genres");
		QueryAssignment assignment = new QueryAssignment();
		assignment.setQuery("{\"title\" : \"Casino (1995)\"}");
		assignment.setResultColumns(variables);
		String result = wrapper.executeTransform(assignment);
		assertEquals("Transformed MongoDB Result", result);
	}

}
