package company.programming.test;

public class pattern06 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			int k = (i-1)*10+1;
			
			for(int j=1; j<=10; j++) {
				if(j<=5) {
					System.out.print((k++)+" ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
