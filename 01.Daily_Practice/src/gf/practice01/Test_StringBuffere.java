package gf.practice01;

public class Test_StringBuffere {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Default Capacity of StringBuffer :: "+ sb.capacity());
		
//		StringBuffer sb2 = new StringBuffer(-10);	//RE : NegativeArraySizeException
		
		StringBuffer sb3 = new StringBuffer("Good");
		System.out.println("Capacity is : "+sb3.capacity());
		System.out.println();
		
//		StringBuffer sb4 = new StringBuffer(null);	//RE : NullPointerException
	}
}
