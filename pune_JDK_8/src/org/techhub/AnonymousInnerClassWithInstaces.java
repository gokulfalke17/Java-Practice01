package org.techhub;

interface A1 {
	void m1() ;
}
public class AnonymousInnerClassWithInstaces {
	
	public static void main(String[] args) {
		
		A1 a = new A1() {
			//inside anonymous inner class we can declare both static and not static variables there is not programs
			int a = 100;				
			static int  b = 200;
			
			@Override
			public void m1() {
				System.out.println("This is A1 FuncationInterface...");
				System.out.println("Non-Static Variable a :"+ a);
				System.out.println("Static Variable b : "+b);
			}
			
//			static {
//				System.out.println(b);
//			}
			
		};
		a.m1();
	}
}
