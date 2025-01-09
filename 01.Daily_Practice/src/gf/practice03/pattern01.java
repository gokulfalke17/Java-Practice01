package gf.practice03;

/*
 
1                  1
12                21
123              321
1234            4321
12345          54321
123456        654321
1234567      7654321
12345678    87654321
123456789  987654321
1234567891010987654321

*/

public class pattern01 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			int k=1;
			for(int j=1; j<=20; j++) {
				
				if(j<=i || j>=21-i) {
					if(j<=10) {
						System.out.print(k++);
					}else {
						System.out.print(--k);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
