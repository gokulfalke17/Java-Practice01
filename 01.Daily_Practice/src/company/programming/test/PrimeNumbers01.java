package company.programming.test;

public class PrimeNumbers01 {
	
	public static void main(String[] args) {
		
		int num = 20;
		
		System.out.println("Prime Numbers are :: ");
		for(int i=2; i<=num; i++) {
			boolean flag = false;
			
			for(int j=2; j<i; j++) {
				if(i%2==0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
//==========================================================================
		System.out.println("------------------------\n");
		
		int n = 11;
		boolean flag = false;
		if(n>2) {
			for(int i=2; i<n; i++) {
				if(n%2==0) {
					flag = true;
					break;
				}
			}
		}else {
			flag = true;
		}
		
		if(!flag) {
			System.out.println(n+" :: Is Prime Number...");
		}else {
			System.out.println(n+" :: Is Not Prime Number.!");
		}
	}
}
