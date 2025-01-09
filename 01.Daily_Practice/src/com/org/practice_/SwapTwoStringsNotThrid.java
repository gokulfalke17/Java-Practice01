package com.org.practice_;

//Q10.How to swap two Strings without using a third variable?

public class SwapTwoStringsNotThrid {

	public static void main(String[] args) {
		
		String str1 = "good";
		String str2 = "morning";
		
		System.out.println("Before Swapping :: ");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		//System.out.println(str2);	//good
		
		str1 = str1.substring(str2.length());
		//System.out.println(str1);	//morning
		
		System.out.println("After Swapping :: ");
		System.out.println(str1);
		System.out.println(str2);
	}

	
}
