package gf.pune.Practical.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Task20_LinkedListPerformOperations {
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println("Here I added Some LinkedList Elements :: ");
		System.out.println(ll);
		System.out.println();

		do {
			Scanner scn = new Scanner(System.in);
			System.out.println("1: Add Element At First");
			System.out.println("2: Add Element At Last");
			System.out.println("3: Remove Element At First");
			System.out.println("4: Remove Element At Last");
			System.out.println("5: Remove Element At Specific Index");
			System.out.println("6: Search Element");
			System.out.println("7: Display All Elements");
			System.out.println("8: Exit");

			System.out.println("Enter Choice :: ");
			int choice = scn.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Element for Add at First :: ");
				Object first = scn.next();
				ll.addFirst(first);
				System.out.println("Element Added Successfully At First...");
				System.out.println();
				break;

			case 2:
				System.out.println("Enter Element for Add at Last :: ");
				Object last = scn.next();
				ll.addLast(last);
				System.out.println("Element Added Successfully At Last...");
				System.out.println();
				break;

			case 3:
				ll.removeFirst();
				System.out.println("Here Element is Removed Successfully At First...");
				System.out.println();
				break;

			case 4:
				ll.removeLast();
				System.out.println("Here Element is Removed Successfully At Last...");
				System.out.println();
				break;

			case 5:
				System.out.println("Enter Specific Element Index for Remove :: ");
				int index = scn.nextInt();
				if (index != -1) {
					ll.remove(index);
					System.out.println("Specific Element Removed Successfully(By Given Index).....");
				} else {
					System.out.println("Index Must be Position...");
				}

				System.out.println();
				break;

			case 6:
				System.out.println("Enter Search Element :: ");
				Object search = scn.next();
				boolean flag = false;
				for(Object obj : ll) {
					if(String.valueOf(obj).equals(search)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Element Found...");
				} else {
					System.out.println("Element Not Found...");
				}

				System.out.println();
				break;
				
			case 7:
				System.out.println("Linked List Data is :: ");
				System.out.println(ll);
				System.out.println();
				break;

			case 8:
				System.out.println("Thank You.! Visit Agin...");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}

		} while (true);
	}
}
