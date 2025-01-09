package company.programming.test;

public class checkNumberAndStringPalindromeOrNot {
	
	public static void main(String[] args) {
		
		int num = 121;
		
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		if(temp==rev) {
			System.out.println(temp+ " Number is Palindrome...");
		}else {
			System.out.println(temp+" Number is Not Palindrome.");
		}
		System.out.println("----------------------------------------------");
		
//=========================================================================================================================
		
		String str = "madam";
		
		String temp1 = str;
		
		String rev1 = "";
		
		for(int i=0; i<str.length(); i++) {
			rev1 = rev1+str.charAt(i);
		}
		
		if(temp1.equals(rev1)) {
			System.out.println(temp1+" String is Palindrome...");
		}else {
			System.out.println(temp1+" String is Not Palindrome.");
		}
		
		
	}
}
