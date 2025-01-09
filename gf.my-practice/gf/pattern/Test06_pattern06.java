/*

         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
  
*/

package gf.pattern;

public class Test06_pattern06 {
	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			for(int j = 1;j<=10;j++) {
				if(j>=11-i && j>=i-9) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
