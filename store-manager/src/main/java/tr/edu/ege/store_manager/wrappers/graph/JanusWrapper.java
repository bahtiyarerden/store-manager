package tr.edu.ege.store_manager.wrappers.graph;

import tr.edu.ege.store_manager.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.execution.graph.JanusExecutionStrategy;
import tr.edu.ege.store_manager.transformation.TransformerStrategy;
import tr.edu.ege.store_manager.transformation.graph.JanusTransformerStrategy;
import tr.edu.ege.store_manager.wrappers.AbstractWrapper;

public class JanusWrapper extends AbstractWrapper {

	public JanusWrapper() {
		this(new JanusExecutionStrategy(), new JanusTransformerStrategy());
	}

	private JanusWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
