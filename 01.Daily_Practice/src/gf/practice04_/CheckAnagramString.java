package gf.practice04_;

import java.util.Arrays;

public class CheckAnagramString {
	
	public static boolean checkAnagram(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2); 
		
		return Arrays.equals(ch1, ch2);
		
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		
		boolean flag = checkAnagram(str1, str2);
		if(flag) {
			System.out.println("Is Anagram String...");
		}else {
			System.out.println("Is Not Anagram String.");
		}
	}

}
