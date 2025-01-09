package gf.collection;

import java.util.LinkedHashSet;

public class Test10_Map_HashMap_Internals_TC {
	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add(new Ex(5,6));
		lhs.add(new Ex(5,6));
		
		Ex e3 = new Ex(5,6);
		Ex e4 = new Ex(5,6);
		Ex e5 = new Ex(6,5); 
		Ex e6 = new Ex(7,8);
		Ex e7 = e6;
		
		lhs.add(e3);
		lhs.add(e4);
		lhs.add(e5);
		lhs.add(e6);
		lhs.add(e7);
		
		System.out.println("Size :"+lhs.size());
		System.out.println("Elements :"+lhs);
		System.out.println();
		
		System.out.println("Ex(5,6) is it removed :"+ lhs.remove(new Ex(5,6)));
		System.out.println("e7 is it removed :"+lhs.remove(e7));
	}
}
