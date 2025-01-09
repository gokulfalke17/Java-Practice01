package gf.practice02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class EvenNumberUisngStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 5, 2, 6, 3, 4, 9, 5);
		
		System.out.println("List is : ");
		for(Integer num : list) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Even Integer are :: ");
		list.stream()
				.filter(ele -> ele instanceof Integer)
				.filter(ele -> (int)ele%2==0)
				.forEach(ele -> System.out.print(ele+" "));
		
		
	}
}
