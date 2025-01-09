package gf.collection.practice;

import java.util.Stack;

public class Test03_Stack {
	
	public static void main(String[] args) {
		
		Stack<Object>  s = new Stack<>();
		
		System.out.println("isEmpty :: "+ s.isEmpty());
		
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println(s);
		System.out.println();
		
		//for removing object elements  last in first out order
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println();
		
		//for retrieving  object elements  in last in first out order and return object
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println();
		
		//for searching object elements  found return its index, not found return -1
		System.out.println(s.search("b"));
		System.out.println(s.search("e"));
	}
}
