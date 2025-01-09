package gf.pune.Practical.map;

//17. Write a Java program to create a HashMap to store Key/Value pair

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class task17_StoreKeyValuePair {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new  HashMap<Object, Object>();
		hm.put("ram", 1);
		hm.put("suresh", 2);
		hm.put("abc", 3);
		hm.put("ramesh", 6);
		hm.put("mno", 4);
		hm.put("pqr", 5);
		
		System.out.println("Keys \t values");
		Iterator<Entry<Object, Object>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Object, Object> entry = itr.next();
			Object keys = entry.getKey();
			Object values = entry.getValue();
			System.out.println(keys+" \t "+values);
		}
	}
}
