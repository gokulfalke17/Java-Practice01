
/*

1
121
12321
1234321
123454321
12345654321
1234567654321
123456787654321
12345678987654321 
  
*/

package gf.pattern;

public class Test02_pattern02 {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			int k=1;
			int m = 1;
			for(int j=1;j<=17;j++) {
				if(j<=i*2-1) {
					if(j<=i) {
						m = k;
						System.out.print(k++);
						
					}else {
						System.out.print(--m);
						
					}
				}
			}
			System.out.println();
		}

	}

}
