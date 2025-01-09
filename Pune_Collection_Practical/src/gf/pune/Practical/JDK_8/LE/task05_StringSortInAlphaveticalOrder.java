package gf.pune.Practical.JDK_8.LE;

//5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class task05_StringSortInAlphaveticalOrder {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(
				Arrays.asList("Rahul", "Yeshraj", "Sanket", "Ganesh", "Avishakr", "Gokul", "Karan", "Shivam", "Ram"));
		System.out.println("String List is : " + list);
		System.out.println();

		/*list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
			
		});
		System.out.println("Sorted List : "+ list);*/
		
		list.sort((str1, str2)->str1.compareTo(str2));
		System.out.println("Sorted List : "+ list);

	}
}
