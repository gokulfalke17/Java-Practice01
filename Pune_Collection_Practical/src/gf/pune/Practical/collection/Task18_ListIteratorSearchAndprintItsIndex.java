package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Task18_ListIteratorSearchAndprintItsIndex {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("A");
		al.add("B");
		al.add("C");
		
		 ListIterator<Object> li = al.listIterator();
		 
		System.out.println("Dispaly Array List In Forword Direction :: ");
		 while (li.hasNext()) {
			 System.out.print(li.next()+" ");
	     }
		 System.out.println();
		 System.out.println();
		 
		 System.out.println("Dispaly Array List In BackWord Direction :: ");
		 while(li.hasPrevious()) {
			 System.out.print(li.previous()+" ");
		 }
		 System.out.println();
		 
		 System.out.println("Enter Element for Search ::");
		 String search = scn.next();
		 Object obj = null;

		 try {
		     obj = Integer.parseInt(search);
		 } catch (NumberFormatException e) {
		     obj = search; // it is already string
		 } 

		 boolean flag = false;
		 for(int i=0;i<al.size();i++) {
		     if(al.get(i).equals(obj)) {
		         flag = true;
		         System.out.println("Index is :: "+ i);
		         break;
		     }
		 }

		if(flag) {
		    System.out.println("Element Found");
		}else {
		    System.out.println("Element Not Found...");
		}
	}
}
