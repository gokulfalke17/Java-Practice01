package org.techhub;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SeperateStringEndsWithSH {
	
	public static void main(String[] args) {
		
		/*List<String> list = Arrays.asList("ganesh", "ram", "sanket", "damodar", "dinesh", "sandeep");
		Stream<String> strm =list.stream();
		Predicate<String> pred = new Predicate<String>() {
			
			@Override
			public boolean test(String str) {
				return str.endsWith("sh");
			}
		};
		Stream<String> s = strm.filter(pred);
		s.forEach(val -> System.out.println(val));*/
		
		
		/*List<String> list = Arrays.asList("ganesh", "ram", "sanket", "damodar", "dinesh", "sandeep");
		Stream<String> strm =list.stream();
		Predicate<String> pred =(String str)->str.endsWith("sh");
		
		Stream<String> s = strm.filter(pred);
		s.forEach(val -> System.out.println(val));*/
		
		
		/*List<String> list = Arrays.asList("ganesh", "ram", "sanket", "damodar", "dinesh", "sandeep");
		Stream<String> strm =list.stream();
		
		Stream<String> s = strm.filter((String str)->str.endsWith("sh"));
		s.forEach(val -> System.out.println(val));*/
		
		
		/*List<String> list = Arrays.asList("ganesh", "ram", "sanket", "damodar", "dinesh", "sandeep");
		
		Stream<String> s = list.stream().filter((String str)->str.endsWith("sh"));
		s.forEach(val -> System.out.println(val));*/
		
		
		
		/*Stream<String> s = Arrays.asList("ganesh", "ram", "sanket", "damodar", "dinesh", "sandeep").stream().filter((String str)->str.endsWith("sh"));
		s.forEach(val -> System.out.println(val));*/
		
		
		 Arrays.asList("ganesh", "ram", "sanket", "damodar", "dinesh", "sandeep")
		 	.stream().filter((String str)->str.endsWith("sh"))
		 	.forEach(val -> System.out.println(val)); 
		
		
		
	}
}
