/*

1        
210       
31118      
4121925     
513202631    
61421273236   
7152228333740  
816232934384143 
91724303539424445
  
*/
package gf.pattern;

public class Test05_pattern05 {

	public static void main(String[] args) {		
		
		for (int i = 1; i <= 9; i++) {
			int l = 8;
			int k = i;
			for (int j = 1; j <= 9; j++) {
				if (j <= i) {
					System.out.print(k);
					k = k + l--;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
