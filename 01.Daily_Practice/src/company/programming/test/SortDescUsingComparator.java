package company.programming.test;

import java.util.Arrays;
import java.util.Comparator;

public class SortDescUsingComparator {
	
	public static void main(String[] args) {
		
		String str[] = {"sachin", "saurabh", "samir", "sahsh"};
		//sort by desceding order...
		Arrays.sort(str, Comparator.reverseOrder());
		
		for(String s : str) {
			System.out.println(s);
		}
	}
}
