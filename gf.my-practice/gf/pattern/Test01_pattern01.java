
/*

*       
**      
***     
****    
*****   
******  
******* 
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

public class Test01_pattern01 {

	public static void main(String[] args) {
	
		for(int i=1;i<=15;i++) {
			for(int j=1;j<=8;j++) {
				if(j<=i && j<=16-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
