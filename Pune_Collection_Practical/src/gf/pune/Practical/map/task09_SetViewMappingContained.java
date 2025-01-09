package gf.pune.Practical.map;

//9. Write a Java program to create a set view of the mappings contained in a map

import java.util.HashMap;
import java.util.Set;

public class task09_SetViewMappingContained {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("suresh", 1);
		hm.put("ram", 2);
		hm.put("ramesh", 3);
		hm.put("shyam", 4);
		hm.put("Yesh", 5);
		System.out.println("Map Entries are : ");
		System.out.println(hm);
		System.out.println();
		
		//Set set = hm.keySet();	//only keys we will get
		Set set = hm.entrySet(); // keys with values 
		System.out.println("Set Values :");
		System.out.println(set);
	}
}
