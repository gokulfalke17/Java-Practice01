package org.techhub;

@FunctionalInterface
interface Test {
	void show();
}
public class LambdaExpression { 
	public static void main(String[] args) {
		Test t = ()->{
			System.out.println("I'm Lambda Expression Mehtod...");
		};
		t.show();
	}
}
