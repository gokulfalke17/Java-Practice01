package gf.practice04_;

public class Pattern07_PascaleTriangle {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			int num = 1;
			for(int j=0; j<=i; j++) {
				if(j==0) {
					for(int k=0; k<5-i-1; k++) {
						System.out.print(" ");
					}
				}
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
