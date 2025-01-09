package gf.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Test22_Iterator {
	public static void main(String[] args) {
		Iterator<Object> itr;
		Vector<Object> v = new Vector<Object>();
		v.add("a");
		v.add(4);
		v.add("b");
		v.add(5);
		v.add("c");
		v.add(6);
		
		itr = v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a1");
		al.add(41);
		al.add("b1");
		al.add(51);
		al.add("c1");
		al.add(61);
		
		itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add("a2");
		lhs.add(42);
		lhs.add("b2");
		lhs.add(52);
		lhs.add("c2");
		lhs.add(62);
		
		itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println();
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>();
		lhm.put("a", 1);
		lhm.put(4, 2);
		lhm.put("b", 3);
		lhm.put(5, 4);
		lhm.put("c", 5);
		lhm.put(6, 6);
		
		//itr = lhm.iterator();
		Set<Object> keys = lhm.keySet();
		itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		Collection<Object> values = lhm.values();
		itr = values.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println();
		
		Set<Map.Entry<Object, Object>> entrySet = lhm.entrySet();
		Iterator<Map.Entry<Object, Object>> itr2 = entrySet.iterator();
//		while(itr2.hasNext()) {
//			System.out.print(itr2.next()+" ");
//		}
//		System.out.println();
		
		while(itr2.hasNext()) {
			Map.Entry<Object, Object> entry = itr2.next();
			System.out.print(entry);
			
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(" --> "+key+"  "+value);
		}
		System.out.println();
		
	}
}	
