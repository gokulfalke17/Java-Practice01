package gf.practice02;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterface {
	
	public static void main(String[] args) {
		/*
		Supplier<Date> supp = new Supplier<Date>() {
			
			@Override
			public Date get() {
				return new Date();
			}
		};
		Date result = supp.get();
		System.out.println(result);
		*/
		

		/*Supplier<Date> supp = ()-> new Date();
		Date result = supp.get();
		System.out.println(result);*/
		/*
		Date result = ((Supplier<Date>) ()-> new Date()).get();
		System.out.println(result);
		*/

		System.out.println(((Supplier<Date>) ()-> new Date()).get());
		
	}
}
