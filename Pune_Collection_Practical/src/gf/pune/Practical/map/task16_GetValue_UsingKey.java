package gf.pune.Practical.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class task16_GetValue_UsingKey {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(5, "abc");
		hm.put(2, "mno");
		hm.put(4, "pqr");
		hm.put(3, "stv");
		hm.put(1, "xyz");
		System.out.println("Map Entries are : "+ hm);
		
		Object key = 3;
		Iterator<Entry<Object, Object>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Object, Object> entry = itr.next();
			if(entry.getKey().equals(key)) {
				System.out.println("Value is : "+entry.getValue());
				break;
			}else {
				System.out.println("Key is Not Match...");
			}
		}
	}
}
