package gf.practice03;

/*
4. Find All Subsequences of a String
Generate all subsequences of a given string.

Example:
Input: "abc"
Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]
*/

public class SubSequencesString {

	public static void main(String[] args) {

		String str = "abc";
		String subSeq = "\"\"";

		System.out.print(subSeq+" ");
		for (int i = 0; i < str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				subSeq = str.substring(i, j+1);
				System.out.print("\""+subSeq+"\""+" ");
			}
		}
	}
}
