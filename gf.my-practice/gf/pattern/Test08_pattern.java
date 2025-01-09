package gf.pattern;


public class Test08_pattern {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=13;i++) {
			for(int j=1;j<=14;j++) {
				if(i<=13/2+1) {
						if(j>=8-i && j<=6+i) {
							System.out.print("*");
						}else {
							if(j<=i-6 ) {
								System.out.print("*");
							}else {
								System.out.print(" ");
							}
							System.out.print(" ");
						}
				}
			}
			System.out.println();
		}
		
		
	}
}
