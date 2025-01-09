package gf.custome_collection;

public class Test01_NITCollection {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
	
/*		
		Vector<Object> obj1 = new Vector<Object>();
		obj1.add("1234");
		obj1.add("1234");
		obj1.add("1234");
		obj1.add("1234");
		System.out.println(obj1.remove("1234"));
*/		
		
		NITCollection col = new NITCollection();
		
		System.out.println("Capacity		: "+col.capacity());
		System.out.println("Size 			: "+col.size());
		System.out.println("Elements		: "+col);
		
		col.add("a");	 System.out.println(col);
		col.add("b");	 System.out.println(col);
		col.add(5);	 System.out.println(col);
		col.add(3.5);	 System.out.println(col);
		col.add('p');	 System.out.println(col);
		col.add(true);	 System.out.println(col);
		col.add(null);	 System.out.println(col);
		col.add(new Ex(5,6));	 System.out.println(col);
		col.add("a");	System.out.println(col);
		col.add(5);	System.out.println(col);
		
		System.out.println();
		System.out.println("Capacity		: "+col.capacity());
		System.out.println("Size 			: "+col.size());
		System.out.println();
		
		//here new array object is created with more capacity
		
		col.add(new Ex(7,8));		System.out.println(col);
		col.add(6.7);	System.out.println(col);
		col.add(null);	System.out.println(col);
		col.add(new Ex(100,200));	System.out.println(col);
		col.add("hk");	System.out.println(col);
		col.add(40.5f); 	System.out.println(col);
		
		System.out.println();
		System.out.println("Capacity		: "+col.capacity());
		System.out.println("Size 			: "+col.size());
		System.out.println("Elements   : "+col);
		System.out.println();
		
		System.out.println(col.contains("a"));
		System.out.println(col.contains(new Ex(5,6)));
		System.out.println(col.contains("A"));
		System.out.println(col.contains(new String("a")));
		System.out.println(col.contains(5));
		System.out.println(col.contains(null));
		System.out.println(col.contains(new Ex(5,6)));
		System.out.println(col.contains(new Ex(9,8))); 
		System.out.println();
		
		System.out.println(col);
		System.out.println();
		System.out.println(col.indexOf("a"));
		System.out.println(col.indexOf("A"));
		System.out.println(col.indexOf(5));
		System.out.println(col.indexOf(null));
		System.out.println(col.indexOf(new Ex(5,6)));
		System.out.println(col.indexOf(true));
		System.out.println(col.indexOf(col.indexOf(new Integer(5))));
		System.out.println(col.indexOf(new Ex(100,200)));
		System.out.println();
		
		System.out.println(col);
		System.out.println(col.indexOf("a"));
		System.out.println(col.lastIndexOf("a"));
		System.out.println(col.indexOf(new Ex(5,6)));
		System.out.println(col.lastIndexOf(new Ex(5,6)));
		System.out.println(col.indexOf("A"));
		System.out.println(col.lastIndexOf("A"));
		System.out.println();
		
		System.out.println(col.get(0));
		System.out.println(col.get(5));
		System.out.println(col.get(15));
		//System.out.println(col.get(20));
		//System.out.println(col.get(-1));
		System.out.println();
		
		System.out.println(col);
		System.out.println(col.remove(2));
		System.out.println(col);
		System.out.println(col.remove("a"));
		System.out.println(col);
		System.out.println(col.remove(new Ex(5,6)));
		System.out.println(col);
		System.out.println(col.remove(null));
		System.out.println(col);
		System.out.println();
		
	
		col.insert(3, "x");
		System.out.println(col);
		col.insert(10, "hyd");
		System.out.println(col);
		System.out.println();
		
		col.set(2, "sss");
		System.out.println(col);
		
	}

}
