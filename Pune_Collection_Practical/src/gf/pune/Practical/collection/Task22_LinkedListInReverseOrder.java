package gf.pune.Practical.collection;

import java.util.Collections;
import java.util.LinkedList;

public class Task22_LinkedListInReverseOrder {
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		ll.add("G");
		System.out.println("Before Reverse List is :");
		System.out.println(ll);
/*		
		//using Collections.reverse() method
		Collections.reverse(ll);
		System.out.println("After Reverse List :");
		System.out.println(ll);
*/		
		//manually
		int start = 0;
		int end = ll.size()-1;
		while(start < end) {
			Object temp = ll.get(start);
			ll.set(start, ll.get(end));
			ll.set(end, temp);
			start++;
			end--;
 		}
		
		System.out.println("After Reverse List :");
		System.out.println(ll);
	}
}
