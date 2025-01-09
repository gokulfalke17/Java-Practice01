package gf.practice04_;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Programming";
				     //gnimmargorP
		
		System.out.println("Original String is :: "+ str);
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("Reverse String is :: "+ rev);
	}
}
