package com.org.practice_;

//Q1. WAP to create thread using Thread class and display the five value with delay 10000?

class MyThread extends Thread {
	public void run() {
		for(int i=1; i<=20; i++) {
			try {
				System.out.print(i+" ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DisplayThread {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
	}
}
