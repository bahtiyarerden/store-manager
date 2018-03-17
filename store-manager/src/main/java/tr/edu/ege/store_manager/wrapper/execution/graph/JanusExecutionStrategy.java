package tr.edu.ege.store_manager.wrapper.execution.graph;

import org.janusgraph.core.JanusGraph;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.interfaces.JanusStore;

public class JanusExecutionStrategy extends ExecutionStrategy {

	@Override
	public String execute(String query) {
		JanusStore store = JanusStore.getInstance();
		JanusGraph graph = store.getGraph();
		

		return null;
	}

}
