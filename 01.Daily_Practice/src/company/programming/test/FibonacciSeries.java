package company.programming.test;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int limit = 10;
		int first = 0;
		int second = 1;
		
		
		for(int i=1; i<=limit; i++) {
			
			System.out.print(first+" ");
			int next = first+second;
			first = second;
			second = next;
		}
		
	}
}
