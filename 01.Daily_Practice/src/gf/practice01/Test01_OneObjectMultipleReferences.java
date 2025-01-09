package gf.practice01;
class Addition {
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getResult() {
		
		return a+b;
	}
}
public class Test01_OneObjectMultipleReferences {
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.setValue(10, 20);
		System.out.println("Result : "+ a1.getResult());
		System.out.println(a1.hashCode());
		Addition a2 = a1;
		a2.setValue(100, 200);
		System.out.println("Addition is : "+a2.getResult());
		System.out.println(a2.hashCode());
		
		System.out.println(a1 == a2);
	}
}	
