package gf.practice02;

import java.util.Arrays;

public class CheckAnagram {
	
	public static void main(String[] args) {
		
		String str1 = "anuj";
		String str2 = "juna";
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//System.out.println(Arrays.equals(ch1, ch2));
		
		boolean check = Arrays.equals(ch1, ch2);
		if(check) {
			System.out.println("Is Anagram");
		}else {
			System.out.println("Is Not Anagram...");
		}
	}
}
