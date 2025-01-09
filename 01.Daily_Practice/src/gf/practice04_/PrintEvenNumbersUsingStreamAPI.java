package gf.practice04_;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbersUsingStreamAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8);
		List<Integer> stream = list.stream()
				.filter(num -> num%2==0)
				.collect(Collectors.toList());
		
		stream.forEach(ele->System.out.print(ele+" "));
	}
}
