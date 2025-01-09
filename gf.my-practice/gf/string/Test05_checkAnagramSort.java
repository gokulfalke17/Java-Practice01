package gf.string;

public class Test05_checkAnagramSort {

	public static void main(String[] args) {
		
		String s1 = "anuj";
		String s2 = "juna";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		for(int i = 0; i<s1.length();i++) {
			for(int j=0;j<s1.length();j++) {
				char temp = ch1[i];
				ch1[i] = ch1[j];
				ch1[j] = temp;
				
			}
		}
		
		String str1 = new String(ch1);
		System.out.println(str1);
		
		for(int i = 0; i<s2.length();i++) {
			for(int j=0;j<s2.length();j++) {
				char temp = ch2[i];
				ch2[i] = ch2[j];
				ch2[j] = temp;
				
			}
		}
		
		String str2 = new String(ch2);
		System.out.println(str2);

	}

}
