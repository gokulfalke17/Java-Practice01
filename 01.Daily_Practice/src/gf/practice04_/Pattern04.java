package gf.practice04_;

/*

  *  
 *** 
*****
 *** 
  *  

*/
public class Pattern04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= 4 - i && j <= 2 + i && j >= i - 2 && j <= 8 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
