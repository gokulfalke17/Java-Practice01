package gf.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test24_Iterator_Rules {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		
		Iterator<Object> itr = al.iterator();
		//System.out.println(itr.next());
	//Rule #1: we can not call next() method on empty collection on empty location,
					//it leads RE : NoSuchElementException
		
		al.add("a");
		Iterator<Object> itr2 = al.iterator();
		System.out.println(itr2.next());	//a
//		System.out.println(itr2.next());	//RE : NoSuchElementException
		
	//Rule #2: after modifying collection, we can not continue 
					//the same cursor object, it leads RE : CurrentModificationExcepiton
		
		al.add(5);
//		System.out.println(itr.next());	//RE : CurrentModificationException
		
	//Rule #3: without calling next() method we can not call remove() method
					//also we can not all more then one next() method
		System.out.println(al);  	//[a, 5]
		Iterator<Object> itr3 = al.iterator();
		itr3.next();
		itr3.remove();
//		itr3.remove();		//RE : IllegalStateException 
		System.out.println(al);	//[5]
			
		
	}
}
