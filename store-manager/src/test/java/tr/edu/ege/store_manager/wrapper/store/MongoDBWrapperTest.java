package tr.edu.ege.store_manager.wrapper.store;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.junit.Test;

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
		String result = wrapper.executeTransform("{\"title\" : \"Casino (1995)\"}");
		assertEquals("Transformed MongoDB Result", result);
	}

	@Test
	public void string2ModelTransformation() throws Exception {
		AbstractWrapper wrapper = WrapperFactory.create(Wrappers.MongoDB);
		String result = wrapper.executeTransform("{\"title\" : \"Casino (1995)\"}");
		Model model = ModelFactory.createDefaultModel();
		RDFDataMgr.read(model, new ByteArrayInputStream(result.getBytes()), Lang.RDFJSON);
		assertTrue(model.contains(null, ResourceFactory.createProperty(MovieVocabulary.MOVIE_GENRE_PRP_URI)));
	}

}
