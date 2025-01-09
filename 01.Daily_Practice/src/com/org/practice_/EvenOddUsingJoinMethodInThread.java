package com.org.practice_;

/*
Q3.WAP to create the two thread name as even and odd and print the even values between 1 to 10 
and print the odd values between 1 to 10 using join method ?
*/

class EvenNumJoin extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

class OddNumJoin extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

public class EvenOddUsingJoinMethodInThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Even Numbers : ");
		EvenNumJoin evenNum = new EvenNumJoin();
		evenNum.start();
		evenNum.join();
		System.out.println();

		System.out.println("Odd Numbers : ");
		OddNumJoin oddNum = new OddNumJoin();
		oddNum.start();
	}
}
