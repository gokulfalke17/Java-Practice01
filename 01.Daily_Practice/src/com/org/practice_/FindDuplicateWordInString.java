package com.org.practice_;

/*
Q1.Java Program to Find Duplicate Words in a String

Example:
 Input: "This is a test . This test is easy."
 Output: Duplicate words: This, is, test
 
*/
public class FindDuplicateWordInString {

	public static void main(String[] args) {
		
		String str = "This is a test . This test is easy.";
		String word[] = str.toLowerCase().split(" ");
		System.out.println("String is :: "+str);
		System.out.println();
		boolean flag[] = new boolean[word.length];
		
		int count = 0;
		System.out.println("Duplicate Words :: ");
		for(int i=0; i<word.length; i++) {
			if(!flag[i]) {
				count = 1;
				for(int j=i+1; j<word.length; j++) {
					if(word[i].equals(word[j]) ) {
						count++;
						flag[j] = true;
 					}
				}
				
				if(count > 1) {
					System.out.println(word[i]);
					flag[i] = true;
				}
			}
		}
	}
}