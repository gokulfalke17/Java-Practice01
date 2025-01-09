//write a program to show adding, counting and printing object
//from HashSet collection
//we must use three methods
/*
 * public boolean add(Object obj);
 * public int size();
 * public String toString();
 * 
 * */

//In LinkedHashSet values  stored in insertion  order 

package gf.collection;

import java.util.LinkedHashSet;

public class Test02_Set_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Object >  lhs = new LinkedHashSet<>();
		System.out.println("Size :: "+lhs .size());
		System.out.println("Elements :: "+ lhs);
		System.out.println();
		
		//formula for storing objects in HashSet is obj.HashCode() % HS capacity =>
		
		System.out.print(lhs.add("a"));		System.out.println("\t"+ lhs);   //97%16-->1
		System.out.print(lhs.add("b"));		System.out.println("\t"+ lhs);  //98%16-->2
		System.out.print(lhs.add(5));		System.out.println("\t"+ lhs);  //5%16--->5
		System.out.print(lhs.add(6.7));		System.out.println("\t"+ lhs);  //6%16--->6
		//System.out.println(((Double)6.7).hashCode());
		//System.out.println(-1932132351%16);
		//System.out.println(~-15);
		
		System.out.print(lhs.add('p'));		System.out.println("\t"+ lhs);  //112%16--->0
		System.out.print(lhs.add(true));		System.out.println("\t"+ lhs);  //1231%16-->15
		//System.out.println(((Boolean)true).hashCode());
		//System.out.println(1231%16);
		
		System.out.print(lhs.add(null));		System.out.println("\t"+ lhs);  //0%16-->0
		System.out.print(lhs.add(97));		System.out.println("\t"+ lhs);  //0%16-->0
		System.out.print(lhs.add(98));		System.out.println("\t"+ lhs);  //0%16-->0
		System.out.print(lhs.add("a"));		System.out.println("\t"+ lhs);	//0%16-->0	
		System.out.print(lhs.add(new String("a")));		System.out.println("\t"+ lhs);	//0%16-->0	
		
		System.out.print(lhs.add((97)));		System.out.println("\t"+ lhs);	//0%16-->0	
		System.out.print(lhs.add(new Integer(97)));		System.out.println("\t"+ lhs);	//0%16-->0	
		System.out.println();
		
		System.out.print(lhs.add(new Ex(5,6)));		System.out.println("\t"+ lhs);
		System.out.print(lhs.add(new Sa(5,6)));		System.out.println("\t"+lhs); 
		System.out.print(lhs.add(new Sa(5,6)));		System.out.println("\t"+lhs); 
		System.out.println();

		System.out.print(lhs.add(9L));		System.out.println("\t"+lhs); 
		System.out.print(lhs.add(10L));		System.out.println("\t"+lhs); 		
		System.out.print(lhs.add(11L));		System.out.println("\t"+lhs); 		
		System.out.print(lhs.add(12L));		System.out.println("\t"+lhs); 				

	}


}
