package gf.string;

public class Test02_countVowels {

	public static void main(String[] args) {
		
		String str = "Good Morning India";
		int count = 0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				count++;
			}
		}
		System.out.println("String Vowels Count :: "+count); 
	}

}
