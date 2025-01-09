package gf.pune.Practical.JDK_8.LE;

//14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.

interface CheckString {
	void checkPalindrome(String str);
}
public class task14_PalindromeOrNotCheck {
	static String rev = "";
	public static void main(String[] args) {
		
		/*CheckString cs = new CheckString() {
			@Override
			public void checkPalindrome(String str) {
				String rev = new StringBuilder(str).reverse().toString();
				if(str.equals(rev))
					System.out.println("Is Palindrome");
				else 
					System.out.println("Is Not Palindrome...");
			}
		};
		cs.checkPalindrome("madam");
		cs.checkPalindrome("ram");*/
		
		/*CheckString cs = (String str)->{
0			String rev = new StringBuilder(str).reverse().toString();
				if(str.equals(rev)) System.out.println("Palindrome");
				else System.out.println("Not Palindrome");
			};
		cs.checkPalindrome("madam");*/
		
		CheckString cs =  str->System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome String":"Not Palindrome String");
		cs.checkPalindrome("madam");
		cs.checkPalindrome("good");
		
	}
}
