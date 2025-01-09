/*

* * * * * * * *  
 * * * * * * *   
  * * * * * *    
   * * * * *     
    * * * *      
     * * *       
      * *        
       *   
  
*/

package gf.pattern;

public class Test03_pattern03 {

	public static void main(String[] args) {
		
		boolean flag = true;
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=17;j++) {
				if(j>=i && j<=16-i && flag) {
					System.out.print("*");
					flag = false;
				}else {
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println();
		}

	}

}
