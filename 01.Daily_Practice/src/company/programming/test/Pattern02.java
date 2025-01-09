package company.programming.test;

/*
Input : n=17
 
1 2 3 4 5 * * * * *
11 12 13 14 15 * *
*/

public class Pattern02 {

	public static void main(String[] args) {

		int num = 17;
		int k = 1;
		for (int i = 1; i <= 10 && i<=num; i++) {
			if (k <= 5) {
				System.out.print(k + " ");
				k++;
			} else {
				System.out.print("* ");
			}	
		}
		
	}
}
