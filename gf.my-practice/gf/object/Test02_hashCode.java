package gf.object;

public class Test02_hashCode {
	
	public static void main(String[] args) {
		
		Example e1 = new Example();
		Example e2 = new Example();
																				//ref wise hc				state wise hc
		System.out.println(e1.hashCode());	//1579572132 			30
		System.out.println(e2.hashCode()); 	//359023572				30
		
		e1.x = 20;
		e1.y = 30;
		
																				//ref wise hc				state wise hc
		System.out.println(e1.hashCode());	//1579572132 			50
		System.out.println(e2.hashCode()); 	//359023572				30
		
		System.out.println(e1.JVMHC());		//1579572132
		System.out.println(e2.JVMHC());		//359023572
	}
}
