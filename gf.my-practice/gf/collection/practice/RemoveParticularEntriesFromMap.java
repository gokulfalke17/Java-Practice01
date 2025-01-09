package gf.collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveParticularEntriesFromMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(1, "Ram");
		hm.put(2, "Shyam");
		hm.put(3, "Rahul");
		hm.put(4, "Ramesh");
		hm.put(5, "Sanket");
		System.out.println("Entries are : "+hm);
		System.out.println();
		
		hm.remove(3, "Rahul");
		System.out.println("After Removing Particular Entry :");
		Iterator<Entry<Object, Object>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Object, Object> entry = i.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println();
		
		
		hm.remove(2);
		System.out.println(hm);
		System.out.println();
		
		Iterator<Entry<Object, Object>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Object, Object> entry = itr.next();
			if(entry.getKey().equals(5)) {
				itr.remove();
			}
		}
		
		System.out.println("Removeing Entry :"+ hm);
	}
}	
