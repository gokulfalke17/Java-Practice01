package gf.practice01;

public class TestWrapperDemo {
	public static void main(String[] args) {
		
		int i = 10;
		Integer i1 = new Integer(i);
		Integer i2 = Integer.valueOf(i);
		System.out.println("i : "+ i);
		System.out.println("i1 : "+ i1);
		System.out.println("i2 : "+ i2);
		System.out.println();
		
		Integer i3 = new Integer(243);
		int i4 = i3.intValue();
		byte b = i3.byteValue();
		short s = i3.shortValue();
		float f = i3.floatValue();
		System.out.println("i3 : "+ i3);
		System.out.println("i4 : "+ i4);
		System.out.println("b : "+ b);
		System.out.println("s : "+ s);
		System.out.println("f : "+ f);
		System.out.println();
		
		Integer i5 = new Integer("10");
		Integer i6 = i5.valueOf(i5);
		
		Byte bo1 = new Byte("1");
		//Byte bo2 = bo1.valueOf("128");	//RE : NumberFormatException
		//Byte bo3 = bo1.valueOf("a");		//RE : NumberFormatException
		//Byte bo3 = bo1.valueOf("5.4");		//RE : NumberFormatException
		//Byte bo3 = bo1.valueOf("5L");		//RE : NumberFormatException
		Float fo1 = new Float("5");
		Float fo2 = new Float("5.4f");
		Float fo3 = new Float("51234.456f");
		
		
		System.out.println("i5 : "+ i5);
		System.out.println("i6 : "+ i6);
		System.out.println("bo1 : "+ bo1);
		System.out.println("fo1 : "+ fo1);
		System.out.println("fo2 : "+ fo2);
		System.out.println("fo3 : "+ fo3);
		System.out.println();
		
		Boolean boo1 = new Boolean("false"); 	System.out.println("boo1 : "+boo1);
		Boolean boo2 = new Boolean("true"); 	System.out.println("boo2 : "+boo2);
		Boolean boo3 = Boolean.valueOf("false"); 	System.out.println("boo3 : "+boo3);
		Boolean boo4 = Boolean.valueOf("true"); 	System.out.println("boo4 : "+boo4);
		System.out.println();
		
		Boolean boo5 = Boolean.valueOf("TrUE"); 	System.out.println("boo5 : "+boo5);
		Boolean boo6 = Boolean.valueOf("FaLSE"); 	System.out.println("boo6 : "+boo6);
		Boolean boo7 = Boolean.valueOf(""); 	System.out.println("boo7 : "+boo7);
		Boolean boo8 = Boolean.valueOf("hari"); 	System.out.println("boo8 : "+boo8);
		
		//Integer io1 = Integer.valueOf(null); 	System.out.println("io1 : "+io1);	//RE : NumberFormatException
		
		
	}
}
