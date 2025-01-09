package gf.practice01;

public class StringOccurrenceEachCharacter {
	
	public static void main(String[] args) {
		
		String str = "good morning india";
		System.out.println("String is : "+ str);
		
		char ch[] = str.toCharArray();
		int len[] = new int[ch.length];
		
		for(int i=0; i<ch.length; i++) {
			len[i] = '\0';
		}
		
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			if(ch[i]!='\0') {
				for(int j=i+1; j<ch.length; j++) {
					if(ch[i] == ch[j]) {
						count++;
						ch[j] = '\0';
					}
					
				}
				len[i] = count;
			}
		}
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!='\0' && ch[i]!=' ') {
				System.out.println(ch[i]+" --> "+ len[i]);
			}
		}
	}
}
