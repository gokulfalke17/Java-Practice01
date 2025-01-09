package gf.pune.Practical.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Task23_GetFirstAndListOccurrenceOfSpecificIndex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(20);
		ll.add(30);
		ll.add(10);
		ll.add(20);
		ll.add(10);
		ll.add(60);
		System.out.println("List is ");
		System.out.println(ll);
		
		System.out.println("Enter Element :: ");
		int element = scn.nextInt();
		
		for(int i=0;i<ll.size(); i++) {
			if(ll.get(i).equals(element)) {
				System.out.println("First Occurrence of Index ::"+ i);
				break;
			}
		}
		int index = -1;
		for(int i=0;i<ll.size(); i++) {
			if(ll.get(i).equals(element)) {
				index = i;
			}
		}
		if(index !=-1) {
			System.out.println("Last occurrence of Index ::"+ index);
		}else {
			System.out.println("Element Not Found...");
		}
		
	}
}
	