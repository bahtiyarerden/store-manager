package tr.edu.ege.store_manager.transformation.document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.util.JSON;

import tr.edu.ege.store_manager.MovieVocabulary;
import tr.edu.ege.store_manager.Utils;
import tr.edu.ege.store_manager.transformation.TransformerStrategy;

public class MongoDBTransformerStrategy extends TransformerStrategy {

	@Override
	public String transform(String result) {
		BasicDBList list = (BasicDBList) JSON.parse(result);
		Model model = ModelFactory.createDefaultModel();
		for (Object object : list) {
			BasicDBObject document = (BasicDBObject) object;

			/*
			 * This code block get properties dynamically from schema.
			 */

			// String schemaStr = Utils.readSchema("document_schema.json");
			// BasicDBObject schema = (BasicDBObject) JSON.parse(schemaStr);
			// Set<Entry<String, Object>> entrySet = schema.entrySet();
			// for (Entry<String, Object> entry : entrySet) {
			// System.out.println(entry.getKey());
			// }
			ObjectId objectId = document.getObjectId("_id");
			String movieId = document.getString("movieId");
			String title = document.getString("title");
			String genreText = document.getString("genres");

			String[] genres = genreText.split("\\|");

			model.add(createStatement(objectId, movieId, MovieVocabulary.MOVIE_ID_PRP_URI, XSDDatatype.XSDint));
			model.add(createStatement(objectId, title, MovieVocabulary.MOVIE_TITLE_PRP_URI, XSDDatatype.XSDstring));
			for (String genre : genres) {
				model.add(createStatement(objectId, genre, MovieVocabulary.MOVIE_GENRE_PRP_URI, XSDDatatype.XSDstring));
			}

		}
		StringWriter writer = new StringWriter();
		RDFDataMgr.write(writer, model, RDFFormat.RDFJSON);
		return writer.toString();
	}

	private Statement createStatement(ObjectId objectId, Object objectVal, String prpUri, XSDDatatype datatype) {
		return ResourceFactory.createStatement(
				ResourceFactory.createResource(MovieVocabulary.MOVIE_RSC_BASE_URI + objectId.toString()),
				ResourceFactory.createProperty(prpUri),
				ResourceFactory.createTypedLiteral(String.valueOf(objectVal), datatype));
	}

}
