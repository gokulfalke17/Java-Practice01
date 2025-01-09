package gf.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(30, 50, 89, 64, 38, 19, 20, 50, 47));
		System.out.println("List is : ");
		System.out.println(list);
		System.out.println();
		
		for(int i=1; i<list.size(); i++) {
			int key = list.get(i);
			int j = i-1;
			while(j>=0 && list.get(j) > key) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, key);
		}
		
		System.out.println("Sorted List is : "+ list);
	}
}
