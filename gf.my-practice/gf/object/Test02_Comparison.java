package gf.object;

class Test {
	
}

class Example01 {
	int x = 10;
	int y = 20;
}
public class Test02_Comparison {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 10;

		System.out.println(x==y);
		System.out.println(x==z);
		
		boolean bo = true;
		//System.out.println(x==bo);  //CE : incomparable type int and boolean
		System.out.println();
		
		Example01 e1 = new Example01();
		Example01 e2 =  new Example01();
		Example01 e3 = e2;
		
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		
		Test t1 = new Test();
		
		//System.out.println(t1==e1);	//CE : incomparable type Test and Example01
		
	/*	
		public boolean equals(Object obj) {
			return this == obj;
		}
*/		
		
		System.out.println(e1.equals(e2)); 
		System.out.println(e2.equals(e3));
		System.out.println(t1.equals(e1)); 
		System.out.println();
		
		System.out.println(null==null);
		Example01 e4 = null;
		System.out.println(null==e4);
		
		Example01 e5 = new Example01();
		System.out.println(null == e5);
		System.out.println(null == new Example01());
		System.out.println();
		
		//System.out.println(null.equals(null)); //CE : <nulltype> cannot be dereferenced 
		Example01 e6 = null;
		//System.out.println(null.equals(e6));  //RE : NPC
		System.out.println();
		
		Example01 e7 = new Example01();
		System.out.println(e7.equals(null));
	}

}
