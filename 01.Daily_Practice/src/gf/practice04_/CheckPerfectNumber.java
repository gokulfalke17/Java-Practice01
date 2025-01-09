package gf.practice04_;

public class CheckPerfectNumber {
	
	public static boolean checkPerfectNum(int num) {
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum is :: "+ sum);
		
		return sum==num;
	}
	
	public static void main(String[] args) {
		
		int num = 6;
		boolean flag = checkPerfectNum(num);
		if(flag){
			System.out.println("Is Perfect Number");
		}else {
			System.out.println("Is Not Perfect Number");
		}
	}
}
