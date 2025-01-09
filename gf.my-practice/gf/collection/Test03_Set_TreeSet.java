package gf.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Test03_Set_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add("a");
		ts1.add("c");	//"c".compareTo("a") => int[-v/0/+v] =>sorted    
		ts1.add("b");
		System.out.println(ts1);
		//ts1.add(5);		//5.compareTo("a")  ---> ClassCastException
		//ts1.add(null);		// null.compareTo("a") ---> NullPointerException
		
		
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);
		
		TreeSet<Sa> ts3 = new TreeSet<>();
		ts3.add(new Sa(5,6));
		ts3.add(new Sa(7,3));	//s1.compareTo(s2)
		ts3.add(new Sa(6,8));
		System.out.println(ts3);
		System.out.println();
		
		//Approach #1 : supplying custom sorting order by using outer class 
		TreeSet<Sa> ts4 = new TreeSet<>(new SaXDescComparator()); 	//cso
		ts4.add(new Sa(5,6));
		ts4.add(new Sa(7,3));	//saxc.compare(s2, s1);
		ts4.add(new Sa(6,8));
		System.out.println(ts4);
		System.out.println();

		//Approach #2 : supplying custom sorting order by using anonymous class 
				TreeSet<Sa> ts5 = 
									new TreeSet<>(
												new Comparator<Sa>() { 
															@Override
															public int compare(Sa s1, Sa s2) {
					
																return s1.getY() - s2.getY();
															}
														}); 	//cso
				
				ts5.add(new Sa(5,6));
				ts5.add(new Sa(7,3));	//aic.compare(s2, s1);
				ts5.add(new Sa(6,8));
				System.out.println(ts5);
				
				TreeSet<Sa> ts6 = 
									new TreeSet<>(
												//new Comparator<Sa>() {
													//public int compare
														(Sa s1, Sa s2) -> {  //Lambda Expression  ( -> )
														
														return s2.getY() - s1.getY();
														
													} //;
												//}
											); 	//cso
				
				TreeSet<Sa> ts7 = 
								new TreeSet<>(
													(s1, s2) -> {	 	//Lambda Expression more shorter
											
															return s2.getY() - s1.getY();
											
													} //;
								); 	
				
				TreeSet<Sa> ts8 = 
									new TreeSet<>(  (s1, s2) -> s2.getY() - s1.getY()  ); 	
				
				ts8.add(new Sa(5,6));
				ts8.add(new Sa(7,3));	//aic.compare(s2, s1);
				ts8.add(new Sa(6,8));
				System.out.println(ts8);
				System.out.println();
				
				//sort String objects in DESC order 
				TreeSet<String> ts9 = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
				ts9.add("a");
				ts9.add("c");
				ts9.add("b");
				System.out.println(ts9);
				
				//sort Integer objects in DESC order
				TreeSet<Integer> ts10 = new TreeSet<>((s1,s2) -> s2.compareTo(s1));
				ts10.add(10);
				ts10.add(40);
				ts10.add(50);
				ts10.add(20);
				ts10.add(30);
				System.out.println(ts10);
				System.out.println();
				
				//It throws ClassCastException because Ex class not Comparable class
				//for sorting non-comparable objects we must supply custom comparator
				TreeSet<Ex> ts11 = new TreeSet<>((e1, e2) -> e1.getX() - e2.getX());
				ts11.add(new Ex(5, 6));
				ts11.add(new Ex(7, 3));
				ts11.add(new Ex(6, 8));
				System.out.println(ts11);
				
				TreeSet<Ex> ts12 = new TreeSet<>((e1, e2) -> e2.getX() - e1.getX());
				ts12.add(new Ex(5, 6));
				ts12.add(new Ex(7, 3));
				ts12.add(new Ex(6, 8));
				System.out.println(ts12);
				System.out.println();
				
				TreeSet<Ex> ts13 = new TreeSet<>((e1, e2) -> e1.getY() - e2.getY());
				ts13.add(new Ex(5, 6));
				ts13.add(new Ex(7, 3));
				ts13.add(new Ex(6, 8));
				System.out.println(ts13);
				
				TreeSet<Ex> ts14 = new TreeSet<>((e1, e2) -> e2.getY() - e1.getY()); 
				ts14.add(new Ex(5, 6));
				ts14.add(new Ex(7, 3));
				ts14.add(new Ex(6, 8));
				System.out.println(ts14);
				
				TreeSet< Integer> ts15 = new TreeSet<> ();
				ts15.add(5);	
				ts15.add(4);	//4.compareTo(5); --> 4-5 = -1 ==> LEFT
				ts15.add(6);	// 6.compareTo(5); -->6-5 = 1 ==> RIGHT
				ts15.add(3);	//3.compareTo(5); --> 3-5 = -2 	==> LEFT
											//3.compareTo(4); --> 3-4 = -1 ==> LEFT
				ts15.add(6);	//6.compareTo(6); -->6-6 = 0 ==> duplicate not stored

				System.out.println(ts15);
				
				TreeSet<Ex> ts16 = 
									new TreeSet<>(
												 //(e1, e2) ->{ return 0;	}	 //only first object is stored inTreeSet
												 //(e1, e2) ->{ return -1;	}	//all objects are stored in RIO including duplicates
												//(e1, e2) ->{ return 1;	}		//all objects are stored in IO including duplicate
												//(e1, e2) -> {	 return e1.getX() - e2.getX();	}	//stores x property in ASC order without duplicate
											   //(e1, e2) -> {	 return e2.getX() - e1.getX();	}	//stores x property in DESC order without duplicate
											//(e1, e2) -> {	 return e1.getY() - e2.getY();	} //stores y property in ASC order without duplicate
											(e1, e2) -> {	 return e2.getY() - e1.getY();	}	 //stores y property in DESC order without duplicate
									);
				ts16.add(new Ex(5,6));
				ts16.add(new Ex(7,4));
				ts16.add(new Ex(6,8));
				ts16.add(new Ex(6,8));
				ts16.add(new Ex(7,4));
				System.out.println(ts16);
				
				
				
	}

}
