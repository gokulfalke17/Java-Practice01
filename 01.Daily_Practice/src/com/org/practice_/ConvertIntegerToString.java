package com.org.practice_;

/*
Q8.Java Convert Integer to String Example
Example:
Integer value: 123
String value: 123
*/

public class ConvertIntegerToString {

	public static void main(String[] args) {
		
		Integer i = 12345;
		
		//converting integer value to string... (in 3 ways)
		String str1 = i.toString();
		System.out.println(str1);
		System.out.println();
		
		String str2 = String.valueOf(i);
		System.out.println(str2);
		System.out.println();
		
		String str3 = i+"";
		System.out.println(str3);
	}
}
