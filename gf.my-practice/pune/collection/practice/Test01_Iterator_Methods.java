package pune.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01_Iterator_Methods {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		Iterator i = al1.iterator();
		
		while(i.hasNext()) {
			Object val = i.next();
			System.out.print(val+"\t");
		}		
		System.out.println();
		
		System.out.println("Number of Elements are Present in Collection :: "+al1.size());
		
		boolean b1 = al1.isEmpty();
		if(b1) {
			System.out.println("Collection is Empty");
		}else {
			System.out.println("Collection is Not Empty");
		}
		
		boolean b2 = al1.contains(30);
		if(b2) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Elements is Not Present");
		}
		
		Object object[] = al1.toArray();
		for(int i1=0;i1<object.length;i1++) {
			System.out.print(object[i1]+"\t");
		}
		System.out.println();
		
		boolean b3 = al1.add(60);
		if(b3) {
			System.out.println("New Element Added Successfully.....");
		}
		else {
			System.out.println("New Element Not Added.......");
		}
		System.out.println(al1);
		
	try {
		Object obj1 = al1.get(10);
		System.out.println(obj1);
	} catch (IndexOutOfBoundsException e) { 
		System.out.println("Error :: "+e.getMessage()); 
	}
	
	Object ele = al1.set(1, 500);
	System.out.println(ele);
	System.out.println(al1);	
	
	
		
	}
}
