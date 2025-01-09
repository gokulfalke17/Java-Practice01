package com.org.practice_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 
Q. WAP to create ArrayList and store product objects in it and fetch it using 
   Iterator,ListIterator and forEach?

*/
class Product01 {

	private int prodId;
	private String prodName;
	private int prodPrice;
	private int prodContity;

	public Product01() {
	}

	public Product01(int prodId, String prodName, int prodPrice, int prodContity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodContity = prodContity;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdContity() {
		return prodContity;
	}

	public void setProdContity(int prodContity) {
		this.prodContity = prodContity;
	}

	@Override
	public String toString() {
		return "Product01 [ prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "prodPrice="
				+ prodContity + " ] ";
	}

}

public class FatchProductObjectUsing_Iterator_ListIterator_forEachLoop {

	public static void fatchUsingIterator(List<Product01> list) {
		System.out.println("Fatch Data Using Iterator : ");
		System.out.println("----------------------------");
		Iterator<Product01> iterator = list.iterator();
		boolean flag = false;
		Product01 prod = null;
		while (iterator.hasNext()) {
			prod = iterator.next();
			System.out.println(prod.getProdId() + "  " + prod.getProdName() + "  " + prod.getProdPrice() + "  "+ prod.getProdContity());
			flag = true;
		}

		if (!flag) {
			System.out.println("No Product Found...");
		}
		System.out.println();
	}

	public static void fatchUsingListIterator(List<Product01> list) {
		System.out.println("Fatch Data Using ListIterator : ");
		System.out.println("--------------------------------");
		ListIterator<Product01> listIterator = list.listIterator();
		boolean flag = false;
		Product01 prod = null;
		while (listIterator.hasNext()) { 
			prod = listIterator.next();
			System.out.println(prod.getProdId() + "  " + prod.getProdName() + "  " + prod.getProdPrice() + "  "+ prod.getProdContity());
			flag = true;
		}

		if (!flag) {
			System.out.println("No Product Found...");
		}
		System.out.println();
	}

	public static void fatchUsingForEach(List<Product01> list) {
		System.out.println("Fatch Data Using ForEach Loop : ");
		System.out.println("--------------------------------");
		list.forEach(System.out::println);
		System.out.println();

	}

	public static void main(String[] args) {

		List<Product01> list = new ArrayList<Product01>();
		list.add(new Product01(101, "iPhones", 500000, 5));
		list.add(new Product01(102, "watchs", 50000, 10));
		list.add(new Product01(104, "Shose", 65000, 5));
		list.add(new Product01(103, "Laptops", 300000, 5));

		fatchUsingIterator(list);
		fatchUsingListIterator(list);
		fatchUsingForEach(list);

	}
}
