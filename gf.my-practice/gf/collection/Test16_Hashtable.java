package gf.collection;

import java.util.Hashtable;

/**
 * Hashtable is a Legacy collection, available from java 1.0v
 * 
 *  Hashtable is synchronized collection. It is used for storing entries is 
 *  in multithreaded application with thread-safty.
 *  
 *  as key -> Homogeneous, Heterogeneous, Unique objects are allowed
 *  as value -> all 4 types of objects are allowed like as Homogeneous, Heterogeneous, Unique and Duplicate
 *  
 *  as key -> null is not allowed, leads to NullPointerException (NPE)
 *  as value also null is not allowed
 *  
 *  Default Capacity : 11
 *  
 *  Data Structure : hash table with buckets
 *  sorting order is hash code reverse insertion order
 *  
 * */
public class Test16_Hashtable {
	public static void main(String[] args) {
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		ht.put("a", 1);
		ht.put("b", 2);
		System.out.println(ht);
		ht.put(97, 3);
		ht.put(98, 4);
		ht.put(98, 5);	// here key's duplicate not allowed not stored but here value's duplicate allowed
		System.out.println(ht);
		//ht.put(null, 6);		//NullPointerException
		//ht.put("x", null);	//NullPointerException
	}
}
