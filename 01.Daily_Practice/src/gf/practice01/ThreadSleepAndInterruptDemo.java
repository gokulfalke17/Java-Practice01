package gf.practice01;

class MyThread004 extends Thread {
	
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Run I : "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("I got Interrupted...");
			}
		}
	}
}
public class ThreadSleepAndInterruptDemo {
	
	public static void main(String[] args) {
		
		MyThread004 mt1 = new MyThread004();
		mt1.start();
		//mt1.interrupt();
		System.out.println("Main(-) Method End...");
	}
}
