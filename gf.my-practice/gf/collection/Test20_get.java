package gf.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test20_get {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
//		System.out.println(al);
		
		/**
		 * we can retrieve object two ways
		 * 	1. random access
		 * 	2. sequential access
		 * 
		 * */
		
		//random access
		System.out.println(al.get(0));
		System.out.println(al.get(4));
		System.out.println(al.get(2));
		System.out.println(al.get(5));
		System.out.println();
		
		//sequential access
		System.out.println(al.get(0));	//static natural code
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println();
		
	//Rule #1: index>=0 && index<=size() else RE: IOOBE
//		System.out.println(al.get(-1));
//		System.out.println(al.get(10));
		System.out.println(al.get(0));
		System.out.println(al.get(5));
		
		//for(int i=0; i<=al.size(); i++) {		//values + IOOBE
		//for(int i=0; i<=al.size()-1; i++) {		//values
		for(int i=0; i<al.size()-1; i++) {		//last value is not retrieve
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println();
		
	//Rule #2: we can not assign the returned object to its own type
		//so get method return type is Object,
		//because ArrayList<Object> here we pass generic is Object...
//		String s = al.get(0); 	//CE
		Object obj = al.get(0);
		System.out.println(obj);
		
	//Rule #3: we can invoked returned object specific methods
		//by using Object type variable it leads CE : c f s
		//we must type cast the returned object to its own type
//		System.out.println(obj.toUpperCase());
//		String str = (String)obj;	//it leads CCE when its first value is not String
//		System.out.println(str.toUpperCase());
		
	//Rule #4: we must type cast object inside if(instanceOf) condition
		if(obj instanceof String) {		//Java 5v Style...
			String s = (String) obj;
			System.out.println(s.toUpperCase());
		}
		System.out.println();
		
		
	//Rule #5: we can not use get method in set
		//because set dose not have index
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(5);
		lhs.add("a");
		System.err.println(lhs);
		
//		System.out.println(lhs.get(0));	//CE : c f s
		
		//for retrieving objects from set, we must use cursor objects
			/**
			 * 1. Enumeration or
			 * 2. Iterator or 
			 * 3. ListIterator or
			 * 4. 	for-each loop or 
			 * 5. forEach(-) method or
			 * 6. Stream API or
			 * 7. Spliterator 
			 * */
	}
}
