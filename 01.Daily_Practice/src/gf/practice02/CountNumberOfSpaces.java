package gf.practice02;

public class CountNumberOfSpaces {
	
	public static void main(String[] args) {
		
		String str = " java is very good ";
		
		
		int count = 1;
		for(int i=0; i<str.length(); i++) {
			if (i == str.length()-1 || str.charAt(i)!=' ') {
				continue;
			}else {
				count++; 
			}
		}
		
		System.out.println("Number of Space count :: "+ count);
	}
}	

