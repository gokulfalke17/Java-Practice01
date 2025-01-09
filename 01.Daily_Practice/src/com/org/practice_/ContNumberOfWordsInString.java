package com.org.practice_;

//Q9.Write a program to count number of words in a String?


public class ContNumberOfWordsInString {
	
	public static void main(String[] args) {
		
		String str = "   good      moring    india         tech      hub";
		
		boolean flag = false;
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				if(!flag) {
					count++;
				}
				flag = true;
			}else {
				flag = false;
			}
		}
		
		System.out.println(count);
	}
}
