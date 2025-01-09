package gf.code_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class KthSmallest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(20);
		al.add(30);
		al.add(60);
		al.add(50);
		al.add(30);
		System.out.println("List is :");
		System.out.println(al);
		
		for(int i=0;i<al.size(); i++) {
			for(int j=0; j<al.size()-i-1; j++) {
				if(al.get(j) > al.get(j+1)) {
					int temp = al.get(j);
					al.set(j, al.get(j+1));
					al.set(j+1, temp);
				
				}
			}
		}
		
		System.out.println("Sorted List is :");
		System.out.println(al);
		
		System.out.println("Enter Kth Value :");
		int Kth = scn.nextInt();
		
		int count = 0;
		System.out.println("Kth Smallest Element is :");
		for(int i=0; i<al.size(); i++) {
			if(al.get(i)!=al.get(i+1)) {
				count++;
			}
			if(count==Kth) {
				System.out.print(al.get(i));
				break;
			}
		}
		System.out.println();
	}
}
