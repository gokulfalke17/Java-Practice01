package com.org.practice_;

/*
Q2.WAP to create the two thread name as even and odd and print the even values between 1 to 10 
and print the odd values between 1 to 10 using synchronization technique?
*/

class EvenNumbers extends Thread {

	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

class OddNumbers extends Thread {

	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

public class PrintEnveOddUsingSynchronizedInThread {

	public static void main(String[] args) {

		EvenNumbers even = new EvenNumbers();
		even.start();

		OddNumbers odd = new OddNumbers();
		odd.start();
	}
}
