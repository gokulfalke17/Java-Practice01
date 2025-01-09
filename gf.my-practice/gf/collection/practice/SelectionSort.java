package gf.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(30, 50, 89, 64, 38, 19, 20, 50, 47));
		System.out.println("List is : ");
		System.out.println(list);
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			int minIndex = i;
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(j) < list.get(minIndex)) {
					minIndex = j;
				}
			}
			
			int temp = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, temp);
		}
		
		System.out.println("Sorted List is : "+ list);
	}
}
