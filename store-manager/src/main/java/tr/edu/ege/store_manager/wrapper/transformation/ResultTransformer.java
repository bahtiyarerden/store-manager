package tr.edu.ege.store_manager.wrapper.transformation;

import java.util.List;

public class ResultTransformer {

	private TransformerStrategy strategy;

	public ResultTransformer(TransformerStrategy strategy) {
		this.strategy = strategy;
	}

	public String transform(String result, List<String> variables) {
		return this.strategy.transform(result, variables);
	}

}
