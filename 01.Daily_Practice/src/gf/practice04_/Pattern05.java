package gf.practice04_;
/*

1
12
123
1234

*/
public class Pattern05 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++ ) {
			int k = 1;
			for(int j=1; j<=4; j++) {
				if(j<=i) {
					System.out.print(k++);
				}
			}
			System.out.println();
		}
	}
}
