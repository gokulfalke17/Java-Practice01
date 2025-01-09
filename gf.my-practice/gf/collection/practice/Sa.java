package gf.collection.practice;

import java.util.Comparator;

public class Sa {
	private int a;
	private int b;
	
	public Sa(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Ex (" + a + ", " + b + ")";
	}	
	
	
}
