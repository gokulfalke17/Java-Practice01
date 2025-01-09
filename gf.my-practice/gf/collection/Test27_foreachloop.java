package gf.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Test27_foreachloop {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
		
		//Enhance for loop or for-each loop
			//for(var dec : (array/ Iterable) obj) {
					//blogic
			//}
		
		for(Object obj : al) {
			if(obj instanceof String s) {
				System.out.print(s.toUpperCase()+" ");
			}else {
				System.out.print(obj+" ");
			}
		}
		System.out.println();
		
		/**
		 * 
		 * for(Iterator<Object> itr = al.iterator().itr.hasNext(); ){
		 * 		Object obj = itr.next()
		 * 		if(obj instanceof String s) {
		 * 			System.out.println(s.toUpperCase());
		 * 		}else {
		 * 			System.out.println(obj);
		 * 		}
		 * }
		 * 
		 * */
		
		//Rules of enhance for loop 
		
		//#rule #1: the variable type must be the itr.next() return type or its super class type
		
		ArrayList<String> al2 = new ArrayList<String>();
		for(String s : al2) { }
		for(Object obj : al2) { }
//		for(Integer i : al2) { }	//CE
		
		//Rule #2: the object type must be an array or Iterable type
		String s = "hari";
//		for(String ss : s) { } 	//CE
		
		String str[] = new String[5];
		for(String ss : str) { }
		
		int i = 12345;
//		for(Integer val : i) { }	//CE
		
		int ia[] = {1,2,3,4,5};
		for(Integer val : ia) { } 
		
		for(String s2 : al2) { }
		
		Iterator<String> itr2 = al2.iterator();
//		for(String s2 : itr2) { }	//CE
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(int i2 : lhs) { }
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
//		for(int i2 : lhm) { } 	//CE
		for(int i2 : lhm.keySet()) { }
		for(String s2 : lhm.values()) { }
		
		for(Map.Entry<Integer, String> entry : lhm.entrySet()) { }
		
		//Rule #3 : the separator must be : it must not , or ; or =
/*		
		for(String s2 , al2) { }
		for(String s2 ; al2) { }		CE		
		for(String s2 = al2) { }
*/	
		//Rule #4: 
		String s2;
		//for(s2 : al) { }	//CE
	}
	
}
