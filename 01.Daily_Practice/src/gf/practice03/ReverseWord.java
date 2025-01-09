package gf.practice03;

/*
1. Reverse Words in a String
Write a function to reverse the order of words in a string without reversing the individual words.

Example:
Input: "Hello World"
Output: "World Hello"
*/

public class ReverseWord {
		
	public static void main(String[] args) {
		String str = "hello World";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		char ch[] = rev.toCharArray();
		
		int start = 0;
		int end = 0;
		for(int i=0; i<rev.length(); i++) {
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
		
		end = rev.length()-1; 
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
