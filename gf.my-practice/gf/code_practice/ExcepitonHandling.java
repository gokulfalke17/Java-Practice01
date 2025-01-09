package gf.code_practice;

public class ExcepitonHandling {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("Result is :"+ c);
		} catch (ArithmeticException e) {
			System.out.println("Do not pass zero as second value...");
		}finally {
			System.out.println("This block is always executed...");
		}
	}
}
