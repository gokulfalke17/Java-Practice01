package gf.pune.Practical.JDK_8.StreamAPI;

//6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class task16_SortAlphabeticalOrderASCorDESC {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("aaa", "zzz", "ddd", "mmm", "bbb", "ttt", "sss", "kkk", "ggg", "qqq");
		System.out.println("list is :: \n"+ list);
		System.out.println();
		
		
		/*List<String> asc = list.stream()
		.sorted()
		.collect(Collectors.toList());
		System.out.println("Asecending order : \n"+ asc);
		System.out.println();
		
		List<String> desc = list.stream()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
		System.out.println("Descending order : \n"+ desc);*/
		
		System.out.println("ASC order : ");
		list.stream()
				.sorted()
				.forEach(val -> System.out.print(val+" "));
		System.out.println("\n");
		
		System.out.println("DESC order : ");
		list.stream()
		.sorted(Collections.reverseOrder())
		.forEach(val -> System.out.print(val+" "));
				
	}
}
