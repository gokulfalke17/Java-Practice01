package gf.collection;

import java.util.List;
import java.util.Optional;

public class Test_Max_UsingStreamAPI {
	public static void main(String[] args) {
		
		List<Object> list = List.of(1, 2, 3, 4, 8, 5, "a", "b", "c", 6);
		System.out.println("List is :"+list);
		
		System.out.println("Integer Objects are :");
		list.stream()
			.filter(ele -> ele instanceof Integer)
			.forEach(ele -> System.out.print(ele+" "));
		System.out.println();
		
		System.out.println("Even Integer Objects are :");
		list.stream()
		.filter(ele -> ele instanceof Integer)
		.filter(ele -> ((int)ele)%2==0)
		.forEach(ele ->System.out.print(ele+" "));
		System.out.println();
		
		System.out.println("Even Integer Max Object is :");
		Optional<Object> max =  list.stream()
			.filter(ele -> ele instanceof Integer)
			.filter(ele -> ((Integer) ele)%2==0)
			.max((a1, a2) -> ((Integer)a1).compareTo((Integer)a2));
		System.out.println( max);
			
		
			
	}
}
