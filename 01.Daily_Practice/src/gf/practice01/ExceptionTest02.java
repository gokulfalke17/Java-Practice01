package gf.practice01;

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
		System.out.println(m1());
	}

	private static int m1() {
		try {
			return 777;
		} catch (Exception e) {
			return 888;
		}finally {
			return 999; 
		}
		
	}
}
