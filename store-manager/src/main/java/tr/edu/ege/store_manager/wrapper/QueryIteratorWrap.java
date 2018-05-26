package tr.edu.ege.store_manager.wrapper;

import java.util.Iterator;
import java.util.List;

import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.sparql.engine.binding.Binding;
import org.apache.jena.sparql.engine.iterator.QueryIteratorBase;
import org.apache.jena.sparql.serializer.SerializationContext;

public class QueryIteratorWrap extends QueryIteratorBase {

	private Iterator<Binding> bindingIter;

	public QueryIteratorWrap(List<Binding> bindingList) {
		super();
		this.bindingIter = bindingList.iterator();
	}

	@Override
	public void output(IndentedWriter out, SerializationContext sCxt) {
		out.print(this.getClass().getSimpleName());
	}

	@Override
	protected boolean hasNextBinding() {
		return bindingIter.hasNext();
	}

	@Override
	protected Binding moveToNextBinding() {
		return bindingIter.next();
	}

	@Override
	protected void closeIterator() {
		bindingIter = null;
	}

	@Override
	protected void requestCancel() {
	}

}
