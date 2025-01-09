package com.org.practice_;

/*
Q6.Java Program to Reverse Each Word of a String

Example:
Original String: Java is great and fun
String with each word reversed: avaJ si taerg dna nuf
*/


public class ReverseEachWords {
	
	public static void main(String[] args) {
		String str = "Java is great and fun";
		
		char ch[] = str.toCharArray();
		int end = 0;
		int start = 0;
		for(int i=0; i<str.length(); i++) {
			if(ch[i]==' ') {
				end = i-1;
				while(start<end) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				start = i+1;
			}
		}
		
		end = str.length()-1;
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		String s = new String(ch);
		System.out.println(s);
	}
}
