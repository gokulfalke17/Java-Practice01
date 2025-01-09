package org.techhub;

public class ThreadLambdaExpression {
	public static void main(String[] args) {
//		Runnable r = ()->{
//				try {
//					for(int i=1; i<=10; i++) {
//						System.out.println("I : "+i);
//						Thread.sleep(200);
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			};Thread t = new Thread(r);t.start();
		
//		Thread t = new Thread(()->{
//			try {
//				for(int i=1; i<=10; i++) {
//					System.out.println("I : "+i);
//					Thread.sleep(200);
//				}
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//		t.start();
		
		new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					System.out.println("I : "+i);
					Thread.sleep(200);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
	}
}
