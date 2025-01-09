package gf.pune.Practical.JDK_8.StreamAPI;

//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.

import java.util.Arrays;
import java.util.List;

public class task05_CountOfStartWithSpecificSharacterUsingStream {
	
	public static void main(String[] args) {
		
		List<String> list =  Arrays.asList("suresh", "ramesh", "rahul", "rajesh", "ganesh", "yeshraj", "sanket","sandeep");
		System.out.println("List is : \n"+ list);
		System.out.println();
		
		
		list.stream()
			.filter(val -> val.startsWith("s"))
			.forEach(val -> System.out.print(val+" "));
		System.out.println();
		
		
		long count = list.stream()
			.filter(val -> val.startsWith("s"))
			.count();
			
		System.out.println("Start with 's' count is :: "+ count);
		System.out.println();
	}
}
