package gf.pune.Practical.JDK_8.StreamAPI;

//4. Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class task04_RemoveDuplicateUsingStream {
	
	public static void main(String[] args) { 
		
		List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9, 4, 6, 8, 4, 9);
		System.out.println("List is : \n"+ list);
		System.out.println();
		
		List<Integer> collect = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("After Removing Duplicates : ");
		System.out.println(collect);
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println();
		
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(val -> set.add(val)).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		});
	}
}
