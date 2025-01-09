package gf.practice03;

/*
7. String Compression
Implement a method to perform basic string compression using the counts of repeated characters.

Example:
Input: "aaabbccccd"
Output: "a3b2c4d1"
*/

public class StringCompression {
	
	public static void main(String[] args) {
		
		String str = "aaabbccccd";
		
		String newString = "";
		int count = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				newString = newString+str.charAt(i)+count;
				count = 1;
			}
		}
		newString = newString+str.charAt((str.length())-1)+count;
		
		System.out.println("Compressed String :: "+ newString);
	}
}
