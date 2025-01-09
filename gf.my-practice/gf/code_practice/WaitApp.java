package gf.code_practice;
class myWait implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=20; i++) {
			System.out.println("Run 02 :"+i);
		}
		
	}
}

class myWait1 implements Runnable {

	@Override
	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=20; i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Run 02 :"+i);
		}
		
	}
}



public class WaitApp {
	public static void main(String[] args) throws InterruptedException {
		
		myWait mw = new myWait();
		Thread t = new Thread(mw);
		t.start();
		
		myWait1 mw2 = new myWait1();
		Thread t2 = new Thread(mw2);
		t2.start();
		
		for(int i=0;i<=10; i++) {
			t2.sleep(5000);
			System.out.println("main :"+ i);
		}
	}
}
