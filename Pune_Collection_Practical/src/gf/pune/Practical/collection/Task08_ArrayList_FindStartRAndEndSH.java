package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Scanner;

//Q4.WAP to create ArrayList and Store 10 employee data in it means store 10 employee POJO class object in ArrayList
//		and find the employee whose name start with r and end with sh

class Employee02 {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " ( id=" + id + ", name=" + name + " ) ";
	} 
	
}

public class Task08_ArrayList_FindStartRAndEndSH {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Employee02> al = new ArrayList<>();
		Employee02 emp[] = new Employee02[5];
		
		for(int i=0;i<emp.length;i++) {
			emp[i] = new Employee02();
			
			System.out.println("Enter Employee Id :: ");
			int id = scn.nextInt(); scn.nextLine();
			
			System.out.println("Enter Employee Name :: ");
			String name = scn.nextLine();
			
			emp[i].setId(id);
			emp[i].setName(name);
			
			al.add(emp[i]);
		}
		System.out.println();
		
		System.out.println("Employee Details :: ");
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
		System.out.println();
		
		startsEndsWith(al) ;
		
	}

	private static void startsEndsWith(ArrayList<Employee02> al) {
		
		System.out.println("Names Start With 'R' and End With 'SH' :: ");
		for(Employee02 str : al) {
			if(str.getName().toLowerCase().startsWith("r") && str.getName().toLowerCase().endsWith("sh")) {
				System.out.println(str);
			}
		}
		
	}
	
	
}
