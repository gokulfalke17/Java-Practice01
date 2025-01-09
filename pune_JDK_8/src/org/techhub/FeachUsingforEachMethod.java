package org.techhub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FeachUsingforEachMethod {
	
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<String>(Arrays.asList("Suresh", "Ramesh", "Rajsh", "Rahul", "Ram", "Shyam"));
		
		System.out.println("String List is : ");
		/*Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		list.forEach(cons);*/
		
		/*Consumer<String> cons = (String t)->{
				System.out.println(t);
			};
		list.forEach(cons);*/
		
		/*Consumer<String> cons = t->System.out.println(t);
		list.forEach(cons);*/
		
		Arrays.asList("Suresh", "Ramesh", "Rajsh", "Rahul", "Ram", "Shyam").forEach(t->System.out.println(t));
	}
}
