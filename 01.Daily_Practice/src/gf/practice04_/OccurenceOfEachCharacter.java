package gf.practice04_;

public class OccurenceOfEachCharacter {
	
	public static void main(String[] args) {
		String str = "programming";
		char[] ch = str.toCharArray();
		
		System.out.println("String is :: \n"+ str);
		System.out.println();
		
		System.out.println("Occurrence of Each Character is :: ");
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(ch[i]==ch[j]) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				for(int k=i+1; k<ch.length; k++) {
					if(ch[i]==ch[k]) {
						count++;
					}
				}
				System.out.println(ch[i]+"-->"+count);
			}
		}
		
		
	}
}
