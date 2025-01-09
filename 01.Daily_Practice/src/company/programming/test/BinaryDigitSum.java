package company.programming.test;

public class BinaryDigitSum {
	
	public static void main(String[] args) {
		int binary = 1101;
		int sum = 0;
		
		while(binary!=0) {
			int rem = binary%10;
			sum = sum+rem;
			binary = binary/10;
		}
		
		System.out.println(sum);
	}
}
