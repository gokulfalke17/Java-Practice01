package gf.practice01;

public class MethodWithPDT {

	static void display(int a) {
		System.out.println("m1(-) A : "+ a);
	}
	
	public static void main(String[] args) {
		
		display((byte)50);
		display('a');
		display(60);
		//display(50L);		CE:
		//display(50.4);	CE:
		System.out.println();
		
		display(new Byte((byte)50));
		display(new Character('a'));
		display(new Integer(60));
		//display(new Long(50L));		//CE:
		//display(new Double(50.4));	//CE:
	}
}
