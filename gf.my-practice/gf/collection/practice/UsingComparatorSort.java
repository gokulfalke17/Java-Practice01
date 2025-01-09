package gf.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparatorSort {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(30, 50, 89, 64, 38, 19, 20, 50, 47));
		System.out.println("List is : ");
		System.err.println(list);
		System.out.println();
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) { 
				return i1.compareTo(i2);
			}
			
		});
		
		System.out.println("Sorted List : "+ list);
		
	}
}
