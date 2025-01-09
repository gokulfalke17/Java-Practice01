package gf.string;

public class Test01_checkPalindrome {

	public static void main(String[] args) {
		
		String str = "racer";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
				
		if(str.equals(rev) ) {
			System.out.println("Is Palindrome String");
		}else {
			System.out.println("Is Not Palindrome String");
		}
		
	}

}
