package gf.practice02;

interface Person {
	public abstract void student();
}

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		
		Person per = new Person() {
			
			@Override
			public void student() {
				System.out.println("I'm student anonymous Person object...");
			}
		};
		per.student();
	}
}
