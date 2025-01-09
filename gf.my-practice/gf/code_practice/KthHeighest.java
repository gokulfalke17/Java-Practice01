package gf.code_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthHeighest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
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
		
		Collections.sort(al);
		System.out.println("After Soring List : ");
		System.out.println(al);
		
		System.out.println("Enter Kth Element : ");
		int Kth = scn.nextInt();//3
		int count = 0;
		
	}
}

