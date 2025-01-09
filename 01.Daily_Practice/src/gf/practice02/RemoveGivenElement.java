package gf.practice02;

import java.util.List;
import java.util.Vector;

public class RemoveGivenElement {

	public static void main(String[] args) {

		Integer element = 20;
		List<Integer> newList = removeGivenElement(element);
		System.out.println();
		
		
		System.out.println("After Removing Element : ");
		newList.forEach(ele->System.out.print(ele+" "));
		
	}

	public static List<Integer> removeGivenElement(Integer element) {
		List<Integer> list = new Vector<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		boolean flag = list.remove(element);
		if(flag) {
			System.out.println("Element Removed Successfully...");
		}else {
			System.out.println("Element Not Removed.");
		}
		
		return list;
		

	}

}
