package gf.collection;

import java.util.LinkedList;

public class Test07_List_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
		//System.out.println("Capacity :: "+v1.capacity());
		System.out.println("Size :: "+ll.size());
		System.out.println("Elements :: "+ll);
		System.out.println();
		
		//operation #1: adding objects
		ll.add("a");						System.out.println(ll);
		ll.add("b");						System.out.println(ll);
		ll.add(5);							System.out.println(ll);
		ll.add(6); 							System.out.println(ll);
		ll.add(null);						System.out.println(ll);
		ll.add("a");						System.out.println(ll);
		ll.add('p'); 						System.out.println(ll);
		ll.add(new Ex(5,6));		System.out.println(ll);
		ll.add(null);						System.out.println(ll);
		ll.add(5.2f);						System.out.println(ll);
		System.out.println();
		System.out.println("Now Size is :: "+ ll.size());
		System.out.println();
		
		ll.add(5); 				System.out.println(ll); 
		ll.add(new Ex(5, 6));	System.out.println(ll);
		ll.add(new Sa(5, 6));	System.out.println(ll);
		
		System.out.println();
		//operation #2: counting objects
		//System.out.println("Capacity :: "+v1.capacity());
		System.out.println("Size :: "+ll.size());
		System.out.println();
		
		//operation #3: printing object 
		System.out.println(ll);
		System.out.println();

		
		//operation 4: searching object [ == operation and .equals() ]
		System.out.println(ll.contains("a"));								//s("a").equals(node.item)
		System.out.println(ll.contains(new String("a")));		//s("a").equals(node.item)
		
		System.out.println(ll.contains(5));									//I(5).equals(node.item)
		System.out.println(ll.contains(new Integer(5)));		//I(5).equals(node.item)
		
		System.out.println(ll.contains(null));							//null == node.null
		
		System.out.println(ll.contains(new Ex(5, 6)));		//Ex(5,6).equals(node.item)
		System.out.println(ll.contains(new Sa(5, 6)));		//Sa(5,6).equals(node.item)
		System.out.println();
		
		//operation #5: retrieving index number of given object
		System.out.println(ll.indexOf("a"));
		System.out.println(ll.lastIndexOf("a"));
		
		System.out.println(ll.indexOf(5));
		System.out.println(ll.indexOf(new Integer(5)));
		
		System.out.println(ll.indexOf(null));
		
		System.out.println(ll.indexOf(new Ex(5, 6)));
		System.out.println(ll.indexOf(new Sa(5, 6)));
		System.out.println();
		
		System.out.println(ll.lastIndexOf("a"));
		System.out.println(ll.lastIndexOf(new String("a")));
		System.out.println();
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(9));
		System.out.println(ll.get(12));
		System.out.println(ll.get(7));
		//System.out.println(ll.get(-1));
		//System.out.println(ll.get(13));
		System.out.println();
		
		
		
		System.out.println(ll);
		System.out.println(ll.remove("a"));
		System.out.println(ll);
		System.out.println(ll.contains(new Ex(5,6))); 
		System.out.println(ll.remove(new Sa(5,6)));
		System.out.println(ll);
		System.out.println();
	
	}
}

