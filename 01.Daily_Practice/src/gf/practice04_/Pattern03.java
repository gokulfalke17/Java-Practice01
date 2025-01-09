package gf.practice04_;
/*

   *
  ***
 *****

*/
public class Pattern03 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++ ) {
			for(int j=1; j<=5; j++) {
				if(j>=4-i && j<=2+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
