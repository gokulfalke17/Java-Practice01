package gf.collection;

import java.util.Stack;

public class Test08_List_Stack {
	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<>();
		System.out.println("Stack Default Size is :: "+ stack.size());
		System.out.println(stack);
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		System.out.println(stack);
		
		//RRR
		System.out.println(stack.pop());		//Object obj = get(size()-1)
		System.out.println(stack);					//remove(size()-1)
																			//return obj
		
		System.out.println(stack.pop());		//Object obj = get(size()-1)
		System.out.println(stack);					//remove(size()-1)
		System.out.println();							//return obj
		
		//RR
		System.out.println(stack.peek());	//Object obj = get(size()-1)
		System.out.println(stack);					//return obj
					
		System.out.println(stack.peek());	//Object obj = get(size()-1)
		System.out.println(stack);					//return obj
		
//		stack.add(5);
//		System.out.println(stack);
//		Object obj = stack.get(2);
//		System.out.println(obj);
		
	}
}
