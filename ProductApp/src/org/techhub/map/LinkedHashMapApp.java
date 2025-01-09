package org.techhub.map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapApp {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(1, "ABC");
		hm.put(20, "GENESH");
		hm.put(33, "SURESH");
		hm.put(40, "SANDEEP");
		hm.put(5, "RAJU");
		hm.put(6, "SHYAM");
		hm.put(75, "MNO");
		hm.put(83, "PQR");
		
		Set<Integer> k = hm.keySet();
		
		System.out.println("Map List is :");
		for (Integer key : k) {
			String value = hm.get(key);
			System.out.println(key+"-->"+value);
		}
	}
}
