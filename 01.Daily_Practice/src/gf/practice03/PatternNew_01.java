package gf.practice03;

public class PatternNew_01 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			int l=i;
			for(int j=1; j<=9; j++) {
				if(i<=5) {
					if(j<=i*2-1) {
						if(j%2==0) {
							System.out.print("*");
						}else {
							System.out.print(l);
						}
					}else {
						System.out.print(" ");
					}
				}else {
					int k = 10-i+1;
					if(j<=k*2-1) {
						if(j%2==0) {
							System.out.print("*");
						}else {
							System.out.print(k++);
						}
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
