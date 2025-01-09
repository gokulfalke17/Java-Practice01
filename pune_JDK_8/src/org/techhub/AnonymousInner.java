package org.techhub;

interface ABC {
	void show();
}
public class AnonymousInner {
	public static void main(String[] args) {
		
		ABC abc = new ABC() {

			@Override
			public void show() {
				System.out.println("I am ABC Inteface Mathod...");
			}
			
		};
		abc.show();
	}
}
