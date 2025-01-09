package gf.pune.Practical.JDK_8.LE;

//3. Write a Java program to implement a lambda expression to convert a list of strings to upper case and lower case.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface ConertLwrToUpr {
	void stringConverter(List<String> list);
}

public class task03_ConvertLwrUpr_LE {
	public static void main(String[] args) {
		
		/*ConertLwrToUpr converter = new ConertLwrToUpr() {
			
			@Override
			public void stringConverter(List<String> list) {
				for(String str : list) {
					System.out.println("Upper Case : "+ str.toUpperCase());
					System.out.println("Lower Case : "+ str.toLowerCase());
					System.out.println();
				}
			}
		};*/
		
		ConertLwrToUpr converter = (List<String> list)->{
			for(String str : list) {
				System.out.println("Upper Case : "+ str.toUpperCase());
				System.out.println("Lower Case : "+ str.toLowerCase());
				System.out.println();
			}
	};

		
		List<String> list = new ArrayList<String>(Arrays.asList("ram", "abc", "mno", "suresh", "ramesh", "rajesh"));
		converter.stringConverter(list);
		
	}
}
