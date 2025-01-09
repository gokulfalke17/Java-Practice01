package com.org.practice_;

import java.util.Arrays;
import java.util.List;

//Q. WAP to create ArrayList and store 5 string values in it and find the string whose ends with sh and length more than 3 letter?

public class FindEndsWithSHInArrayList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ganesh", "raj", "suresh", "ysh", "ramesh", "msh");
		
		System.out.println("List Words Ends With SH and More then 3 Letters :: ");
		for(String str : list) {
			if(str.endsWith("sh") && str.length() > 3) {
				System.out.println(str);
			}
		}
	}
}
