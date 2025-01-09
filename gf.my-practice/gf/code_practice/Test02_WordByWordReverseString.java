package gf.code_practice;
class WordReverse {
	
	public String reverseWord(String str) {
		char ch[] = str.toCharArray();
		int start = 0;
		int end = 0;
		for(int i=0;i<str.length();i++) {
			if(ch[i] == ' ') {
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
		
		
		//for last word reverse logic
		end = ch.length-1;
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		String s = new String(ch);
		return s;
	}
}
public class Test02_WordByWordReverseString {
	
	public static void main(String[] args) {
		
		String str = "welcome to girish tech";
		WordReverse wr = new WordReverse();
		String reverse = wr.reverseWord(str);
		
		System.out.println(reverse);
	}
}
