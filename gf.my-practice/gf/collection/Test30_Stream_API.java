package gf.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test30_Stream_API {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a");
		al.add(4);
		al.add("b");
		al.add(5);
		al.add("c");
		al.add(6);
		
		//1. retrieving and printing all elements available in this collection
		Stream<Object> s1 = al.stream();
		s1.forEach(ele -> System.out.print(ele+" "));
		System.out.println();
		
		System.out.println("Only Strings :");
		
//		//2. retrieving and printing only string objects
//		Stream<Object> s2 = al.stream();
//		Stream<Object> s3 = s2.filter(ele -> ele instanceof String);
//		s3.forEach(ele -> System.out.print(ele+" "));
//		System.out.println();
			
		al.stream()
			.filter(ele -> ele instanceof String)
			.forEach(ele -> System.out.print(ele+" "));
		System.out.println();
		
		System.out.println("Only Integers :");
		
		//3. retrieving and printing only Integer objects 
		al.stream()
			.filter(ele -> ele instanceof Integer)
			.forEach(ele -> System.out.print(ele+" "));	
		System.out.println();
		
		System.out.println("Even Integers :");
		
		//4. retrieving and printing only even integer objects
		al.stream()
			.filter(ele -> ele instanceof Integer)
			.filter(ele -> ((int)ele % 2)==0)
			.forEach(ele -> System.out.print(ele+" "));
		System.out.println();
		
		System.out.println("Odd Integers :");
		
		//5. retrieving and printing only odd integer objects
		al.stream()
			.filter(ele -> ele instanceof Integer)
			.filter(ele -> ((int)ele %2!=0))
			.forEach(ele -> System.out.print(ele+" "));
		System.out.println();
		System.out.println();
		
		//6. converting string objects in to upperCase and print it
		al.stream()											//[a,4,b,5,c,6]
			.filter(ele -> ele instanceof String)			//[a,b,c]
			.map(ele -> ((String)ele).toUpperCase())		//[A,B,C]
			.forEach(ele -> System.out.print(ele+" "));		//print
		System.out.println();
		System.out.println();
		
		//7. count number of Even Integer objects 
		long count = al.stream()
			.filter(ele -> ele instanceof Integer)
			.filter(ele ->((int)ele)%2==0)
			.count();
		System.out.println("Even Integers Count :"+ count);
			
		//8. retrieve integer objects in collection
		List<Object> evenElementList = al.stream()
			.filter(ele -> ele instanceof Integer)
			.filter(ele -> ((int)ele)%2==0)
			.toList();
		System.out.println("Even Integer Objects List :"+evenElementList);
		System.out.println();
			
		//9. retrieve max integer object in collection 
		Optional<Object> max = al.stream()
			.filter(ele -> ele instanceof Integer)
			.max((a1, a2) -> ((Integer)a1).compareTo((Integer)a2));
		System.out.println("Max Integer Object is :"+max);
		
		Object maxValue = max.get();
		System.out.println("Max Value is :"+ maxValue);
		System.out.println();
		
		//10. retrieve min integer object in collection
		Optional<Object> min = al.stream()
				.filter(ele -> ele instanceof Integer)
				.min((a1, a2) -> ((Integer)a1).compareTo((Integer)a2));
		System.out.println("Min Integer Object is :"+min);
		
		Object minValue = min.get();
		System.out.println("Min Value is :"+minValue);
		
	}
}
