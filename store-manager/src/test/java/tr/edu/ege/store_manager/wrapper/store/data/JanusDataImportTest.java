package tr.edu.ege.store_manager.wrapper.store.data;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.tinkerpop.gremlin.process.traversal.Order;
import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.janusgraph.core.EdgeLabel;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphTransaction;
import org.janusgraph.core.Multiplicity;
import org.janusgraph.core.PropertyKey;
import org.janusgraph.core.schema.JanusGraphManagement;
import org.junit.Test;

import tr.edu.ege.store_manager.wrapper.store.interfaces.JanusStore;

public class JanusDataImportTest {
	private static final String RATINGS_FIRST_LINE_VALUE = "userId,movieId,rating,timestamp";
	private static final String TAGS_FIRST_LINE_VALUE = "userId,movieId,tag,timestamp";

	@Test
	public void importData() throws Exception {
		makeSchema();
		ClassLoader classLoader = this.getClass().getClassLoader();
		try (Stream<String> stream = Files.lines(Paths.get(classLoader.getResource("ratings.csv").getFile()))) {
			JanusGraphTransaction tx = JanusStore.getGraph().newTransaction();
			stream.forEach(str -> {
				if (str.equals(RATINGS_FIRST_LINE_VALUE))
					return; // only skips this iteration.
				String[] fields = str.split(",");
				assertNotNull(fields);
				assertTrue(fields.length == 4);
				Vertex user = tx.addVertex(T.label, "user", "userId", fields[0]);
				Vertex movie = tx.addVertex(T.label, "movie", "movieId", fields[1]);
				user.addEdge("rated", movie, "rate", fields[2], "timestamp", fields[3]);
			});
			tx.commit();
			tx.close();
		}
		try (Stream<String> stream = Files.lines(Paths.get(classLoader.getResource("tags.csv").getFile()))) {
			JanusGraphTransaction tx = JanusStore.getGraph().newTransaction();
			stream.forEach(str -> {
				if (str.equals(TAGS_FIRST_LINE_VALUE))
					return; // only skips this iteration.
				String[] fields = str.split(",");
				assertNotNull(fields);
				assertTrue(fields.length == 4);
				Vertex user = tx.addVertex(T.label, "user", "userId", fields[0]);

				Vertex movie = tx.addVertex(T.label, "movie", "movieId", fields[1]);
				String[] tags = fields[2].split(" ");
				user.addEdge("tagged", movie, "tag", tags, "timestamp", fields[3]);
			});
			tx.commit();
			tx.close();
		}
		JanusStore.getInstance().close();
	}

	private void makeSchema() {
		JanusGraph graph = JanusStore.getGraph();
		JanusGraphManagement mgm = graph.openManagement();

		// Vertex property
		PropertyKey userId = mgm.makePropertyKey("userId").dataType(Short.class).make();
		mgm.buildIndex("byUserIdComposite", Vertex.class).addKey(userId).buildCompositeIndex();

		PropertyKey movieId = mgm.makePropertyKey("movieId").dataType(Short.class).make();
		mgm.buildIndex("byMovieIdComposite", Vertex.class).addKey(movieId).buildCompositeIndex();

		// Edge property

		PropertyKey rateValue = mgm.makePropertyKey("rate").dataType(Double.class).make();
		PropertyKey timestamp = mgm.makePropertyKey("timestamp").dataType(Long.class).make();
		EdgeLabel rated = mgm.makeEdgeLabel("rated").signature(rateValue, timestamp).multiplicity(Multiplicity.ONE2ONE)
				.make();
		mgm.buildEdgeIndex(rated, "ratingByTime", Direction.OUT, Order.decr, timestamp);

		PropertyKey tagValue = mgm.makePropertyKey("tag").dataType(String[].class).make();
		EdgeLabel tag = mgm.makeEdgeLabel("tagged").signature(tagValue, timestamp).multiplicity(Multiplicity.ONE2MANY)
				.make();
		mgm.buildEdgeIndex(tag, "taggingByTime", Direction.OUT, Order.decr, timestamp);
		mgm.buildIndex("byTagMixed", Edge.class).addKey(tagValue).buildMixedIndex("search");

		mgm.makeVertexLabel("user").make();
		mgm.makeVertexLabel("movie").make();

		mgm.commit();
	}

	@Test
	public void testName() throws Exception {
		String tags = "halolo";
		String[] split = tags.split(" ");
		assertEquals(1, split.length);
		assertEquals(tags, split[0]);
	}
}
