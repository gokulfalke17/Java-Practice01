package gf.practice01;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num = 1234;
		int temp = num;
		int rev = 0;
		while(num > 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("Number is : "+ temp);
		System.out.println("Reverse Number is : "+ rev);
		
	}
}	
