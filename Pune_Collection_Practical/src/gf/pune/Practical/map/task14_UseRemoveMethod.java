package gf.pune.Practical.map;

//14. Write a Java program to how to use remove() method in HashMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task14_UseRemoveMethod {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(2, "Ram");
		hm.put(1, "Suresh");
		hm.put(3, "Shyam");
		hm.put(5, "Rahul");
		hm.put(4, "Sanket");
		System.out.println("Map Entries are : "+ hm);
		System.out.println();
		
		//#1 :
		hm.remove(3, "Shyam");
		System.out.println("Remove Entry Using Key and Value : "+ hm);
		
		//#2 : 
		hm.remove(4);
		System.out.println("Remove Entry Using Key : "+hm);
		
		//#3 : 
		Iterator<Map.Entry<Object, Object>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Object, Object> entry = itr.next();
			if(entry.getValue().equals("Rahul")) {
				itr.remove();
			}
		}
		System.out.println("Removing Entry : "+ hm);
		
	}
}
