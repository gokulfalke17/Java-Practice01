package gf.practice01;

class AddAndSquare {
	int sum = 0;
	int square = 0;
	
	public int sum(String str, int ...a) {
		for(int i : a) {
			sum = sum+i;
		}
		System.out.println("Given String is : "+ str);
		return sum;
	}
	
	public int squre(String str, int ...a) {
		System.out.println("Square are : ");
		for(int i=0; i<a.length; i++) {
			square = a[i]*a[i];
			System.out.println(a[i]+" : "+square);
		}
		System.out.println();
		System.out.println("Another Given String is : "+ str);
		
		return 0;
	}
}
public class Test02_VariableArgument {
	
	public static void main(String[] args) {
		
		AddAndSquare as = new AddAndSquare();
		int addition = as.sum("Good Morning", 10, 20, 30, 40, 50);
		System.out.println("Addition is : "+ addition);
		System.out.println();
		
		as.squre("Hello India", 4, 6, 2, 8, 7, 6);
	}
}
