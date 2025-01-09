package gf.collection;

import java.util.LinkedHashMap;

/**
 * 
 * LinkedHashMap is used for storing entries in insertion order
 * 
 * duplicate keys are not allowed
 * duplicate values are allowed
 * 
 * as key only one null allowed
 * as value multiple nulls allowed
 * 
 * */
public class Test11_Map_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>();
		System.out.println("Size is : "+ lhm.size());
		System.out.println("Elements : "+lhm);
		System.out.println(lhm.put("a", 1));
		System.out.println(lhm.put("b", 2));
		System.out.println(lhm.put(5, 3));
		System.out.println(lhm.put(null, 4));
		System.out.println(lhm.put(true, 5));
		System.out.println(lhm.put(new Ex(5,6), 6));
		System.out.println(lhm.put(new Sa(5,6), 7));
		System.out.println(lhm); 
		
		System.out.println(lhm.put("a", 8));	//here key is duplicate it not stored...
		System.out.println(lhm.put(5, 9));		//here key is duplicate it not stored...
		
		System.out.println(lhm.put(new Ex(5,6), 10));	//it is stored because equals and hashCode() methods are not override
														//it hashCode is different that's why it is stored...
		
		System.out.println(lhm.put(new Sa(5,6), 11));	//here equals() and hashCode() methods are override that's why it 
														//is stored...
		
		System.out.println("Now Size is :"+lhm.size());	//size is : 8
		System.out.println(lhm);	//{a=8, b=2, 5=9, null=4, true=5, Ex(5,  6)=6, Sa(5,  6)=7, Ex(5,  6)=10}
	}
	
}	
