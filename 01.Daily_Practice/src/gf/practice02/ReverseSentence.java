package gf.practice02;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		
		String str = "java is awesome";
		
		String reverse = "";
		String split[] = str.split(" ");
		
		for(int i=split.length-1; i>=0; i--) {
			reverse = reverse+split[i]+" ";
		}
		
		System.out.println("Before Reverse Sentence :: "+ str);		//java is awesome
		System.out.println("After Reverse Sentence :: "+ reverse);	//awesome is java 
	}
}
