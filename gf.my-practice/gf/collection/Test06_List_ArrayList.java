package gf.collection;

import java.util.ArrayList;

public class Test06_List_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		//System.out.println("Capacity :: "+v1.capacity());
		System.out.println("Size :: "+al.size());
		System.out.println("Elements :: "+al);
		System.out.println();
		
		al.add("a");						System.out.println(al);
		al.add("b");						System.out.println(al);
		al.add(5);							System.out.println(al);
		al.add(6); 							System.out.println(al);
		al.add(null);						System.out.println(al);
		al.add(true);						System.out.println(al);
		al.add('p'); 						System.out.println(al);
		al.add(new Ex(5,6));		System.out.println(al);
		al.add(null);						System.out.println(al);
		al.add(5.2f);						System.out.println(al);
		System.out.println(al.size());
		System.out.println();
		
		al.add(5); 						System.out.println(al);
		al.add(new Ex(5, 6));	System.out.println(al);
		al.add(new Sa(5, 6));	System.out.println(al);
		
		System.out.println();
		//System.out.println("Capacity :: "+v1.capacity());
		System.out.println("Size :: "+al.size());
		System.out.println();
		
		System.out.println(al.get(0));	//random access
		System.out.println(al.get(7));
		System.out.println(al.get(9));
		System.out.println();
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+"  ");
		}
		System.out.println();
		
		
		
		
		System.out.println(al.contains("a"));
		System.out.println(al.contains(new String("a")));
		System.out.println();
		
		System.out.println(al.indexOf("a"));
		System.out.println(al.lastIndexOf("a"));
		System.out.println();
		
		System.out.println(al);
		System.out.println(al.remove("a"));
		System.out.println(al);
		
		System.out.println(al);
		System.out.println(al.contains(new Ex(5,6)));
		System.out.println(al.remove(new Ex(5,6)));
		System.out.println(al);
		System.out.println();
		
		System.out.println(al);
		System.out.println(al.contains(new Sa(5,6)));
		System.out.println(al.remove(new Sa(5,6)));
		System.out.println(al);
		
		al.add(5, "XYZ"); 	System.out.println(al);
	}
}
