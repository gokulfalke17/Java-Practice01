package gf.practice04_;

public class CountNumbers {
	
	public static void counter(int num) {
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		
		System.out.println("Number of Digits are :: "+count);
	}
	
	public static void main(String[] args) {
		
		int num = 12345;
		counter(num);
	}
}
