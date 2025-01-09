package gf.practice01;

public class AdditionWithoutPrimitiveVariable {
	
	public static void main(String[] args) {
		
		Integer i1 = 50;
		Integer i2 = 25;
		Integer i3 = i1+i2;
		System.out.println("Result is  : "+ i3);
		
//==============================================================================
		
//byte range same values are pointing to same object no new object creates...
		Integer i4 = 50;
		Integer i5 = 50;
		System.out.println(i4==i5);	//true
		
//where ever byte range crose the always new object is creted and it pointing to different object
		Integer i6 = 150;
		Integer i7 = 150;
		System.out.println(i6==i7);	//false
	}
}
