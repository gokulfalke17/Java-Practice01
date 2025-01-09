package com.org.practice_;

/*
Q3.Java Program to Count Vowels and Consonants in a String

Example:
 Input: "Hello World"
 Output: Vowels: 3, Consonants: 7
*/

public class CountVowelsConsonents {

	public static void main(String[] args) {

		String str = "Hello World";

		int vCount = 0;
		int cCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' && str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'O') {

				vCount++;
			} else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {

				cCount++;
			}
		}

		System.out.println("No. of Vowels :: " + vCount);
		System.out.println("No. of Consonents :: " + cCount);

	}
}
