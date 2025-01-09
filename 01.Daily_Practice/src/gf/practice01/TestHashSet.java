package gf.practice01;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<Object>();
		System.out.println("Default Size : "+set.size());
		set.add(5);
		set.add(4);
		set.add(10);
		set.add(5);	//not stores it is duplicate
		set.add(8);
		set.add(25);
		set.add(30);
		set.add(1);
		set.add(null);
		set.add("a");
		set.add('p');
		
		System.out.println(set);
		System.out.println("Current Size : "+ set.size());
		System.out.println();
		
		System.out.println(set.contains(5));	//true
		System.out.println(set.contains(11));	//false
		System.out.println(set.contains(-1));	//fasle
		
		
		
	}
}
