package gf.collection.practice;

import java.util.ArrayList;

public class Test05_ {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(30);
		al.add("A");
		al.add("C");
		al.add("B");
		al.add(20);
		al.add(10);
		System.out.println(al);
		
		System.out.println(al.indexOf("B"));
		System.out.println(al.get(5));
	}
}
