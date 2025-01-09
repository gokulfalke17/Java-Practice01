package company.programming.test;

/*
2
4 4
6 6 6
8 8 8 8
*/

public class pattern05 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4;j++) {
				
				if(j<=i) {
					System.out.print((i+i)+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
