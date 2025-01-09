package gf.pune.Practical.collection;

import java.util.ArrayList;

public class Task10_DisplayArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("a");
		al.add("b");
		al.add(true);
		al.add(10);
		al.add("a");
		al.add(null);
		
		System.out.println("Array List Elements are :: ");
		System.out.println(al);
	}
}
