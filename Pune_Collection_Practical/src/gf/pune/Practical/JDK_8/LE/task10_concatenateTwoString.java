package gf.pune.Practical.JDK_8.LE;

//10. Write a Java program to implement a lambda expression to concatenate two strings.

interface Concatenate {
	String concatenateString(String s1, String s2);
}
public class task10_concatenateTwoString {
	
	public static void main(String[] args) {
		
		/*Concatenate concat = new Concatenate() {
			@Override
			public String concatenateString(String s1, String s2) {
				String s3 = "";
				s3 = s1.concat(s2);
				return s3;	
			}
		};
		
		String str1 = "Gokul ";
		String str2 = "Falke";
		System.out.println(concat.concatenateString(str1, str2));*/
		
			Concatenate concat = (String s1, String s2)->{
				String s3 = "";
				return  s3 = s1.concat(s2);
			};
			System.out.println(concat.concatenateString("Gokul ", "Falke"));
		
		
	}
}
