package gf.collection;

import java.util.ArrayList;

public class Test28_forEach_Method {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
		
//		for(Object obj : al) {			//explicit insertion
//			System.out.println(obj);		
//		}
//		System.out.println();
		
		//functional programming with OOP by using Lambda Expression
		al.forEach(obj ->System.out.println(obj));	//implicit insertion
		System.out.println();
		
		al.forEach(obj -> {
			if(obj instanceof String s) {
				System.out.println(s.toUpperCase());
			}else {
				System.out.println(obj);
			}
		});
		
	}
}
/*
interface Iterable<T> {
	public default void forEach(Iterable this, Consume<T> c) {
		Collection c = (Collection).this;
		Iterator<T> itr = c.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
*/