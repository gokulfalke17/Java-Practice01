package gf.code_practice;

public class Test_ReverseSentence {

	public static String reverseSentence(String str) {
		
		String rev = "";
		for(int i=str.length()-1; i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		char ch[] = rev.toCharArray();
		int start = 0;
		int end = 0;
		
		for(int i=0;i<rev.length();i++) {
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
		
		end = rev.length()-1;
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
	
	public static void main(String[] args) {
		
		String str = "Gokul Falke";
		
		String sentence = reverseSentence(str);
		System.out.println(sentence);

	}

}
