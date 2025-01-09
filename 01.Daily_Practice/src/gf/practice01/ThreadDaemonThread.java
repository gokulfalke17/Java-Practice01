package gf.practice01;

class MyThread extends Thread {
}

class ThreadDaemonThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());
		MyThread t = new MyThread();
		System.out.println(t.isDaemon());
		t.start();
		
		//t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}



