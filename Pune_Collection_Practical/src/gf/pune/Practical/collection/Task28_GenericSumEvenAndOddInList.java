package gf.pune.Practical.collection;

import java.util.ArrayList;

public class Task28_GenericSumEvenAndOddInList {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(6);
		al.add(4);
		al.add(2);
		al.add(7);
		al.add(5);
		al.add(3);
		al.add(1);
		System.out.println("List is :: ");
		System.out.println(al);
		int even = 0;
		int odd = 0;
		for(int i=0; i<al.size(); i++) {
			if(al.get(i)%2==0) {
				even = even + al.get(i);
			}else {			
				odd = odd + al.get(i);
			}
		}
		
		System.out.println("Even Sum is :: "+ even);
		System.out.println("Odd Sum is :: "+ odd);
		
	}
}	
