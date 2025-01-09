package nit.practic;

class ABC {
	private ABC() {
		System.out.println("I'm Utility User Defined Class Constructor...");
	}
	
	public static void myMethod1(int a) {
		System.out.println("a : "+a);
	}
	
	public static void myMethod2(int x) {
		myMethod1(10);
		System.out.println("x : "+x);
	}
}
public class UserDefineUtilityClass {
	public static void main(String[] args) {
		ABC.myMethod2(2000);
	}
}
