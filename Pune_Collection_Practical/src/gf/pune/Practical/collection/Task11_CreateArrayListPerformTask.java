package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_CreateArrayListPerformTask {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		Scanner scn = new Scanner(System.in);
		
		do {
			System.out.println("1. Add Element ");
			System.out.println("2. Display elements ");
			System.out.println("3. Delete Element ");
			System.out.println("4. Insert Element at Specific Index ");
			System.out.println("5. Insert Element at the First Position ");
			System.out.println("6. Update Element at Specific Index ");
			System.out.println("7. Exit");
			System.out.println();
			
			System.out.println("Enter Choice :: ");
			int choice = scn.nextInt();
			switch (choice) {
			case 1: 
				//add elements 
				System.out.println("Enter Element :: ");
				Object element = scn.next();

				al.add(element);
				System.out.println("Element Added Successfully............");
				System.out.println();
				break;
				
			case 2:
				//display all elements 
				System.out.println("Elements are :: ");
				System.out.println(al);
				System.out.println();
				break;
			
			case 3: 
				//delete element 
				System.out.println("Enter Delete Element Index ::");
				int delete = scn.nextInt();
				al.remove(delete);
				System.out.println("Elements Deleted Successfully.........");
				System.out.println("After Deleting Element ::");
				System.out.println(al);
				System.out.println();
				break;
				
			case 4:
				//insert element at specific position
				System.out.println("Enter Element Index for Inserting :: ");
				int index = scn.nextInt();
				
				System.out.println("Enter Element Value for Inserting :: ");
				Object value = scn.next(); 
				
				al.add(index, value);
				System.out.println("Element Added Successfully in Specific Index..........");
				System.out.println("After Inserting Element :: ");
				System.out.println(al);
				System.out.println();
				break;
				
			case 5:
				//insert element at the first position
				System.out.println("Enter Element for Insert at First Position :: ");
				element = scn.next();
				
				al.add(0, element);
				System.out.println("Element Added Successfully in First Position.........");
				System.out.println("After Adding Element in First Position :: ");
				System.out.println(al);
				System.out.println();
				break;
				
			case 6:
				//update element at specific element
				System.out.println("Enter Specific Index for Updaing :: ");
				index = scn.nextInt();
				System.out.println("Enter Updating Element :: ");
				element = scn.next();
				al.set(index, element);
				System.out.println("Element Updated Successfully.........");
				System.out.println("After Updating Element :: ");
				System.out.println(al);
				System.out.println();
				break;
				
			case 7:				
				System.out.println("Thank You.! Visit Again.......");
				System.exit(0);
				
			default :
				System.out.println("Invalid Choice");
				
			}
			
		}while(true);
	}

}	
