package gf.practice02;

public class CheckArmstrong {
	
	public static void main(String[] args) {
		
		int num = 153;
		int sum = 0;
		int temp = num;
		while(temp!=0) {
			int rem = temp%10;
			sum = (int) (sum+Math.pow(rem, 3));
			temp = temp/10;
		}
		
		if(num==sum) {
			System.out.println(num+" Is Armstrong");
		}else {
			System.out.println(num+" Is Not Armstrong");
		}
	}
}
