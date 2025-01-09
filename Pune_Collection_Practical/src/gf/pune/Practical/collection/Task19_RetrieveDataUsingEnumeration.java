package gf.pune.Practical.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Task19_RetrieveDataUsingEnumeration {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		v.add(10);
		v.add(40);
		v.add(20);
		v.add("A");
		v.add("B");
		v.add("C");
		
		System.out.println("Retrieve Data By Using Enumeration :: ");
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements()) {
			Object obj = e.nextElement();
			System.out.print(obj+" ");
		}
	}
}
