package org.techhub.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		Scanner scn = new Scanner(System.in);
		int arr[] = {11, 22, 33, 44, 11, 22, 33, 22};
		
		System.out.println("Array Elements are :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for (int val : arr) {
			Integer count = map.get(val);
			if(count==null) {
				count = new Integer(0);
			}
			++count;
			map.put(val, count);
		}
		
		System.out.println("Display Duplicate Element Count :");
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for(Entry<Integer, Integer> m:set) {
			if(m.getValue() >= 1) {
				System.out.println(m.getKey()+"-->"+m.getValue());
			}
		}
	}
}
