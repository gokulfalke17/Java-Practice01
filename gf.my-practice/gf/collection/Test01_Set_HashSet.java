//write a program to show adding, counting and printing object/
//from HashSet collection
//we must use three methods
/*
 * public boolean add(Object obj);
 * public int size();
 * public String toString();
 * */

/*
 * Functionality wise there is not difference HashCode and LinkedHashCode
 * 	//HashCode dose not stores objects in insertion order...
 * 	// where as LinkedHashCode stores objects in insertion order...
 * 
 * */

package gf.collection;

import java.util.HashSet;

public class Test01_Set_HashSet {

	public static void main(String[] args) {
		
		HashSet<Object > hs = new HashSet<>();
		System.out.println("Size :: "+ hs.size());
		System.out.println("Elements :: "+ hs);
		System.out.println();
		
		System.out.print(hs.add("a")); System.out.println(hs);
		System.out.print(hs.add(97));  System.out.println(hs);
		System.out.println(((String)"a").hashCode());
		System.out.println(((Integer)97).hashCode());
		System.out.println(91%16);
		
		 
		//formula for storing objects in HashSet is obj.HashCode() % HS capacity =>
		
		System.out.print(hs.add("a"));		System.out.println("\t"+ hs);   //97%16-->1
		System.out.print(hs.add("b"));		System.out.println("\t"+ hs);  //98%16-->2
		System.out.print(hs.add(5));		System.out.println("\t"+ hs);  //5%16--->5
		//System.out.println(((Integer)5).hashCode());System.out.println();
		//System.out.println();
		System.out.print(hs.add(6.7));		System.out.println("\t"+ hs);  //6%16--->6
		//System.out.println(((Double)6.7).hashCode());
		//System.out.println(-1932132351%16);
		//System.out.println(~-15);
		
		System.out.print(hs.add('p'));		System.out.println("\t"+ hs);  //112%16--->0
		System.out.println(((Character)'p').hashCode());
		System.out.println(112%16);
		System.out.println();
		System.out.print(hs.add(true));		System.out.println("\t"+ hs);  //1231%16-->15
		//System.out.println(((Boolean)true).hashCode());
		//System.out.println(1231%16);
		
		System.out.print(hs.add(null));		System.out.println("\t"+ hs);  //0%16-->0
		System.out.print(hs.add(97));		System.out.println("\t"+ hs);  //0%16-->0
		System.out.print(hs.add(98));		System.out.println("\t"+ hs);  //0%16-->0
		System.out.print(hs.add("a"));		System.out.println("\t"+ hs);	//0%16-->0	
		System.out.print(hs.add(new String("a")));		System.out.println("\t"+ hs);	//0%16-->0	
		
		System.out.print(hs.add((97)));		System.out.println("\t"+ hs);	//0%16-->0	
		System.out.print(hs.add(new Integer(97)));		System.out.println("\t"+ hs);	//0%16-->0	
		System.out.println();
		
		System.out.print(hs.add(new Ex(5,6)));		System.out.println("\t"+ hs);
		System.out.print(hs.add(new Sa(5,6)));		System.out.println("\t"+hs); 
		System.out.print(hs.add(new Sa(5,6)));		System.out.println("\t"+hs); 
		System.out.println();

		System.out.print(hs.add(9L));		System.out.println("\t"+hs); 
		System.out.print(hs.add(10L));		System.out.println("\t"+hs); 		
		System.out.print(hs.add(11L));		System.out.println("\t"+hs); 		
		System.out.print(hs.add(12L));		System.out.println("\t"+hs); 	
		
		System.out.println(((Integer)5).hashCode());
		System.out.println(5%16);
		
		System.out.println(((String)"a").hashCode());
		System.out.println(97%16);

	}


}
