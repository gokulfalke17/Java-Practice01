package gf.practice01;

class MyThread01 extends Thread{
	public synchronized void run() {
		for(int i=1; i<=10; i++) {
			
			try {
				wait();
				System.out.println("I : "+ i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

public class ThreadDemo01 {
	
	public synchronized static void main(String[] args) throws InterruptedException {
		
		MyThread01 mt1 = new MyThread01();
		mt1.start();
		MyThread01 mt2 = new MyThread01();
		mt2.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main : "+ i);
		}
	}
}
