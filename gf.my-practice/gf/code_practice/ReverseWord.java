package gf.code_practice;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String str = "The Java Programming";
					//ehT avaJ gnimmargorP
		System.out.println("String is :: \n"+ str);
		
		char ch[] = str.toCharArray();
		int start = 0;
		int end = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(ch[i]==' ') {
				end = i-1;
				while(start < end) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				start = i+1;
			}
		}
		
		//for last world
		
		end = str.length()-1;
		while(start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		String s = new String(ch);
		System.out.println();
		
		System.out.println("Reverse Words In String :: \n"+ s);
	}
}
