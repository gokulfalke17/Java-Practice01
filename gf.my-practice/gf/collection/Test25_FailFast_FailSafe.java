package gf.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test25_FailFast_FailSafe {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
		
		System.out.println(al);
		
		Iterator<Object> itr = al.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		al.add("x");
		System.out.println(al);
		System.out.println();
		
//		System.out.println(itr.next()); 	//RE : CurrentModificationException
		CopyOnWriteArrayList<Object> cal = new CopyOnWriteArrayList<Object>();
		cal.add("a1");
		cal.add(41);
		cal.add("b1");
		System.out.println(cal);
		
		Iterator<Object> itr2 = cal.iterator();
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		
		cal.add(51);
		cal.add("c1");
		cal.add(61);
		System.out.println(cal);
		
		System.out.println(itr2.next());
//		System.out.println(itr2.next());//RE : NoSuchElementFound
	}
}
