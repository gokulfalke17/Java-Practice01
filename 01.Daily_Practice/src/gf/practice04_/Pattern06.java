package gf.practice04_;
/*

1
23
456
78910

*/
public class Pattern06 {
	
	public static void main(String[] args) {
		int k = 1;
		for(int i=1; i<=4; i++ ) {
			for(int j=1; j<=4; j++) {
				if(j<=i) {
					System.out.print(k++);
					
				}
				
			}
			System.out.println();
		}
	}
}
