package gf.code_practice;

import java.util.HashSet;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		System.out.println();
		System.out.println(hs.size());
		
		
		System.out.print(hs.add("a"));		System.out.println(hs);
		System.out.print(hs.add("b"));		System.out.println(hs);
		System.out.print(hs.add(5));		System.out.println(hs);
		System.out.print(hs.add(6.7));		System.out.println(hs);
		System.out.print(hs.add(true));		System.out.println(hs);
		System.out.print(hs.add('p'));		System.out.println(hs);
		System.out.print(hs.add(null));		System.out.println(hs);
		System.out.print(hs.add(97));		System.out.println(hs);
		System.out.print(hs.add(98));		System.out.println(hs);
		System.out.print(hs.add("a"));		System.out.println(hs);  
		
		
		
		
		
	}

}
