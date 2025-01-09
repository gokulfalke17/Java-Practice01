package gf.practice04_;

public class ReverseNumber {
	
	
	public static void reverse(int num) {
		//getting logic of reverse number
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("Reverse Number is :: "+ rev);
	}
	
	public static void main(String[] args) {
		
		int num = 12345;
		reverse(num);
		
	}
}
