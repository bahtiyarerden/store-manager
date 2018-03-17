package tr.edu.ege.store_manager.wrapper.transformation.keyvalue;

import java.io.StringWriter;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import tr.edu.ege.store_manager.wrapper.MovieVocabulary;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;

public class RedisTransformationStrategy extends TransformerStrategy {

	@Override
	public String transform(String result) {
		JsonObject resultObject = new Gson().fromJson(result, JsonObject.class);
		String key = resultObject.get("key").getAsString();
		JsonArray jsonArray = resultObject.get("values").getAsJsonArray();
		Model model = ModelFactory.createDefaultModel();
		Resource localMovieRsc = ResourceFactory.createResource(MovieVocabulary.MOVIE_RSC_BASE_URI + key);
		model.add(createValueStatement(localMovieRsc, MovieVocabulary.MOVIE_ID_PRP_URI, key, XSDDatatype.XSDstring));
		model.add(createObjectStatement(localMovieRsc, RDF.type.getURI(),
				ResourceFactory.createResource(MovieVocabulary.MOVIE_TYPE_RSC_URI)));

		if (jsonArray.size() == 1) {
			addImdbRsc(jsonArray.get(0), model, localMovieRsc);

		}
		if (jsonArray.size() == 2) {
			addImdbRsc(jsonArray.get(1), model, localMovieRsc);
			addTmdbRsc(jsonArray.get(0), model, localMovieRsc);
		}
		StringWriter writer = new StringWriter();
		RDFDataMgr.write(writer, model, RDFFormat.RDFJSON);
		return writer.toString();
	}

	private void addTmdbRsc(JsonElement jsonElement, Model model, Resource localMovieRsc) {
		Resource tmdbMovieRsc = ResourceFactory
				.createResource(MovieVocabulary.TMDB_RSC_BASE_URI + jsonElement.getAsString());
		model.add(createValueStatement(tmdbMovieRsc, MovieVocabulary.MOVIE_ID_PRP_URI, jsonElement.getAsString(),
				XSDDatatype.XSDstring));
		model.add(createObjectStatement(localMovieRsc, OWL.sameAs.getURI(), tmdbMovieRsc));
		model.add(createObjectStatement(tmdbMovieRsc, RDF.type.getURI(),
				ResourceFactory.createResource(MovieVocabulary.TMDB_TYPE_RSC_URI)));
	}

	private void addImdbRsc(JsonElement jsonElement, Model model, Resource localMovieRsc) {
		Resource imdbMovieRsc = ResourceFactory
				.createResource(MovieVocabulary.IMDB_RSC_BASE_URI + jsonElement.getAsString());
		model.add(createObjectStatement(localMovieRsc, OWL.sameAs.getURI(), imdbMovieRsc));
		model.add(createValueStatement(imdbMovieRsc, MovieVocabulary.MOVIE_ID_PRP_URI, jsonElement.getAsString(),
				XSDDatatype.XSDstring));
		model.add(createObjectStatement(imdbMovieRsc, RDF.type.getURI(),
				ResourceFactory.createResource(MovieVocabulary.IMDB_TYPE_RSC_URI)));
	}

	private Statement createValueStatement(Resource rsc, String prpUri, Object objectVal, XSDDatatype datatype) {
		return createObjectStatement(rsc, prpUri,
				ResourceFactory.createTypedLiteral(String.valueOf(objectVal), datatype));
	}

	private Statement createObjectStatement(Resource rsc, String prpUri, RDFNode objectVal) {
		return ResourceFactory.createStatement(rsc, ResourceFactory.createProperty(prpUri), objectVal);
	}
}
