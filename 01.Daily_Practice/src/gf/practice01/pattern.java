package gf.practice01;
/*

  0
  0 1
  0 0 3
  0 0 0 5
  0 0 0 0 7
  0 0 0 2
  0 0 4
  0 6
  0 
  
*/
public class pattern {
	public static void main(String[] args) {
		
		for(int i=1; i<=9 ;i++) {
			int k = 0;
			for(int j=1; j<=5; j++) {
				if(i<=9/2+1) {
					if(j<=i) {
						if(i==j) {
							System.out.print(k);						}
					}else {
						System.out.print(" ");
					}
				}else {
					if(j<=10-i) {
						System.out.print(k);
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
