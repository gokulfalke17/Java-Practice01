package org.techhub;

interface M {
//	void m2();
	
	void m3(int i,int j);
}
public class LambdaExpressiongWithInstances {
	public static void main(String[] args) {
		
		/*M m = ()->{
			int b = 100;	//here no error we can declare non-static variables inside LE but static variables not possible	
			//static int c = 200; 	//inside LE we can not declare static variables 
				System.out.println("I'm m2() From M interface");
				System.out.println("Instace Variable b :"+ b);
				
			};
			m.m2();*/
		
		/*M m = new M() {
			static int num = 10;
			
			public void m2() {
				System.out.println(num);
				System.out.println("m2 method");
			}
		};
		m.m2();*/
		
		M m = (i, j) -> {
			//static int a = 10;	 //static is not allowed here..
			//but we can declared non-static variables
			System.out.println(i+" "+j);
		};
		m.m3(10,20);
	}
	
}
