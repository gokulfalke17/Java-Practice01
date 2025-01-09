package gf.pune.Practical.collection;

import java.util.ArrayList;

public class Task13_CopareTowArrayList {
	public static void main(String[] args) {
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add("A");
		al1.add("B");
		System.out.println("First List :: ");
		System.out.println(al1);
		
		ArrayList<Object> al2 = new ArrayList<Object>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add("A");
		al2.add("C");
		System.out.println("Second List :: ");
		System.out.println(al2);
		
//		if(al1.equals(al2)) {
//			System.out.println("List are Equals........");
//		}else {
//			System.out.println("List are Not Equals......");
//		}
		
//==================================================================================		
		
		//manually
		boolean flag = true;
		if(al1.size() != al2.size()) {
			flag = false;
		}
			for(int i=0; i<al1.size(); i++) {
				if(!al1.get(i).equals(al2.get(i))) {
					flag = false;
				}
			}
		if(flag) {
			System.out.println("List is Equals..!");
		}else {
			System.out.println("List is Not Equals.......");
		}
		
	}
}
