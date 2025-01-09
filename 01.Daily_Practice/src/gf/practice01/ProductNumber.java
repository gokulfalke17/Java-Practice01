package gf.practice01;

public class ProductNumber {
	
	public static void main(String[] args) {
		
		int num = 34;
		int product = 1;
		if(num == 0) {
			product = 0;
		}else {
			while(num > 0) {
				int rem = num%10;
				product = product*rem;
				num = num/10;
			}
		}
		System.out.println("Product Number is : "+ product);
	}
}
