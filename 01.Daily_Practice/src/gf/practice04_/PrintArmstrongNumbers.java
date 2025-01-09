package gf.practice04_;

public class PrintArmstrongNumbers {
	
public static void main(String[] args) {
		
		int limit = 100;
		System.out.println("Armstrong Numbers are : ");
		for(int i=1; i<=limit; i++) {
			int temp =i;
			int count = 0;
			while(i>0) {
				count++;
				i = i/10;
			}
			i = temp;
			int sum = 0;
			while(i>0) {
				int p = 1;
				int pow = 1;
				int rem = i%10;
				while(count>=p) {
					pow = pow*rem;
					p++;
				}
				sum = sum+pow;
				i = i/10;
			}
			i = temp;
			if(sum == i) {
				System.out.print(i+" ");
			}
			
		}
	}
}
