package gf.practice01;

import java.util.Vector;

class Address {
	String hno, city, ph;

	public Address(String hno, String city, String ph) {
		this.hno = hno;
		this.city = city;
		this.ph = ph;
	}

}

class Customer {
	
	String name;
	int age;
	Address address;
	public Customer(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer ( Name=" + name + ", Age=" + age + ", Hno=" + address.hno + ", City="+ address.city+", "+"Ph="+address.ph +" ) ";
	}
	
	
}

public class VectoyCapacitySixeDemo {
	
	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>(3);
		System.out.println("Size : "+ v.size());
		System.out.println("Elements : "+ v);
		System.out.println("Capacity : "+ v.capacity());
		System.out.println();
		
		Customer c1 = new Customer("ABC", 23, new Address("1-20-A", "Pune", "12345"));
		Customer c2 = new Customer("MNO", 18, new Address("123-AA", "Mumbai", "112233"));
		Customer c3 = new Customer("PQR", 34, new Address("2-22-BB", "Hydrabad", "56789"));
		Customer c4 = new Customer("STV", 20, new Address("55-3-E", "Nashik", "554466"));
		
		v.add(c1);
		v.add(c2);
		v.add(c3);
		v.add(c4);
		
		System.out.println("Objects are : ");
		for(Object obj : v) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("Capacity : "+ v.capacity());
		System.out.println("Size : "+ v.size());
		System.out.println();
		
		v.remove(2); //delete 2nd index object
		System.out.println("Removing Object : ");
		for(Object obj : v) {
			System.out.println(obj);
		}
		System.out.println();
		 
		System.out.println(v.contains(c3)); //false, because we just delete that index
		System.out.println();
		
		System.out.println(v.indexOf(c3));	//index -1 not found 
		System.out.println(v.indexOf(c4));	//index 2 return 
	}
}
