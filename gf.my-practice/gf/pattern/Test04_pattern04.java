/*

        A        
       A B       
      A B C      
     A B C D     
    A B C D E    
   A B C D E F   
  A B C D E F G  
 A B C D E F G H 
A B C D E F G H I
  
*/
package gf.pattern;

public class Test04_pattern04 {

	public static void main(String[] args) {
		boolean flag = true;
		for(int i=1;i<=9;i++) {
			char ch = 'A';
			for(int j=1;j<=17;j++) {
				if(j>=10-i && j<=8+i && flag) {
					System.out.print(ch++);
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
