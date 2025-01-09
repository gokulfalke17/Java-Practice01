package org.techhub.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapGeneralApp {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		do {
			Scanner scn = new Scanner(System.in);
			System.out.println("1. Add New Element ");
			System.out.println("2. Search Element By Using get Method ");
			System.out.println("3. Search Element By Using Contains key ");
			System.out.println("4. Feach Data Using entrySet ");
			System.out.println("5. Remove Data by Using key ");
			System.out.println("6. Exit ");
			
			System.out.println("Enter Your Choice :");
			int choice = scn.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter Key and Value");
				Integer key = scn.nextInt();
				scn.nextLine();
				String val = scn.nextLine();
				map.put(key, val);
				System.out.println("Element Added Successfully...");
				System.out.println();
				
				break;
			case 2:
				System.out.println("Enter Key for Search by get() method : ");
				key = scn.nextInt();
				
				String name = map.get(key);
				if(name!=null) {
					System.out.println("Data is :"+ name);
				}else {
					System.out.println("Data Not Found...");
				}
				System.out.println();
				
				break;
			case 3:
				System.out.println("Enter Key for Search by containsKey() method : ");
				key = scn.nextInt();
				
				boolean flag = map.containsKey(key);
				if(flag) {
					System.out.println("Data Found");
				}else {
					System.out.println("Data Not Found...");
				}
				System.out.println();
				
				break;
			case 4:
				System.out.println("Map Data is :");
				Set<Entry<Integer, String>> set = map.entrySet();
				for (Map.Entry<Integer, String> m : set) {
					System.out.println(m.getKey()+"\t"+m.getValue());
				}
				System.out.println();
				
				break;
			case 5:
				System.out.println("Enter Key for Remove : ");
				key = scn.nextInt();
				
				String remove = map.remove(key);
				if(remove != null) {
					System.out.println("Removed Value is :"+ remove);
				}else {
					System.out.println("Key Not Found....");
				}
				System.out.println();
				
				break;
			case 6:
				System.exit(0);
				System.out.println();
				break;
			default:
				System.out.println("Wrong Choice...");
			}
		} while (true);
	}
}
