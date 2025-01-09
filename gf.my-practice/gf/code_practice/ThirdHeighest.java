package gf.code_practice;

import java.util.ArrayList;

public class ThirdHeighest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(60);
		al.add(50);
		al.add(60);
		al.add(40);
		System.out.println("List is :: ");
		System.out.println(al);
		
		int heighest = al.get(0);
		int second = al.get(0);
		int third = 0;
		
		for(int i=0;i<al.size(); i++) {
			if(heighest < al.get(i)) {
				third = second; 
				second = heighest;
				heighest = al.get(i);
			}else if(heighest > al.get(i) && second < al.get(i)) {
				third = second;
				second = al.get(i);
			}else if(second > al.get(i) && third < al.get(i)) {
				third = al.get(i);
			}
		}
		
		System.out.println("Heighest is :: "+ heighest);
		System.out.println("Second Heighest is :: "+ second);
		System.out.println("Third Heighest is :: "+ third);
	}
}

/*
	List is :: 
	[10, 50, 30, 40, 20, 60, 50, 60, 40]
	Heighest is :: 60
	Second Heighest is :: 50
	Third Heighest is :: 40
*/
