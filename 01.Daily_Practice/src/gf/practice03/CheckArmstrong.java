package gf.practice03;

public class CheckArmstrong {
	
	public static void main(String[] args) {
		
		/*int num = 371;
		
		int temp = num;
		int sum = 0;
		
		while(num!=0) {
			int rem = num%10;
			sum = sum+rem*rem*rem;
			num = num/10;
		}
		
		if(sum==temp) {
			System.out.println("Is Armstrong");
		}else {
			System.out.println("Is Not Armstrong");
		}*/
		
		
		int num = 1634;
		int count = 0;
		int sum = 0;
		int temp  = num;
		
		while(temp!=0) {
			temp = temp/10;
			count++;
		}
		temp = num;
		
		while(temp!=0) {
			int rem = temp%10;
			int power = 1;
			for(int i=0; i<count;i++)power = power*rem;
			sum = sum+power;
			temp = temp/10;
		}
		
		if(sum==num) {
			System.out.println("Is Armstrong...");
		}else {
			System.out.println("Is Not Armstrong.");
		}
		
	}
}
