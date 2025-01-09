package gf.practice04_;

public class ReverseStringWord {
	
	public static void main(String[] args) {
		
		String str = "Good Morning";
					 //gninroM dooG
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse Word is :: ");
		System.out.println(rev);
	}
}
