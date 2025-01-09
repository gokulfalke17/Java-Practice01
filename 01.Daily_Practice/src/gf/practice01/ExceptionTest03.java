package gf.practice01;

public class ExceptionTest03 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("In try block..");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("In Catch block....");
		}finally {
			System.out.println("finnaly block....");
		}
	}

	
}
