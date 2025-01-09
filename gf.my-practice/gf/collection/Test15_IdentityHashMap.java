package gf.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * IdentityHashMap is used for storing entries in key's referenced based hash code
 * inside IdentityHashMap object class hashCode() method and equals() method are not used
 * 
 * only referenced with hash code and == operator are used
 * 
 * it will stored data wise duplicate keys
 * */
public class Test15_IdentityHashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(new Sa(5,6), 1);
		hm.put(new Sa(4,3), 2);
		hm.put(new Sa(4,3), 3);		//HashMap is not stored duplicate key's 
		hm.put(new Sa(7,8), 4);
		System.out.println(hm);
		
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<Object, Object>();
		ihm.put(new Sa(5,6), 1);
		ihm.put(new Sa(4,3), 2);
		ihm.put(new Sa(4,3), 3);	//identityHashMap is stored duplicate key's as well as Value's
		ihm.put(new Sa(7,8), 4);
		Sa s1 = new Sa(10, 11);
		ihm.put(s1, 5);
		ihm.put(s1, 6);
		//System.out.println(ihm.put(s1, 5) == ihm.put(s1, 6));
		System.out.println(ihm);
	}
}
