package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Task29_GenericOccurrenceofTargetIndex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(15); 
		al.add(5); 
		al.add(25);
		al.add(22);
		al.add(5);
		al.add(15);
		System.out.println("List is :: ");
		System.out.println(al);
		
		System.out.println("Enter Target Element :: ");
		int target = scn.nextInt();
		int index = -1;
		
		for(int i=0; i<al.size(); i++) {
			if(al.get(i) == target) {
				index = i;
				break;
			}else {
				System.out.println("Target Element Not Found.....");
			}
		}
		
		if(index != -1) {
			System.out.println("Target Element Found at Index  : "+ index);
		}else {
			System.out.println("Target Element Not Found....");
		}
		
	}

	
}
