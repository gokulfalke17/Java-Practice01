package gf.code_practice;

public class Test_ReverseString {
	public static void main(String[] args) {
		String str = "welcome to girish tech hub";
					//emoclew ot hsirig hcet buh
		
//		String reverse = new StringBuilder(str).reverse().toString();
//		System.out.println("Reverse String is :"+ reverse);

		char ch[] = str.toCharArray();
		int start = 0;
		int end = 0;
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
		
		//for last word
		end = str.length()-1;
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
			
		}
		
		String s = new String(ch);
		
		System.out.println("Reverse String is :"+s);
		
		
		
	}
}
