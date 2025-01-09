package gf.pune.Practical.JDK_8.StreamAPI;

//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class task03_SumOfEvenOddNumbersInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15);
		int evenSum[] = { 0 };
		int oddSum[] = { 0 };

		/*Stream<Integer> stream = list.stream();
		Consumer<Integer> cons = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				if(t%2==0) {
					evenSum[0] = evenSum[0]+t;
				}else {
					oddSum[0] = oddSum[0]+t;
				}	
			}
		};
		stream.forEach(cons);
		System.out.println(evenSum[0]);
		System.out.println(oddSum[0]);*/

		/*Stream<Integer> stream = list.stream();
		Consumer<Integer> cons = (Integer t) -> {
			if (t % 2 == 0)
				evenSum[0] = evenSum[0] + t;
			else
				oddSum[0] = oddSum[0] + t;
		};
		stream.forEach(cons);
		System.out.println(evenSum[0]);
		System.out.println(oddSum[0]);*/
		
		
		/*Stream<Integer> stream = list.stream();
		stream.forEach((Integer t) -> {
			if (t % 2 == 0)
				evenSum[0] = evenSum[0] + t;
			else
				oddSum[0] = oddSum[0] + t; 
			
		});
		System.out.println(evenSum[0]);
		System.out.println(oddSum[0]);*/
		
		
		Stream<Integer> stream = list.stream();
		stream.forEach((Integer t) -> {
			if (t % 2 == 0)
				evenSum[0] = evenSum[0] + t;
			else
				oddSum[0] = oddSum[0] + t; 
			
		});
		System.out.println("Even Sum is : "+ evenSum[0]);
		System.out.println("Odd Sum is : "+ oddSum[0]);
	}
}
