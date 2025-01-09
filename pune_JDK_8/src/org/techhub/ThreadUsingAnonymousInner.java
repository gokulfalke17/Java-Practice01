package org.techhub;

public class ThreadUsingAnonymousInner {
	public static void main(String[] args) {
		
		Thread t = new Thread() {
			public void run() {
				try {
					for(int i=1;i<=10; i++) {
						System.out.println("I : "+ i);
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
	}
}
