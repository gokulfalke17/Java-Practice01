package pune.collection.practice;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test03_VectorCommOpApp {

	public static void main(String[] args) {
		
		Vector v = new Vector();

		do {
			Scanner scn = new Scanner(System.in);
			int choice;
			System.out.println("1. Add New Elements ");
			System.out.println("2. Display Elements ");
			System.out.println("3. Searching Elements Using Contains ");
			System.out.println("4. Searching Elements Using Index ");
			System.out.println("5. Delete Elements ");
			System.out.println("6. Create SubList ");
			System.out.println("7. Total Elements Presents in List ");
			System.out.println("8. Spaces Presents in List");
			System.out.println("9. Exit");
			
			System.out.println("Enter Choice :: ");
			choice = scn.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter Data :: ");
				int value = scn.nextInt();
				
				boolean b = v.add(value);
				if(b) {
					System.out.println("New Elements Added");
				}else {
					System.out.println("Elements Not Added");
				}
				System.out.println();
				break;
			case 2: 
				System.out.println("Elements are :: ");
				System.out.println(v);
				System.out.println();
				break;
			case 3: 
				System.out.println("Enter Search Element By Field :: ");
				int skey = scn.nextInt();
				b = v.contains(skey);
				if(b) {
					System.out.println("Element Found ");
				}else {
					System.out.println("Element Not Present");
				}
				System.out.println();
				break;
			case 4: 
				System.out.println("Enter Search Element By Index :: ");
				skey = scn.nextInt();
				
				int index = v.indexOf(skey);
				if(index!=-1) {
					System.out.println("Element Found");
				}else {
					System.out.println("Element Not Found");
				}
				System.out.println();
				break;
			case 5: 
				System.out.println("Enter Element  for Delete :: ");
				skey = scn.nextInt();
				index = v.indexOf(skey);
				if(index!=0) {
					v.remove(index);
					System.out.println("Element Deleted Successfully.......");
				}else {
					System.out.println("Element Not Found For Deleting....");
				}
				System.out.println();
				break;
			case 6: 
				System.out.println("Enter Start and End index ::");
				int start = scn.nextInt();
				int end = scn.nextInt();
				
				if(start!= -1 && end!=-1) {
					List subList = v.subList(start, end);
					System.out.println("Sub List is :: ");
					System.out.println(subList);
				}
				System.out.println();
				break;
			case 7: 
				System.out.println("Total Elements is :: "+v.size());
				System.out.println();
				break;
			case 8: 
				System.out.println("Spaces Present in List :: "+ (v.capacity() - v.size()));
				System.out.println();
				break;
			case 9: 
				System.exit(0);
			default :
				System.out.println("Invalid Choice..........");
			}
		}while(true);
	}

}
