package gf.practice02;
/*
1 2 3 4 5 6
 2 3 4 5 6 
  3 4 5 6  
   4 5 6   
    5 6    
     6     
    5 6    
   4 5 6   
  3 4 5 6  
 2 3 4 5 6 
1 2 3 4 5 6

*/

public class pattern02 {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		for(int i=1; i<=11; i++) {
			int k = i;
			int l = 12-i;
			for(int j=1; j<=11; j++) {
				if(i<=10/2+1) {
					if(j>=i && j<=12-i && flag) {
						System.out.print(k++);
						flag = false;
					}else {
						System.out.print(" ");
						flag = true;
					}
				}else {
					if(j>=12-i && j<=i && flag) {
						System.out.print(l++);
						flag = false;
					}else {
						System.out.print(" ");
						flag = true;
					}
				}
			}
			System.out.println();
		}
	}
}
