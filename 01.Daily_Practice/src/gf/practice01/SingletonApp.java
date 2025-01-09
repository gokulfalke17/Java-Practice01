package gf.practice01;

class Singleton {
	
	private static Singleton s;
	private Singleton() {
		System.out.println("Singleton private constructor...");
	}
	
	public static Singleton getObject() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonApp {
	
	public static void main(String[] args) {
		
		Singleton.getObject();
		Singleton.getObject();
		
	}
}
