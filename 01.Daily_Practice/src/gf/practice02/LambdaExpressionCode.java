package gf.practice02;

public class LambdaExpressionCode {

	public static void main(String[] args) {
		/*
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I'm Lambda run() method...");
			}
		};
		Thread t = new Thread(r);
		t.start();
		*/

		/*
		Runnable r = ()-> {
				System.out.println("I'm Lambda run() method...");
		};
		Thread t = new Thread(r);
		t.start();
		*/
		
		/*
		Runnable r = ()->System.out.println("I'm Lambda run() method...");
		Thread t = new Thread(r);
		t.start();
		*/
		

		Runnable r = ()->System.out.println("I'm Lambda run() method...");
		new Thread(r).start();
		
		
		
	}
}
