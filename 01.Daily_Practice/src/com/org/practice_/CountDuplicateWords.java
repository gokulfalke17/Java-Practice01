package com.org.practice_;

//Q4.Java program to Count the Number of Duplicate Words in a String

public class CountDuplicateWords {

	public static void main(String[] args) {

		String str = "Welcome to java , Java is good, Full stack java";

		String word[] = str.toLowerCase().split(" ");
		int count = 0;
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
				}
			}
		}
		System.out.println("No. of Duplicate Words : " + count);
	}
}
