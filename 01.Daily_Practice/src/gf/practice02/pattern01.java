package gf.practice02;

public class pattern01 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			
			for(int j=1; j<=11; j++) {
				if(j>=7-i && j<=5+i) {
					System.out.print("*");
				}else {
					System.out.print(" "); 
				}
			}
			System.out.println();
		}
	}
}
