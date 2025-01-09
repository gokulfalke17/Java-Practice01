package gf.practice01;

import java.util.Scanner;

class SearchValue {
	
	int arr[];
	public void setValue(int ...arr) {
		this.arr = arr;
	}
	
	public int searchValue(int value) {
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}
public class Test04_SearchValueApp {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = {1, 4, 6, 7, 3, 2, 8, 9 ,15, 13, 11, 6};
		
		System.out.println("Array Elements are : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Enter Search Value :: ");
		int value = scn.nextInt();
		
		SearchValue sv = new SearchValue();
		sv.setValue(arr);
		int result = sv.searchValue(value);
		System.out.println("Search Key Index is : "+ result);
	}
}
