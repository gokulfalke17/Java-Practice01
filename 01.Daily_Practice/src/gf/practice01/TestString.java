package gf.practice01;

public class TestString {
	
	public static void main(String[] args) {
		String str = new String();
		System.out.println(str);
		System.out.println();
		
		String str2 = "abc";
		String str3 = new String(str2);
		
		String str4 = new String("bbc");
		String str5 = str4;
		
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println();
		
		System.out.println(str2 == str3);	//fasle -> pointing to diffrent objects
		System.out.println(str4 == str5);	//true -> pointing to same objects
		System.out.println();
		
		char[] ch = {'a', 'b', 'c', 'd'};
		String str6 = new String(ch);
		System.out.println("str6 : "+ str6);
		System.out.println();
		
		char[] ch2 = {'a', 'b', 'c', 'd', 'e', 'f'};
		String str7 = new String(ch2, 2, 3);
		System.out.println("str7 : "+ str7);
		System.out.println();
		
		byte[] b = {97, 98, 99};
		String str8 = new  String(b);
		System.out.println("str8 : "+ str8);
		System.out.println();
		
		byte[] b2 = {97, 98, 99, 100, 101, 102};
		String str9 = new  String(b2, 2, 4);
		System.out.println("str9 : "+ str9);
		System.out.println();
		
		/*byte[] b3 = {97, 98, 99, 100, 101, 102};
		String str11 = new  String(b2, 2, 5);			//RE : ArrayIndexOutOfBoundsException
		System.out.println("str11 : "+ str11);
		System.out.println();*/
		
//		String str10 = new String(null);	//CE : ambiguous problem
		/*
		String s1 = null;
		String s2 = new String(s1);						//RE : NullPointerException
		String s3 = new String((StringBuffer)null);		//RE : NullPointerException
		*/
	}		
}
