package gf.practice01;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		try {
			System.out.println("In try block....");
			return;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("In finally block...");
		}
		System.out.println("Main end");
	}
}
