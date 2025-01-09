package gf.practice02;

import java.util.function.Consumer;

public class ConsumerInterface {
	
	public static void main(String[] args) {
		/*
		Consumer<String> cons = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		cons.accept("I'm consumer interface...");
		*/
		
		/*
		Consumer<String> cons = (String t)-> {
				System.out.println(t);
		};
		cons.accept("I'm consumer interface...");
		*/
		
		Consumer<String> cons = (t)-> System.out.println(t);
		cons.accept("I'm consumer interface...");
		
		
	}
}
