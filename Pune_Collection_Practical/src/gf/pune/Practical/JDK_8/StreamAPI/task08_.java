package gf.pune.Practical.JDK_8.StreamAPI;

//8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task08_ {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,8);
		System.out.println("List is : "+ list);
		System.out.println();
		
		System.out.println("Second Smallest : ");
		Optional<Integer> secondSmallest = list.stream()
		.distinct()
		.skip(2)
		.findFirst();
		System.out.println(secondSmallest);
		System.out.println();
		
	}
}
