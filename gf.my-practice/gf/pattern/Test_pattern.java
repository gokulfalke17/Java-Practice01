package gf.pattern;

public class Test_pattern {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			int k = 1;
			int l=2;
			for(int j=1;j<=5; j++) {
				if(i<=10/2) {
					if(j<=i) {
						System.out.print(k++);
						k  = k+1;
					}else {
						System.out.print(" ");
					}
				}else {
					if(j<=10-i) {
						System.out.print(l++);
						l = l+1;
					}else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
	}
}

//5 5
//6 4
//7 3
//8 2
//9 1
