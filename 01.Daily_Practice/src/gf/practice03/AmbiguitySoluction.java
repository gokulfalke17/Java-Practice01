package gf.practice03;

interface A {
	public void m1();
}

interface B {
	public void m1();
}

interface C extends A, B{
	
}

class Test implements C {

	@Override
	public void m1() {
		System.out.println("I am m1() method...");
	}
}


public class AmbiguitySoluction {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.m1();
	}
}
