package gf.practice04_;

public class LCM_HCF {
	
	//getting two numbers of LCM
	public static void LCM(int num1, int num2) {
		int lcm = 0;
		for(int i=num1; ; i++) {
			if(i%num1==0 && i%num2==0) {
				lcm = i;
				break;
			}
		}
		
		System.out.println("LCM Of ("+num1+", "+num2+") is ::  "+ lcm);
	}
	
	//getting two numbers of HCF
	public static void HCF(int num1, int num2) {
		int hcf = 0;
		for(int i=1; i<=num1 && i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				hcf = i;
			}
		}
		
		System.out.println("HCF Of ("+num1+", "+num2+") is ::  "+ hcf);
	}
	
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 14;
		
		//calling methods
		LCM(num1, num2);
		HCF(num1, num2);
	}
}
