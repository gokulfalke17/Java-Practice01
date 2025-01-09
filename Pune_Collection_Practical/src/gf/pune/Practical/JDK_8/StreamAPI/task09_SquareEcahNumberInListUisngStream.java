package gf.pune.Practical.JDK_8.StreamAPI;

//9. Write a Java program to square each number in the list and collect the result into a new list by using Stream API.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task09_SquareEcahNumberInListUisngStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 4, 3, 7, 9, 8, 4, 2, 1);
		System.out.println("List is :: "+ list);
		System.out.println();
		
		List<Integer> square = list.stream()
		.map(num -> num*num)
		.collect(Collectors.toList());
		System.out.println("Square List is : "+square);
		
		
		
	}
}
