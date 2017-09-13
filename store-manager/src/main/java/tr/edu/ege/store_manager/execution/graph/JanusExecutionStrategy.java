package tr.edu.ege.store_manager.execution.graph;

import org.janusgraph.core.JanusGraph;

import tr.edu.ege.store_manager.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.store.JanusStore;

public class JanusExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String query) {
		JanusStore store = JanusStore.getInstance();
		JanusGraph graph = store.getGraph();
		

		return null;
	}

}
