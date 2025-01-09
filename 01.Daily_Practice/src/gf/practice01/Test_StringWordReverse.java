package gf.practice01;

public class Test_StringWordReverse {
	public static String wordReverse(String str) {
		String rev = " ";
		String split[] = str.split(" ");
		
		for(int i=split.length-1; i>=0; i--) {
			rev = rev+split[i]+" ";
		}
		return rev;
	}
	public static void main(String[] args) {
		
		String str = "How are you?";
		String rev = wordReverse(str);
		
		System.out.println("String is : "+ str);
		System.out.println("Reverse Word String : "+ rev);
	}
}
