package company.programming.test;

//12345
//52341

public class ReverseFirstAndList {

	public static void main(String[] args) {
		
		int num = 12345;
		/*int first = 0;
		int last = num%10;
		int temp = num;
		while(num!=0) {
			first = num%10;
			num = num/10;
		}*/
		
		/*System.out.println("First :: "+ first);
		System.out.println("Last :: "+ last);*/
		
		int temp = num;
		int digit = (int)Math.log10(temp);
		int last = num%10;
		while(temp>10) {
			temp = temp/10;
		}
		int p = (int)Math.pow(10, digit);
		int mid = (num%p)/10;
		int swap = (last*p) + (mid*10) + temp;
		System.out.println(swap);
		
	}
}
