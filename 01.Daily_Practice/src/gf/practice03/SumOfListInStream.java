package gf.practice03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfListInStream {
	
	public static void main(String[] args) {
		
	System.out.println(Arrays.asList(10, 20, 30, 40, 50).stream().mapToInt(Integer :: intValue).sum());
	
	System.out.println(Arrays.asList(10, 20, 30, 40, 50).stream().reduce(0, (a, b)-> (a+b)));
	}
}
