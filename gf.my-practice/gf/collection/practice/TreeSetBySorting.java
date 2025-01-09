package gf.collection.practice;

import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetBySorting {
	public static void main(String[] args) {
		System.out.println("Sorting Descending Order :");
		TreeSet<Integer> ts = new TreeSet<>(
								new Comparator<Integer>() {
								@Override
								public int compare(Integer i1, Integer i2) {
									
									return i2-i1;
								}
							});
		
		ts.add(10);
		ts.add(50);
		ts.add(20);
		ts.add(40);
		ts.add(30);
		System.out.println(ts);
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(40);
		list.add(10); 
		list.add(20);
		list.add(30);
		list.add(50);
		System.out.println("Before Sort...");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("After Sort...");
		System.out.println(list);
	}
}
