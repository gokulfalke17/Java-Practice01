package company.programming.test;

/*
For e.g Input: Engineering
Output: e3n3g2i2r1
*/

public class OccurrenceOfEachCharacter {
	
	public static void main(String[] args) {
			
		String str = "Engineering".toLowerCase(); 
					 //e3n3g2i2r1
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch!='0') {
				int count = 1;
				
				for(int j=i+1; j<str.length(); j++) {
					if(str.charAt(j)==ch) {
						count++;
						str = str.substring(0, j)+ '0'+ str.substring(j+1);
					}
				}
				System.out.print(ch+""+count);
			}
			
		}
		
		
		
	}
}
