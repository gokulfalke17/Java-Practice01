package org.techhub;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		LinkedList<Product> ll = new LinkedList<Product>();
		Product p = null;
		do {
			Scanner scn = new Scanner(System.in);
			System.out.println("1: Add New Product ");
			System.out.println("2: Display All Product ");
			System.out.println("3: Delete Product By Id ");
			System.out.println("4: Search Product By Name ");
			System.out.println("5: Update Product By Id ");
			System.out.println("6: Exit ");

			System.out.println("Enter Choice :: ");
			int choice = scn.nextInt();

			switch (choice) {
			case 1:
				// add new product in factory
				scn.nextLine();
				System.out.println("Product Id :: ");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.println("Prodcut Name :: ");
				String name = scn.nextLine();
				System.out.println("Prodcut Price :: ");
				int price = scn.nextInt();

				p = new Product(id, name, price);
				boolean flag = ll.add(p);
				if (flag) {
					System.out.println("Product Added Successfully.......");
				} else {
					System.out.println("Product Not Added...???  ");
				}

				System.out.println();
				break;

			case 2:
				// display all factory products
				System.out.println("===Products in Factory===");
				for (Object obj : ll) {
					Product p1 = (Product) obj;
					System.out.println(p1.getId() + "\t" + p1.getName() + "\t" + p1.getPrice());
				}

				System.out.println();
				break;

			case 3:
				// delete product by id
				System.out.println("Enter Product Id for Delete :: ");
				int delete = scn.nextInt();
				flag = false;
				for (Object obj : ll) {
					p = (Product) obj;
					if (p.getId() == delete) {
						ll.remove(p);
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Product Deleted Successfully.....");
				} else {
					System.out.println("Product Not Delete...??? ");
				}

				System.out.println();
				break;

			case 4:
				// serach product by name
				scn.nextLine();
				System.out.println("Enter  Product Name for Search :: ");
				String search = scn.nextLine();
				flag = false;
				for (Object obj : ll) {
					p = (Product) obj;
					if (p.getName().equals(search)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Product Found.......");
					System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
				} else {
					System.out.println("Product Not Found...??? ");
				}

				System.out.println();
				break;

			case 5:
				// update product by id
				System.out.println("Enter Product Id For Update :: ");
				int update = scn.nextInt();

				flag = false;
				for (Object obj : ll) {
					p = (Product) obj;
					if (p.getId() == update) {
						flag = true;
						break;
					}
				}
				if (flag) {
					scn.nextLine();
					System.out.println("Enter New Product Id ");
					id = scn.nextInt();
					scn.nextLine();
					System.out.println("Enter New Prodcut Name :: ");
					name = scn.nextLine();
					System.out.println("Enter New Prodcut Price :: ");
					price = scn.nextInt();

					p = new Product(id, name, price);
					flag = ll.add(p);
					System.out.println("Product Updated Successfully.......");
				} else {
					System.out.println("Product Not Found...??? ");
				}

				System.out.println();
				break;

			case 6:
				System.out.println("Thank You..! Visit Again......");
				System.exit(0);
			default:
				System.out.println("Invalid Choice....");
			}
		} while (true);

	}

}
