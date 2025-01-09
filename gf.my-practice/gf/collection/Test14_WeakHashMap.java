package gf.collection;

import java.util.WeakHashMap;

/**
 * WeakHashMap is used for keys with weak references
 * 
 * It means when gc is executed, the entries those dose not have 
 * explicit references are removed from WeakHashMap (WHP).
 * 
 *  HashMap stores objects with strong references means where gc is executed 
 *  entries are not removed even through it dose not have explicit references
 *  
 * */
public class Test14_WeakHashMap {
	public static void main(String[] args) {
		WeakHashMap<Object, Object> whm = new WeakHashMap<Object, Object>();
		Sa s1 = new Sa(5, 6);
		String s2 = new String("a");
		
		whm.put(s1, 1);
		whm.put(new Sa(5,6), 2);
		whm.put(s2, 3);
		whm.put("b", 4);
		whm.put(15, 5);
		whm.put(500, 6);		
		System.out.println(whm);
		System.gc();
		System.out.println(whm);

	}
}
