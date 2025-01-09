package gf.collection;

import java.util.HashMap;

public class Test09_Map_HashHap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		System.out.println("Size : "+ hm.size());
		System.out.println("Elements :"+hm);
		System.out.println();
							//  key  value	//
		System.out.print(hm.put("a", 5));	System.out.println("\t"+hm);
		System.out.print(hm.put("b", 6));	System.out.println("\t"+hm);
		System.out.print(hm.put("a", 7));	System.out.println("\t"+hm);
		
	}
}
