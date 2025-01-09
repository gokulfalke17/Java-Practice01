package gf.practice02;

import java.util.Arrays;
import java.util.List;

public class KthHeighestNumberInList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 2, 4, 1, 8, 6, 7, 7, 7, 3);
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)> list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println("Sorted List is :: ");
		list.forEach(ele->System.out.print(ele+" "));
		System.out.println();
		
		
		int kth = 3;
		int count = 1;
		for(int i=list.size()-1; i>0; i--) {
			if(list.get(i)!=list.get(i-1)) {
				count++;
			}
			
			if(count==kth) {
				System.out.println("Kth Heighest Element is :: "+ list.get(i-1));
				break;
			}
		}
	}
}
