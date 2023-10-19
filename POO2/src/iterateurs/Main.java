package iterateurs;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval<Integer> i1 = new Interval<>(-10, 5);
		Interval<Integer> i2 = new Interval<>(0, 20);
		
		i1.remplirListe();
		System.out.println(i1);
		i2.remplirListe();
		System.out.println(i2);
		
//		for (Integer i : i1){
//			System.out.println(i);
//		}

		
		Iterator<Integer> it1 = i1.iterator();
		Iterator<Integer> it2 = i2.iterator();
		
		MergeIteratorInterval<Integer> mit = new MergeIteratorInterval<>(it1, it2);
		
		while (mit.hasNext()) {
			System.out.println(mit.next());
		}
		
		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
	}

}
