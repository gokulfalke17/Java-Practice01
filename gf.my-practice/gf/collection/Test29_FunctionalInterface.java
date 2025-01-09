package gf.collection;
/**
 * 
 * we have 3 types of interfaces
 * 		1. Marker interface 	--> an empty interface
 * 		2. Functional interface	--> Single Abstract Method (SAM) interface
 * 		3. Business interface	-->	Multiple Abstract Method (MAM) interface
 * 
 * */

//old style up to java 7v : before functional programming 
class Addition {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

//new style java 8v : by using function programming
//by using functional interface and Lambda Expression

interface Substraction {
	void sub(int a, int b);
}

public class Test29_FunctionalInterface {
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 20);
		
		Substraction sub = (int i1, int i2) -> System.out.println(i1-i2);
		sub.sub(10, 20);
		
	}
}

interface I1<T> {		//"validate"
	boolean m1(T t);
}
	
interface I2<T> {		//"consume"
	void m2(T t);
}
	
interface I3<T> {		//"supply"
	T m3(T t);
}

interface I4<T, R> {		//"function"
	R m4(T t);
}

//===================================================================

interface BiI1<T, U> {		//"validate"
	boolean m1(T t, U u);
}
	
interface BiI2<T, U> {		//"consume"
	void m2(T t, U u);
}
	
interface BooleanI3<T> {		//"supply"
	boolean m3(T t);
}

interface BiI4<T, U, R> {		//"function"
	R m4(T t, U u);
}

