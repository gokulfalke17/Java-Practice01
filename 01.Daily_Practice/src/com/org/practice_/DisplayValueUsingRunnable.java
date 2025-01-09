package com.org.practice_;

//Q4. WAP to create thread using Runnable interface and print the values between 1 to 5 using sleep() method?

class MyThread02 implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.print(i+" ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}
public class DisplayValueUsingRunnable {

	public static void main(String[] args) {
		MyThread02 mt1 = new MyThread02();
		Thread t1 = new Thread(mt1);
		t1.start();
	}
}
