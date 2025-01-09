package gf.practice01;

class MyThread003 extends Thread {
	static Thread mt;

	public void run() {
		
			try {
				mt.join();
			} catch (InterruptedException e) {}
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("Sita Thread...");
		}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread003 mt1 = new MyThread003();
		mt1.start();
		//mt1.join();
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(1000);
			System.out.println("Ram Thread.");
		}
	}
}
