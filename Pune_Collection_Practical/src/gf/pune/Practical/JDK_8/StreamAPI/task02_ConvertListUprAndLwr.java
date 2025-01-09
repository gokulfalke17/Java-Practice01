package gf.pune.Practical.JDK_8.StreamAPI;

//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class task02_ConvertListUprAndLwr {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("sanket", "avishkar", "GANESH", "SHIVAM", "AKASH", "suresh");
		
		System.out.println("List is :: \n"+ list);
		System.out.println();
		
		/* convert toUpperCase */
		
		
		/*Stream<String> stream = list.stream();
		Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t.toUpperCase()+" ");
			}
			
		};
		stream.forEach(cons);*/
		
		
		
		/*Stream<String> stream = list.stream();
		Consumer<String> cons = (String t)-> System.out.print(t.toUpperCase()+" ");
		stream.forEach(cons);*/
		
		
		/*Stream<String> stream = list.stream();
		stream.forEach((String t)-> System.out.print(t.toUpperCase()+" "));*/
		
		System.out.println("toUpperCase :: ");
		list.stream().forEach((String t)-> System.out.print(t.toUpperCase()+" "));
		
		
		System.out.println();
		
		/* convert toLowerCase */
		
		/*System.out.println();
		Stream<String> stream = list.stream();
		Consumer<String> cons = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.print(t.toLowerCase()+" ");
			}
		};
		stream.forEach(cons);*/
		
		
		System.out.println();
		
		/*Stream<String> stream = list.stream();
		Consumer<String> cons = (String t)-> System.out.print(t.toLowerCase()+" ");
		stream.forEach(cons);*/
		
		
		/*Stream<String> stream = list.stream();
		stream.forEach((String t)-> System.out.print(t.toLowerCase()+" "));*/
		
		System.out.println("toLowerCase :: ");
		list.stream().forEach((String t)-> System.out.print(t.toLowerCase()+" "));
	}
}
