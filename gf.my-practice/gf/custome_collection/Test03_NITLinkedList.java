package gf.custome_collection;

public class Test03_NITLinkedList {

	public static void main(String[] args) {
		
		NITLinkedList<Object> nit = new NITLinkedList<Object>();
		System.out.println("Size : "+nit.size());
		System.out.println("Elements : "+nit);
		nit.add(10);
		nit.add("a");
		nit.add("b");
		nit.add(new Integer(5));
		nit.add('p');
		System.out.println("Size : "+nit.size());
		System.out.println(nit);

	}

}
