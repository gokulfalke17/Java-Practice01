package gf.collection.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class Test04_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> ts1 = new TreeSet<>();
		
		ts1.add("a");
		ts1.add("c");
		ts1.add("d");
		ts1.add("b");
		//ts1.add(5);
		System.out.println(ts1);
		
		TreeSet< Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(9);
		ts2.add(8);
		ts2.add(5);
		ts2.add(7);
		ts2.add(10);
		//ts2.add("a");
		System.out.println(ts2);
		
		TreeSet<Character> ts3 = new TreeSet<>();
		//ts3.add("a");
		//ts3.add(5);
		ts3.add('a');
		ts3.add('p');
		ts3.add('m');
		System.out.println(ts3);
		
		TreeSet<Ex> ts4 = new TreeSet<>(new ExXDescComparator());
		ts4.add(new Ex(5, 6));
		ts4.add(new Ex(4, 2));
		ts4.add(new Ex(9, 5));
		ts4.add(new Ex(5, 6));
		System.out.println(ts4);  	//ClassCastException 
		
		//creating anonymous innter class object
		
//		TreeSet<Ex> ts5 = new TreeSet<>(new Comparator<Ex>() {
//
//			@Override
//			public int compare(Ex e1, Ex e2) {		
//				
//				return e1.getA()-e2.getA();				//for ASC order by a property
//			}
//		});
		
//		TreeSet<Ex> ts5 = new TreeSet<>(new Comparator<Ex>() {
//
//			@Override
//			public int compare(Ex e1, Ex e2) {		//for DESC order by a property
//					
//				return e2.getA()-e1.getA();
//			}
//		});
//	
		
//		TreeSet<Ex> ts5 = new TreeSet<>(new Comparator<Ex>() {
//
//			@Override
//			public int compare(Ex e1, Ex e2) {		//for ASC order by b property
//					
//				return e1.getB()-e2.getB();	
//			}
//		});
		
		TreeSet<Ex> ts5 = new TreeSet<>(new Comparator<Ex>() {

			@Override
			public int compare(Ex e1, Ex e2) {		//for DESC order by b property
					
				return e2.getB()-e1.getB();	
			}
		});
		
		ts5.add(new Ex(5,6));
		ts5.add(new Ex(6,8));
		ts5.add(new Ex(1, 3));
		ts5.add(new Ex(8, 9));
		ts5.add(new Ex(7, 4));
		System.out.println(ts5);
		System.out.println();
		
		//creating lambda expression
		TreeSet<Ex> ts6 =new TreeSet<>((e1, e2)-> e1.getA() - e2.getA());
		
		ts6.add(new Ex(5,6));
		ts6.add(new Ex(6,8));
		ts6.add(new Ex(1, 3));
		ts6.add(new Ex(8, 9));
		ts6.add(new Ex(7, 4));
		System.out.println(ts6);
		
		
		TreeSet<Sa> ts7 =  new TreeSet<>((s1, s2) -> s2.getB() - s1.getB());
		
		ts7.add(new Sa(10, 5));
		ts7.add(new Sa(2, 4));
		ts7.add(new Sa(5, 9));
		ts7.add(new Sa(15, 7));
		ts7.add(new Sa(7, 15));
		System.out.println(ts7);
		
		
	}
}
