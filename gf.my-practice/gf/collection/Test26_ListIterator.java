package gf.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test26_ListIterator {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
		System.out.println(al);
		System.out.println();
		
		Iterator<Object> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		System.out.println("Forward Direction :");
		ListIterator<Object> litr = al.listIterator();
		while(litr.hasNext()) {
			Object obj = litr.next();
			System.out.print(obj+" ");
		}
		System.out.println();
		
		System.out.println("Backward Direction :");
		while(litr.hasPrevious()) {
			Object obj = litr.previous();
			System.out.print(obj+" ");
		}
		System.out.println();
		
		while(litr.hasNext()) {
			Object obj = litr.next();
			if(obj instanceof String s) {
				System.out.println(s.toUpperCase());	//replacing
			}else if(obj instanceof Integer ) {
				litr.add(20);	//inserting
			}
		}
		System.out.println(al);
	}
}
