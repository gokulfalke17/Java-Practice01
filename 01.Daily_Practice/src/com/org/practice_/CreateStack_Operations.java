package com.org.practice_;

import java.util.Scanner;
import java.util.Stack;

/*
 Q. WAP to Create Stack and perform following operation on it 
    Case 1: push  case 2: pop   case 3: peek() case 4: display all values 
*/
public class CreateStack_Operations {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("1.PUSH() : ");
			System.out.println("2.POP() : ");
			System.out.println("3.PEEK() : ");
			System.out.println("4.Display All Data : ");
			System.out.println();

			System.out.println("Enter Your Choose : ");
			int choose = scn.nextInt();

			switch (choose) {

			case 1:
				System.out.println("Enter Element In Stactk : ");
				int element = scn.nextInt();

				int value = stack.push(element);

				if (value > 0) {
					System.out.println("Element is Added In Stck...");
				} else {
					System.out.println("Element is Not Add.");
				}
				System.out.println();
				break;

			case 2:
				boolean flag = stack.empty();
				if (flag) {
					System.out.println("Stack is Empty...");
				} else {
					Object obj = stack.pop();
					System.out.println(obj);
				}

				System.out.println();
				break;

			case 3:
				flag = stack.empty();
				if (flag) {
					System.out.println("Stack is Empty...");
				} else {
					Object obj = stack.peek();
					System.out.println(obj);
				}

				System.out.println();
				break;
				
			case 4:
				
				flag = stack.empty();
				System.out.println("Stack Elements are : ");
				if(flag) {
					System.out.println("Data Not Found in Stack...");
				}else {
					stack.forEach(System.out::println);
				}
				System.out.println();
				break;
			case 5:
				System.out.println("Wrong Choose...");
				break;

			case 6:
				System.exit(0);

			}

		} while (true);
	}
}
