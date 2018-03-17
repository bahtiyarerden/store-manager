package tr.edu.ege.store_manager.wrapper.store.graph;

import tr.edu.ege.store_manager.wrapper.execution.ExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.execution.graph.JanusExecutionStrategy;
import tr.edu.ege.store_manager.wrapper.store.AbstractWrapper;
import tr.edu.ege.store_manager.wrapper.transformation.TransformerStrategy;
import tr.edu.ege.store_manager.wrapper.transformation.graph.JanusTransformerStrategy;

public class JanusWrapper extends AbstractWrapper {

	public JanusWrapper() {
		this(new JanusExecutionStrategy(), new JanusTransformerStrategy());
	}

	private JanusWrapper(ExecutionStrategy eStrategy, TransformerStrategy tStrategy) {
		super(eStrategy, tStrategy);
	}

}
