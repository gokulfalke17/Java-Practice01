package org.techhub;

abstract class A {
	abstract void show(); 
}
public class AnonymousInnerUsingAbstract {
	public static void main(String[] args) {
		
		A a = new A() {

			@Override
			void show() {
				System.out.println("I'm show() method from A class...");				
			}
			
		};
		a.show();
		
	}
}
