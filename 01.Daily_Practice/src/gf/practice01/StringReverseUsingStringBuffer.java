package gf.practice01;

public class StringReverseUsingStringBuffer {
	
	public static String reverseWord(String str) {
		String split[] = str.split(" "); 
		StringBuffer sb = new StringBuffer();
		for(int i=split.length-1; i>=0; i--) {
			sb.append(split[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		String str = "How Are You";
		System.out.println("String is :: \n"+ str);
		System.out.println();
		
		System.out.println("Reverse String Word is :: \n"+ reverseWord(str));
		
	}
}
