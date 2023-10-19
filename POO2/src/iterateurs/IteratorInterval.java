package iterateurs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterval<T> implements Iterator<T>{
	
	private Iterator<T> iterateur_elements;
	
	public IteratorInterval(ArrayList<T> elements) {
		this.iterateur_elements = elements.iterator();
	}

	@Override
	public boolean hasNext() {
		return this.iterateur_elements.hasNext();
	}

	@Override
	public T next() {
		return this.iterateur_elements.next();
	}

}
