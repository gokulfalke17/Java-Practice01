package com.org.practice_;

/*
Q2.Java Program to Count Occurrences of Words in a String

Example:
 Input: "This is a test . This test is easy."
 Output: This: 2, is: 2, a: 1, test: 2, easy: 1
*/
public class CountOccurrenceOfWord {
	
	public static void main(String[] args) {
		
		String str = "This is a test . This test is easy.";
		String word[] = str.toLowerCase().split(" ");
		boolean flag[] = new boolean[word.length];
		
		for(int i=0; i<word.length; i++) {
			if(flag[i]) {
				continue;
			}
			int count = 1;
			for(int j=i+1; j<word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
					flag[j] = true;
				}
			}
			
			if(count > 0) {
				System.out.println(word[i]+" --> "+ count);
				flag[i] = true;
			}
		}
		
	}
}
