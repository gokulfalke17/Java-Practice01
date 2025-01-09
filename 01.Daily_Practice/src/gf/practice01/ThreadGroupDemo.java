package gf.practice01;

class MyThread001 extends Thread {
	
	public MyThread001(ThreadGroup tg, String name) {
		super(tg, name);
	}
	
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadGroupDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		/* 
		ThreadGroup tg = new ThreadGroup("parent group");
		ThreadGroup tg2 = new ThreadGroup(tg, "child group");
		MyThread001 mt1 = new MyThread001(tg, "child group1");
		MyThread001 mt2 = new MyThread001(tg, "child group2");
		mt1.start();
		mt2.start();
		
		System.out.println(tg.activeCount());
		System.out.println(tg.activeGroupCount());
		tg.list();
		Thread.sleep(5000);
		System.out.println(tg.activeCount());
		tg.list();
		*/
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread t[]  = new Thread[system.activeCount()];
		
		system.enumerate(t);
		for(Thread tt : t) {
			System.out.println(tt.getName()+" ---> "+tt.isDaemon());
		}
		
		
		
		
		
	}
	
}
