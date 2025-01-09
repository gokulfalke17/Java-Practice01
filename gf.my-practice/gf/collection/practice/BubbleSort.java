package gf.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(30, 50, 89, 64, 38, 19, 20, 50, 47));
		System.out.println("List is : "+ list);
		System.out.println();
		
		for(int i=0; i<list.size()-1; i++) {
			for(int j = 0; j<list.size()-i-1; j++) {
				
				if(list.get(j) > list.get(j+1) ) {
					int temp = list.get(j);
					list.set(j, list.get(j+1)); 
					list.set(j+1, temp);
				}
			}
		}
		
		System.out.println("Sorted List is : ");
		System.out.println(list);
	}
}
