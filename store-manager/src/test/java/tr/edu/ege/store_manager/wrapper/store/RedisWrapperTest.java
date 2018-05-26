package tr.edu.ege.store_manager.wrapper.store;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tr.edu.ege.store_manager.mediator.query.decomposition.QueryAssignment;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.store.WrapperFactory;
import tr.edu.ege.store_manager.wrapper.store.Wrappers;
import tr.edu.ege.store_manager.wrapper.store.keyvalue.RedisWrapper;

public class RedisWrapperTest {
	@Test
	public void creation() throws Exception {
		AbstractWrapper wrapper = WrapperFactory.create(Wrappers.Redis);
		assertNotNull(wrapper);
		assertTrue(wrapper instanceof RedisWrapper);
	}

	@Test
	public void execution() throws Exception {
		AbstractWrapper wrapper = WrapperFactory.create(Wrappers.Redis);

		List<String> variables = new ArrayList<String>();
		variables.add("imdbId");
		QueryAssignment assignment = new QueryAssignment();
		assignment.setQuery("671");
		assignment.setResultColumns(variables);

		String result = wrapper.executeTransform(assignment);
		assertEquals("Transformed Redis Result", result);
	}

}
