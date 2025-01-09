package gf.pune.Practical.JDK_8.StreamAPI;

//13.	Write a Java program to find the sum of the squares of even numbers in the list by using Stream API.

import java.util.Arrays;
import java.util.List;

public class task13_EvenNumberSquareSumUisngStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 9, 4, 5, 7);
		System.out.println("List is : "+ list);
		
		int sum = list.stream()
		.filter(num -> num%2==0)	//2  6   4  8   4
		.mapToInt(num -> num*num)	//4  36  16 64  16   
		.sum();	//4+36+16+64+16
		
		System.out.println(sum);	
		
		
	}
}
