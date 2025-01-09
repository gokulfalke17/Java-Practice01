package gf.practice01;

class MyThread002 extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			Thread.yield();
			System.out.println("Run : "+ i);
		}
	}
	
}

public class ThreadYieldDemo {
	
	public static void main(String[] args) {
		
		MyThread002 mt1 = new MyThread002();
		mt1.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main : "+ i);
		}
	}
}
