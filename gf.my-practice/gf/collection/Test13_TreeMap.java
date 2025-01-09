package gf.collection;

import java.util.TreeMap;

/**
 * TreeMap is used for storing entries in sorting order 
 * The sorting order is the order supplied  by the adding key object
 * 
 * The sorting can be supplied by using
 *	  1. Comparable interface 
 *	  2. Comparator interface
 * 
 * The key object must be homogeneous comparable type
 * else TM.put() method throws ClassCastException (CCE) 
 * 
 * If we want to entries in different order 
 * or if we want to store non-comparable keys
 * then we use custom sorting order logic be using comparator
 * 
 * as key homogeneous comparable type objects are allowed
 * as values any type objects are allowed
 * 
 * as key null is not allowed
 * as value null is allowed, multiple nulls are allowed
 * 
 * */
public class Test13_TreeMap {
	public static void main(String[] args) {
		TreeMap<String, Object> tm1 = new TreeMap<String, Object>();
		tm1.put("a", 1);
		tm1.put("c", 2);	//Default order
		tm1.put("b", 3);
		System.out.println(tm1);
		
		TreeMap<String, Object> tm2 = new TreeMap<String, Object>((s1, s2) -> s2.compareTo(s1));
		tm2.put("a", 1); 
		tm2.put("c", 2);	//DESC order
		tm2.put("b", 3);
		System.out.println(tm2);
		
		TreeMap<Sa, Object> tm3 = new TreeMap<Sa, Object>();
		tm3.put(new Sa(5,6), 1);
		tm3.put(new Sa(7,3), 2);	//Default order
		tm3.put(new Sa(6,9), 3);
		System.out.println(tm3);
		
		TreeMap<Sa, Object> tm4 = new TreeMap<Sa, Object>((s1, s2) -> s1.getY() - s2.getY());
		tm4.put(new Sa(5,6), 1);
		tm4.put(new Sa(7,3), 2);	//Y-ASC order
		tm4.put(new Sa(6,9), 3);
		System.out.println(tm4);
		
		TreeMap<Sa, Object> tm5 = new TreeMap<Sa, Object>((s1, s2) -> s1.getX() - s2.getX());
		tm5.put(new Sa(5,6), 1);
		tm5.put(new Sa(7,3), 2);	//X-ASC order
		tm5.put(new Sa(6,9), 3);
		System.out.println(tm5);
		
		TreeMap<Sa, Object> tm6 = new TreeMap<Sa, Object>((s1, s2) -> s2.getX() - s1.getX());
		tm6.put(new Sa(5,6), 1);
		tm6.put(new Sa(7,3), 2);	//X-Desc order
		tm6.put(new Sa(6,9), 3);
		System.out.println(tm6);
		
		TreeMap<Sa, Object> tm7 = new TreeMap<Sa, Object>((s1, s2) -> s2.getY() - s1.getY());
		tm7.put(new Sa(5,6), 1);
		tm7.put(new Sa(7,3), 2);	//Y-Desc order
		tm7.put(new Sa(6,9), 3);
		System.out.println(tm7);
				
	}
}
