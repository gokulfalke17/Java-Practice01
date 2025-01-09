package company.programming.test;

public class Pattern08 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=11; i++) {
			for(int j=1; j<=11; j++) {
				if(i<=10/2) {
					if(j>=i && j<=10-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					
				}
			}
			System.out.println();
		}
	}
}
