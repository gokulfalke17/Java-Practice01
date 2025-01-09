package pune.collection.practice;

import java.util.ArrayList;
import java.util.Vector;

public class Test02_VectorApp {
	public static void main(String[] args) {
		//Vector v = new Vector();
		//Vector v = new Vector(3);
		//Vector v = new Vector(3,2);
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		Vector v = new Vector(al);
		System.out.println(v);
		System.out.println("Vector Capacity is :: "+v.capacity());
		
	}
}
