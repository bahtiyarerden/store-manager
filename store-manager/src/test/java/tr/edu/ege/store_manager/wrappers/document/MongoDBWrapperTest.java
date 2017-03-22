package tr.edu.ege.store_manager.wrappers.document;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.ege.store_manager.wrappers.AbstractWrapper;
import tr.edu.ege.store_manager.wrappers.WrapperFactory;
import tr.edu.ege.store_manager.wrappers.Wrappers;

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
		String result = wrapper.executeTransform("{\"title\" : \"Casino (1995)\"}");
		assertEquals("Transformed MongoDB Result", result);
	}

}
