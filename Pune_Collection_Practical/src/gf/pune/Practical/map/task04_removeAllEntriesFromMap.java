package gf.pune.Practical.map;

//4. Write a Java program to remove all the mappings from a map

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task04_removeAllEntriesFromMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(5, 1);
		hm.put("p", 2);
		hm.put("a", 3);
		hm.put(100, 4);
		hm.put("b", 5);
		hm.put("b", 6);
		
		System.out.println("Before Removing Entries :");
		for(Map.Entry<Object, Object> entry : hm.entrySet()) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println();
		
		System.out.println("After Removing all Entries :");
		Iterator<Object> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		
		System.out.println(hm);
		
	}
}
