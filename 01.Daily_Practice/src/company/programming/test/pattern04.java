package company.programming.test;

/*
1 2 3 4 5 * * * * * 
11 12 13 14 15 * * * * * 
21 22 23 24 25 * * * * * 
31 32 33 34 35 * * * * * 
41 42 43 44 45 * * * * * 
51 52 53 54 55 * * * * * 
61 62 63 64 65 * * * * * 
71 72 73 74 75 * * * * * 
81 82 83 84 85 * * * * * 
91 92 93 94 95 * * * * * 
*/

public class pattern04 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10; i++) {
			
			int k = (i-1)*10+1;
			
			for(int j=0; j<10; j++) {
				if(j<5) {
					System.out.print(k+" ");
					k++;
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}