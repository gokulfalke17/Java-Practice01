package gf.collection;

import java.util.Vector;

public class Test05_List_Vector { 
	
	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<>();
		System.out.println("Capacity :: "+v1.capacity());
		System.out.println("Size :: "+v1.size());
		System.out.println("Elements :: "+v1);
		System.out.println();
		
		v1.add("a");						System.out.println(v1);
		v1.add("b");						System.out.println(v1);
		v1.add(5);							System.out.println(v1); 
		v1.add(6); 							System.out.println(v1);
		v1.add(null);						System.out.println(v1);
		v1.add(true);						System.out.println(v1);
		v1.add('p'); 						System.out.println(v1);
		v1.add(new Ex(5,6));				System.out.println(v1);
		v1.add(null);						System.out.println(v1);
		v1.add(5.2f);						System.out.println(v1);
		v1.add("a");						System.out.println(v1);
		v1.add(5);							System.out.println(v1);
		v1.add(true);						System.out.println(v1);
		v1.add(new Ex(5,6)); 	System.out.println(v1);
		
		System.out.println();
		System.out.println("Capacity :: "+v1.capacity());
		System.out.println("Size :: "+v1.size());
		System.out.println();
		
		System.out.println(v1.contains("a"));
		System.out.println(v1.contains(new String("a")));
		System.out.println(v1.contains(new Integer(5)));
		System.out.println();
		
		System.out.println(v1.indexOf("a"));
		System.out.println(v1.indexOf(true));
		System.out.println(v1.lastIndexOf(true));
		System.out.println(v1.lastIndexOf("a"));
		System.out.println();
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(6));
		System.out.println(v1.get(8));
		//System.out.println(v1.get(-1));		//ArrayIndexOutBoundsException
		//System.out.println(v1.get(20)); 	//ArrayIndexOutBoundsException
		System.out.println();
		
		System.out.println(v1);
		System.out.println(v1.remove("a"));
		System.out.println(v1);
		System.out.println();
		
		System.out.println(v1);
		System.out.println(v1.remove(null));
		System.out.println(v1);
	}
}
