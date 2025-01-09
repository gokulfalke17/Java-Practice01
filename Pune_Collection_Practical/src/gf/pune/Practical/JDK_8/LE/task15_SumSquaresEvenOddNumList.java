package gf.pune.Practical.JDK_8.LE;

//15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface EvenOddSumSquares {
	void sumSquares(List<Integer> list);
}
public class task15_SumSquaresEvenOddNumList {
	static int sqr=0;
	static int evenSum = 0;
	static int oddSum = 0;
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("List is : "+ list);
		
		/*EvenOddSumSquares ess = new EvenOddSumSquares() {	
			@Override 
			public void sumSquares(List<Integer> list) {
				for(Integer num : list) {
					sqr = num*num;
					if(num%2==0)
						evenSum = evenSum+sqr;
					else
						oddSum = oddSum+sqr;
					//System.out.println(sqr);
				}
			}
		};
		ess.sumSquares(list);
		System.out.println("Even Square Sum : "+ evenSum);
		System.out.println("Odd Square Sum : "+ oddSum);*/
		
		EvenOddSumSquares ess = lst->{
				for(Integer num : list) { 
					sqr = num*num;
					if(num%2==0)
						evenSum = evenSum+sqr;
					else
						oddSum = oddSum+sqr;
				}
			};
		ess.sumSquares(list);
		System.out.println(evenSum+"\n"+oddSum);
	}
}
