package gf.practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByName {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("abc", "xyz", "mno", "sss", "pqr", "stv", "tuv"));
		System.out.println("List is : ");
		for(String str : list)
			System.out.println(str);
		
		Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1); 
			}
		};
		
		list.sort(com);
		
		System.out.println("\nSorted List is : ");
		for(String str : list) 
			System.out.println(str);
	}
}
