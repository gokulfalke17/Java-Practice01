package gf.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test23_Iterator_Remove {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
		System.out.println(al);
		Iterator<Object> itr = al.iterator();
//		itr.remove();
		itr.next();
		itr.remove();
//		itr.remove();
		System.out.println(al);
		while(itr.hasNext()) {
			Object obj = itr.next();
//			itr.remove();	//all elements are removed...
			
//			if(obj instanceof Integer) {
//				itr.remove();	//remove all Integer objects
//			}

			if(obj instanceof String) {
				itr.remove();	//removes all String objects
			}
			
			
		}
		System.out.println(al);
		itr.remove();
		System.out.println(al);
	}
}
