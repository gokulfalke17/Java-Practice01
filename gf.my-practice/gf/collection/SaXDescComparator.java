package gf.collection;

//Approach #1 : Implementing comparator by using outer class

import java.util.Comparator;

class SaXDescComparator implements Comparator<Sa> {
	@Override
	public int compare(Sa s1, Sa s2) {
	
		return s2.getX() - s1.getX();
	}
}
