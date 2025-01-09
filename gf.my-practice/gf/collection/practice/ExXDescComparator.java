package gf.collection.practice;

import java.util.Comparator;

public class ExXDescComparator implements Comparator<Ex> {
	
	@Override
	public int compare(Ex e1, Ex e2) {
		return e1.getA() - e2.getA();
	}
}
