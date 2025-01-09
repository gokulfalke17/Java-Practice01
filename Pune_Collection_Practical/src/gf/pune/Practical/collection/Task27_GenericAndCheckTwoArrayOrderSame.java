package gf.pune.Practical.collection;

import java.util.ArrayList;

public class Task27_GenericAndCheckTwoArrayOrderSame {
	public static void main(String[] args) {
		ArrayList<Object> al1 = new ArrayList<>();
		al1.add(5);
		al1.add(20);
		al1.add(10);
		al1.add(15);
		al1.add("A");
		al1.add("Good");
		al1.add("B");
		al1.add(15.55f);
		System.out.println("First List :: ");
		System.out.println(al1);
		
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add(5);
		al2.add(20);
		al2.add(10);
		al2.add(15);
		al2.add("Good");
		al2.add("B");
		al2.add(15.55f);
		al2.add("DDD");
		System.out.println("Second List :: ");
		System.out.println(al2);
		System.out.println();
		
		boolean flag = false;
		if(al1.size() == al2.size()) {
			for(Object obj : al1) {
				if(!al2.equals(obj)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("List are Equals...");
			}else {
				System.out.println("List are Not Equals......");
			}
		}else {
			System.out.println("List Size() are Not Equals....");
		}
		
			
	}
}
