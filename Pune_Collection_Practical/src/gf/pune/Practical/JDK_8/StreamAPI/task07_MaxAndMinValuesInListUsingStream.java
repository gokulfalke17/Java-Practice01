package gf.pune.Practical.JDK_8.StreamAPI;

//7. Write a Java program to find the maximum and minimum values in a list of integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task07_MaxAndMinValuesInListUsingStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 2, 5, 1, 3, 6, 8, 7, 9, 9, 1);
		System.out.println("List is : "+ list);
		System.out.println();
		
		System.out.println("max element is : ");
		Optional<Integer> max = list.stream()
		.max((a1, a2) -> (Integer)a1.compareTo((Integer)a2));
		System.out.println(max);
		System.out.println();
		
		System.out.println("min element is : ");
		Optional<Integer> min = list.stream()
		.max((a1, a2) -> (Integer)a2.compareTo((Integer)a1));
		System.out.println(min);
	}
}
