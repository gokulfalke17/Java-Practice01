package company.programming.test;

/*

5 4 3 2 1
D C B A
3 2 1
B A
1

*/
public class pattern03 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			int k = 5;
			for(int j=1; j<=5; j++) {
				if(j<=6-i) {
					System.out.print(k--);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
