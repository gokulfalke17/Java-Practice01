package gf.collection.practice;

import java.util.Comparator;

public class SaComparator implements Comparator<Sa> {
	
	@Override
	public int compare(Sa s1, Sa s2) {
		return s1.getA() - s2.getA(); 
	}
}
