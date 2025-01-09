package gf.practice04_;

public class CheckPalindromeNumber {
	
	public static boolean checkPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		return temp==num;
	}
	
	public static void main(String[] args) {
		
		int num = 121;
		boolean flag = checkPalindrome(num);
		if(flag) {
			System.out.println(num+" Is Palindrome Number...");
		}else {
			System.out.println(num+" Is Not Palindrome Number.");
		}
	}

}
