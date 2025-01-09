package gf.practice01;

class A{
	int a;
	public void m1(int a) {
		this.a = a;
		System.out.println("I'm A Variable : "+ a);
	}
	public void square() {
		System.out.println("Square is : "+ (a*a));
	}
}

class B {
	int arr[];
	public void m1(int ...arr) {
		this.arr = arr;
	}
	
	int sum = 0;
	public void addWithSquare() {
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		
		int square = sum*sum;
		
		System.out.println("Sum is : "+ sum+"\nSquare is : "+ square);
	}
}
	
public class Test03_CallByValueCallByReference {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1(5);
		a.square();
		
		B b = new B();
		b.m1(5, 3, 2, 6, 7, 9, 5);
		b.addWithSquare();
	}
}
