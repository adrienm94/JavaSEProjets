package iterateurs;

import java.util.Iterator;

public class MergeIteratorInterval<T> implements Iterator<T>{
	
	private Iterator<T> it1;
	private Iterator<T> it2;

	public MergeIteratorInterval(Iterator<T> it1, Iterator<T> it2) {
		this.it1 = it1;
		this.it2 = it2;
	}

	@Override
	public boolean hasNext() {
		if (this.it1.hasNext()) {
//			System.out.println("it1-true");
			return true;
		} else if (this.it2.hasNext()) {
//			System.out.println("it2-true");
			return true;
		} else {
//			System.out.println("false");
			return false;
		}
	}

	@Override
	public T next() {
		if (this.it1.hasNext()) {
//			System.out.println("it1");
			return this.it1.next();
		} else {
//			System.out.println("it2");
			return this.it2.next();
		}
	}
	
}
