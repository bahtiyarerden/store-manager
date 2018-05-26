package tr.edu.ege.store_manager.wrapper.transformation;

import java.util.List;

public abstract class TransformerStrategy {

	public abstract String transform(String result, List<String> variables);

}
