package gf.collection.practice;

import java.util.Vector;

public class Test02_Vector {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		System.out.println("isEmpty :: "+ v.isEmpty());
		
		v.add("a");
		v.add("b");
		v.add("a");
		v.add(5);
		v.add(6);
		v.add(null);
		v.add(null);
		v.add(null);
		
		System.out.println("Size :: "+ v.size());
		System.out.println("Elements :: "+ v);
		System.out.println("3rd index element is :: "+ v.get(3));
	}

}
