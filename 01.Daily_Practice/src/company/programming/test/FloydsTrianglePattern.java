package company.programming.test;

public class FloydsTrianglePattern {
	
	public static void main(String[] args) {
		int k = 1;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(j<=i) {
					System.out.print((k++)+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
