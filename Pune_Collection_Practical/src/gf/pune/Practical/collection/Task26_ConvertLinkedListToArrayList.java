package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task26_ConvertLinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("A");
		ll.add("B"); 
		ll.add("C");
		
		System.out.println("Before Converting LinkedList into ArrayList : ");
		System.out.println(ll);
		
		ArrayList<Object> al = new ArrayList<Object>(ll);
		System.out.println("After Converting LinkedList into ArrayList : ");
		System.out.println(al);
		
	}
}
