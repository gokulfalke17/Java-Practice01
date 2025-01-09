package org.techhub;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerInterface {
	 public static void main(String[] args) {
		
		 ArrayList< Object> al = new ArrayList<Object>();
		 al.add(1);
		 al.add(2);
		 al.add("a");
		 al.add("b");
		 al.add("c");
		 al.add(3);
		 
//		 System.out.println("ArrayList is : "+ al);
		 
//		 Consumer<Object> c = new Consumer<Object>() {
//			
//			@Override
//			public void accept(Object t) {
//				System.out.print(t+" ");
//			}
//		};
//		al.forEach(c);
		 
		 
		 //Lambda Expression Shorter...
//		 Consumer<Object> c = (Object t)->{
//					System.out.print(t+" ");
//				};
//			al.forEach(c);
		 
		 
//		 //Lambda Expression more Shorter...
//		 Consumer<Object> c = (Object t)->
//					System.out.print(t+" ");
//					al.forEach(c);
		 
					
		//Lambda Expression more more Shorter...
		al.forEach((Object t)->System.out.print(t+" "));			
			
			
			
	}
}	
