package gf.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test21_Enumeration {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add("a");
		v.add(4);
		v.add("b");
		v.add(5);
		v.add("c");
		v.add(6);
		System.out.println(v);
		
//		for(int i=0;i<v.size(); i++) {
//			System.out.print(v.get(i)+" ");
//		}
		
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		System.out.println();
		
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		ht.put("a", 1);
		ht.put("b", 2);
		Enumeration<Object> e2 = ht.keys();
		while (e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
		System.out.println();
		
		Enumeration<Object> e3 = ht.elements();
		while (e3.hasMoreElements()) {
			System.out.println(e3.nextElement());
		}
		System.out.println();
		
//=========================================================================================================
		
		Enumeration<Object> e4 = Collections.enumeration(v); //CsF Enumeration
		while (e4.hasMoreElements()) {
			System.out.print(e4.nextElement()+" ");
		}
		System.out.println();
		System.out.println();
		
//=========================================================================================================
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a1");
		al.add(41);
		al.add("b1");
		al.add(51);
		al.add("c1");
		al.add(61);
		
		Enumeration<Object> e5 = Collections.enumeration(al);
		while (e5.hasMoreElements()) {
			System.out.print(e5.nextElement()+" "); 
			
		}
		System.out.println();
		
//==========================================================================================================
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add("a2");
		lhs.add(42);
		lhs.add("b2");
		lhs.add(52);
		lhs.add("c2");
		lhs.add(62);
		
		Enumeration<Object> e6 = Collections.enumeration(lhs);
		while (e6.hasMoreElements()) {
			System.out.print(e6.nextElement()+" ");
			
		}
		System.out.println();
		
		
		
	}
}
