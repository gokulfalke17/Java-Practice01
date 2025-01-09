package gf.collection;

public class Sa implements Comparable<Sa> {
	private int x;
	private int y;
	
	public Sa(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//setter getter methods
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		System.out.println("In hc");
		return x + y; 		//hashing algorithm
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In Eq ==>"+ this+ "    "+obj);
		if(obj instanceof Sa s) {
			return this.x == s.x  &&
						  this.y == s.y;
		}
		return false;
	}
	
	@Override
	public int compareTo(Sa s) { 	//TS.add() => s2.compareTo(s1)
																//this = s2 and s = s1
		return this.x - s.x;						//sorting object on x value ASC order with
	}

	@Override
	public String toString() {
		return "Sa(" + x + ",  " + y + ")";
	}	
	
}
