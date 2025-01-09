package gf.pune.Practical.collection;

import java.util.ArrayList;

public class Task12_JoinTwoArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add("A");
		al1.add("B");
		System.out.println("First List :: ");
		System.out.println(al1);
		System.out.println();
		
		ArrayList<Object> al2 = new ArrayList<Object>();
		al2.add("C");
		al2.add("D");
		al2.add(60);
		al2.add(70);
		al2.add(80);
		System.out.println("Second List :: ");
		System.out.println(al2);
		System.out.println();
		
		ArrayList<Object> al3 = new ArrayList<Object>();
		al3.addAll(al1);
		al3.addAll(al2);
		System.out.println("After Adding First and Second List :: ");
		System.out.println(al3);
		
	}
}
