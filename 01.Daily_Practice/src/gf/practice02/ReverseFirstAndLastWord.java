package gf.practice02;

public class ReverseFirstAndLastWord {
	
public static void main(String[] args) {
		
		
		String str = "java is awesome because of coding";
		
		String split[] = str.split(" ");
		
		if(split.length > 1) {
			String temp = split[0];
			split[0] = split[split.length-1];
			split[split.length-1] = temp;
		}
		
		//String first_last = String.join(" ", split);
		
		//without join() method
		String first_last = "";
		for (int i = 0; i < split.length; i++) {
			first_last += split[i];
			if (i < split.length - 1) {
				first_last += " "; 
			}
		}
		
		
		System.out.println("Before Reverse First and Last Word  :: "+ str);		
		System.out.println("After Reverse First and Last Word :: "+ first_last);	
	}
}
