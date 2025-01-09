package gf.pune.Practical.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task24_SwapLinkedList {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		LinkedList<Object> ll = new LinkedList<>();
		ll.add(10);
		ll.add("A");
		ll.add(20);
		ll.add("B");
		ll.add(30);
		System.out.println("List is : ");
		System.out.println(ll);
		
//		Collections.swap(ll, 0, 1);
//		System.out.println("After Swapping List : ");
//		System.out.println(ll);
//		System.out.println();
		
		System.out.println("Enter Index for Swapping");
		System.out.println("First Index : ");
		int first = scn.nextInt();
		System.out.println("Second Index : ");
		int second = scn.nextInt();
		
		for(int i=0; i<ll.size(); i++) {
			if(first > 0 && first < ll.size() || second > 0 && second < ll.size()) {
				Object temp = ll.get(first);
				ll.set(first, ll.get(second));
				ll.set(second, temp);
			}else {
				System.out.println("Invalid Index...");
				break;
			}			
		}
		System.out.println("After Swapping Elements In List :: ");
		System.out.println(ll);
		
	}
}
