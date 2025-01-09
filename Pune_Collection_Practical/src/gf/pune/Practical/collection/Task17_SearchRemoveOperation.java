package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task17_SearchRemoveOperation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		Iterator<Object> i = al.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			System.out.print(obj+" ");
		}
		System.out.println();
		 
		System.out.println("Enter Search Element :: ");
		Object search = scn.nextLine();
		
		boolean flag = false;
		for(int j=0;j<al.size();j++) {
			if(search.equals((al.get(j).toString()))) {
				flag = true;
				al.remove(j); 
				System.out.println(flag && search.equals((al.get(j).toString())));
				break;
			}
		}
		if(flag) {
			System.out.println("Element Found And Search Element Deleted....");
		}else {
			System.out.println("Element Not Found...");
		}
		System.out.println(al);
		
	}
}
