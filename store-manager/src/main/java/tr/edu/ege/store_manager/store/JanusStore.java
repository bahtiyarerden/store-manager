package tr.edu.ege.store_manager.store;

import org.apache.tinkerpop.gremlin.groovy.engine.GremlinExecutor;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

public class JanusStore {

	private static JanusStore store;
	private JanusGraph graph;

	private JanusStore() {
		JanusGraphFactory.Builder build = JanusGraphFactory.build();
		build.set("storage.backend", "cassandra");
		build.set("storage.directory", "/Users/koekcomp/Desktop/Kişisel/janus-data");
		build.set("index.search.backend", "elasticsearch");
		graph = build.open();
	}

	public static JanusStore getInstance() {
		if (store == null) {
			store = new JanusStore();
		}
		return store;
	}

	public static JanusGraph getGraph() {
		return getInstance().graph;
	}

	public void close() {
		graph.close();
	}
}
