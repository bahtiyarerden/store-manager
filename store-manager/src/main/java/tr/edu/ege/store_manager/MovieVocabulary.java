package tr.edu.ege.store_manager;

import com.google.gson.JsonElement;

public class MovieVocabulary {

	private static final String RESOURCE_PATTERN = "resource#";
	private static final String BASE_URI = "http://bigdata.ege.edu.tr/multistore/movie/";
	public static final String MOVIE_RSC_BASE_URI = BASE_URI + RESOURCE_PATTERN;
	public static final String MOVIE_ONT_BASE_URI = "http://bigdata.ege.edu.tr/multistore/ontology#";
	public static final String MOVIE_ID_PRP_URI = MOVIE_ONT_BASE_URI + "id";
	public static final String MOVIE_TITLE_PRP_URI = MOVIE_ONT_BASE_URI + "title";
	public static final String MOVIE_GENRE_PRP_URI = MOVIE_ONT_BASE_URI + "genre";
	public static final String IMDB_RSC_BASE_URI = BASE_URI + "imdb/" + RESOURCE_PATTERN;
	public static final String TMDB_RSC_BASE_URI = BASE_URI + "tmdb/" + RESOURCE_PATTERN;
	public static final String MOVIE_TYPE_RSC_URI = MOVIE_ONT_BASE_URI + "movie";
	public static final String IMDB_TYPE_RSC_URI = MOVIE_ONT_BASE_URI + "imdb";
	public static final String TMDB_TYPE_RSC_URI = MOVIE_ONT_BASE_URI + "tmdb";
}
