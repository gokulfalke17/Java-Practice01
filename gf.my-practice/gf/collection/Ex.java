package gf.collection;

public class Ex {
	private int x;
	private int y;
	
	public Ex(int x, int y) {
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
		
		return 5;
	}
	
	@Override													  //o1.equals(o2)
	public boolean equals(Object obj) {	 //this.Ex(5,6) obj="a"/5/null/Ex(5,6)
		
		if(obj instanceof Ex e)  {   //checking arg object current type or not 
			return this.x == e.x &&	//if it is current class type 
						  this.y == e.y;			//comparing object data and
															//return true/false
		}													
		return false;		//if not current class type returning false
	}
	
	

	@Override
	public String toString() {
		return "Ex(" + x + ",  " + y + ")";
	}	
	
}
