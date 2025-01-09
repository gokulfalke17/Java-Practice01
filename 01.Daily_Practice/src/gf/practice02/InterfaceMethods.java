package gf.practice02;

interface Abc {
	public abstract void m1();	//abstract method
	public static void m2() {	//static method
		System.out.println("m2() static method in interface...");
	}
	
	default void m3() {
		System.out.println("m3() default method in interface...");
	}
	
	private void m4() {
		System.out.println("m4() private method in inteface");
	}
}


class Mno implements Abc {

	@Override
	public void m1() {
		System.out.println("m1() abstract method in  inteface override in child class...");
	}
	
}

public class InterfaceMethods {
	
	public static void main(String[] args) {
		
		Mno mno = new Mno();
		mno.m1();	//calling abstract method by using child class object ref.
		mno.m3();	//calling defacult method by using child class object ref.
		
		Abc.m2(); 	//calling static method by inteface name
	}
}
