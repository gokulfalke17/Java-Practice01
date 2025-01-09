package gf.pune.Practical.collection;

import java.util.LinkedList;

public class Task25_CopyOneLLtoAnotherLinkedList {
	public static void main(String[] args) {
		LinkedList<Object> ll1 = new LinkedList<>();
		ll1.add(10);
		ll1.add("A");
		ll1.add("B");
		ll1.add("C");
		ll1.add(20);
		ll1.add(30);
		System.out.println("Before Copied List : ");
		System.out.println(ll1);
		
		LinkedList<Object> ll2 = new LinkedList<>();
		ll2 = ll1;
		System.out.println("After Copied List : ");
		System.out.println(ll2);
	}
}
