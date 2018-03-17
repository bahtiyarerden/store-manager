package tr.edu.ege.store_manager.wrapper.store.interfaces;

import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

public class JanusStore {

	private static final String DATA_PATH = "/Users/koekcomp/Desktop/Tez/janus-data";
	private static JanusStore store;
	private JanusGraph graph;

	private JanusStore() {
		JanusGraphFactory.Builder build = JanusGraphFactory.build();
		build.set("gremlin.graph", "org.janusgraph.core.JanusGraphFactory");

		build.set("storage.backend", "cassandra");
		build.set("storage.cassandra.keyspace", "jgex");
		build.set("storage.hostname", "127.0.0.1");
		build.set("storage.directory", DATA_PATH);

		build.set("index.jgex.backend", "elasticsearch");
		build.set("index.jgex.index-name", "jgex");
		build.set("index.jgex.hostname", "127.0.0.1");

		/*
		 * build.set("storage.backend", "cassandra");
		 * 
		 * build.set("index.search.backend", "elasticsearch");
		 */
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
