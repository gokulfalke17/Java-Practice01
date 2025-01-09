package gf.pune.Practical.JDK_8.LE;

//1. Write a Java program to implement a lambda expression to find the sum of two integers.

interface Sum {
	void addition(int a, int b);
}
public class task01_SumOfTwoNumber_LE {
	public static void main(String[] args) {
		
		/*Sum sum = new Sum() {
			
			@Override
			public void addition(int a, int b) {
				System.out.println("Sum of Two Integers is : "+(a+b));
			}
		};*/
		
		Sum sum = (int a, int b)->System.out.println("Sum of Two Integers is : "+(a+b));

		sum.addition(100, 200);
		
	}
}
