package tr.edu.ege.store_manager.transformation.document;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.bson.Document;
import org.bson.types.ObjectId;

import tr.edu.ege.store_manager.transformation.TransformerStrategy;

public class MongoDBTransformerStrategy extends TransformerStrategy {

	@Override
	public String transform(String result) {
		Document document = Document.parse(result);
		ObjectId objectId = document.getObjectId("_id");
		int movieId = document.getInteger("movieId");
		String title = document.getString("title");
		String genres = document.getString("genres");
		System.out.println(objectId.toString());
		Model model = ModelFactory.createDefaultModel();
		return result;
	}

}
