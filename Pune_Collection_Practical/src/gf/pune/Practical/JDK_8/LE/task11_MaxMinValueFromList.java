package gf.pune.Practical.JDK_8.LE;

//11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.sound.sampled.Mixer;

interface MaxMin {
	void findMinMax(List<Integer> list);
}
public class task11_MaxMinValueFromList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 7, 9, 3, 5, 7 ,8, 11, 15, 12, 14));
		System.out.println("List is : "+ list);
		
		/*MaxMin find = new MaxMin() {
			@Override
			public void findMinMax(List<Integer> list) {
				int min=list.get(0);
				int max=list.get(0);
				for(int i=0; i<list.size(); i++) {
					if(max < list.get(i))
						max = list.get(i);
					
					if(min > list.get(i))
						min = list.get(i);
				}
				System.out.println("Max is : "+ max);
				System.out.println("Min is : "+ min );
			}
		};
		find.findMinMax(list);*/
		
		MaxMin find = (List<Integer> al)->{
				int min = list.get(0);
				int max = list.get(0);
				for(int i=0; i<list.size(); i++) {
					if(max < list.get(i))
						max = list.get(i);
					if(min >  list.get(i)) 
						min = list.get(i);
				}
				System.out.println("Max is : "+ max);
				System.out.println("Min is : "+ min);
		};
		find.findMinMax(list);
		
	}
}
