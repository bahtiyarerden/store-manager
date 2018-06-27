package tr.edu.ege.store_manager.wrapper.store.graph;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.execution.graph.Neo4jExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;
import tr.edu.ege.store_manager.wrapper.transformation.graph.Neo4jTransformerStrategy;

public class Neo4jWrapper extends AbstractWrapper {
	public Neo4jWrapper() {
		this(new Neo4jExecutionStrategy(), new Neo4jTransformerStrategy());
	}

	private Neo4jWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
