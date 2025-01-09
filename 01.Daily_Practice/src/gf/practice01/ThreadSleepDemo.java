package gf.practice01;

public class ThreadSleepDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1; i<=5; i++) {
			Thread.sleep(1000);
			System.out.println("I : "+ i);
		}
	}
}
