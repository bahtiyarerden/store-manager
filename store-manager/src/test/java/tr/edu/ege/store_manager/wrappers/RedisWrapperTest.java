package tr.edu.ege.store_manager.wrappers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tr.edu.ege.store_manager.wrappers.keyvalue.RedisWrapper;

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
		String sampleMovieId = "671";
		String result = wrapper.executeTransform(sampleMovieId);
		assertEquals("Transformed Redis Result", result);
	}

	@Test
	public void stringToModelTransformation() throws Exception {

	}
}
