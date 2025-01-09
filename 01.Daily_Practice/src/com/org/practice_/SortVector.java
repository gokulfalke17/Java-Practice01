package com.org.practice_;

import java.util.Collections;
import java.util.Vector;

/*Q. WAP to create Vector and store 5 integer values in it and sort it using Collections.sort() method
  and without using Collections.sort() method */

public class SortVector {
	
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<Integer>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		
		Collections.sort(list);
		System.out.println("Sorted List Using Collections.sort() method :: ");
		System.out.print(list+" ");
		System.out.println();
		
		Vector<Integer> list2 = new Vector<Integer>(list);
		list2.addAll(list);
		
		for(int i=0;i<list2.size(); i++) {
			for(int j=0; j<list2.size()-1-i; j++) {
				if(list2.get(j) > list2.get(j+1)) {
					int temp = list2.get(j);
					list2.set(j, list2.get(j+1));
					list2.set(j+1, temp); 
				}
			}
		}
		System.out.println();
		
		System.out.println("Sorted List Without sort() method :: ");
		System.out.print(list+" ");
		
		
	}
}	
