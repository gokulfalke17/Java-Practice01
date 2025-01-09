package gf.collection.practice;

import java.util.ArrayList;

public class Test01_ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		
		System.out.println("isEmpty :: "+ al.isEmpty());
		
		//adding all 4 types of objects
		al.add("a");
		al.add("b");
		al.add("a");
		al.add(5);
		al.add(6);
		al.add(null);
		al.add(null);
		al.add(null);
		
		System.out.println("Size :: "+ al.size());
		System.out.println("Elements :: "+ al);
		
		//retrieving object randomly
		System.out.println("3rd index object :: "+ al.get(3));

	}

}
