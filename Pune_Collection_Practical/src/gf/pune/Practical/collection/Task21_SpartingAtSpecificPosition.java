package gf.pune.Practical.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Task21_SpartingAtSpecificPosition {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println("LinkedList is :: ");
		for(Object obj : ll) {
			System.out.print(obj+" ");
		}
		System.out.println();
		
		System.out.println("Enter Position for Insert Element :: ");
		int index = scn.nextInt();
		
		System.out.println("Enter Element for Insert :: ");
		Object element = scn.next();
		
		if(index >=0 && index <= ll.size()) {
			ll.add(index, element);
			System.out.println("Element Inserted Successfully...");
		}else {
			System.out.println("Invalid Index...");
		}
		
		System.out.println("After Inserting Element at Given Position :: ");
		System.out.println(ll);
	}
}
