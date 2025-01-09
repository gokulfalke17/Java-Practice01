package gf.pune.Practical.collection;

import java.util.Vector;

public class Task03_StoreObjectAndDisplayEmployeeDetails {
	public static void main(String[] args) {
		Vector<Employee> v1 = new Vector<Employee>();
		//Employee e1 = new Employee(101, "ABC", "Developer", 10000, "TCS"); 
		//v1.add();
		
		System.out.println(v1);
		
		Vector<Employee> v2 = new Vector<Employee>();
		//Employee e2 = new Employee(102, "MNO", "Manager", 25000, "Wipro");
		//v2.add();
		
		System.out.println(v2);
	}
}

class Employee {
	
	private int id;
	private String name;
	private String desc;
	private int salary;
	private String company;
	
	public Employee(int id, String name, String desc, int salary, String company) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.salary = salary;
		this.company = company;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return " ( " + id + ",  " + name + ",  " + desc + ",  " + salary + ",  "+ company + " ) ";
	}
	
	
	
}
