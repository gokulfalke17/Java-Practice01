package gf.practice01;

class Examole {}

public class Test_StringOperations {
	
	public static void main(String[] args) {
		
		String str = "Java Programming Language";
		
		System.out.println("Check string empty or not : "+ str.isEmpty());	//false		
		System.out.println("String length : "+str.length());	//25
		System.out.println();
		
		String s1 = "";
		String s2 = " ";
		String s3 = new String("");
		System.out.println("Check string empty or not : "+ s1.isEmpty());	//true		
		System.out.println("String length : "+s1.length());	//0
		System.out.println();
		
		System.out.println("Check string empty or not : "+ s2.isEmpty());	//false		
		System.out.println("String length : "+s2.length());	//1
		System.out.println();
		
		System.out.println("Check string empty or not : "+ s3.isEmpty());	//true		
		System.out.println("String length : "+s3.length());	//0
		System.out.println();
		
		System.out.println("String is : \n"+str);
		System.out.println();
		
		String str2 = new String("abc");
		String str3 = new String("abc");
		String str4 = new String("Abc");
		
		System.out.println(str2==str3);	//false
		System.out.println(str2.equals(str3)); //true
		
		System.out.println(str3==str4);	//false
		System.out.println(str3.equals(str4)); //false
		System.out.println();
		
		System.out.println(str3==str4);	//false
		System.out.println(str3.equalsIgnoreCase(str4));	//true
		System.out.println();
		
		String str5 = new String("a");
		String str6 = new String("A");
		System.out.println(str5.compareTo(str6));			//32
		System.out.println(str5.compareToIgnoreCase(str6));	//0
		System.out.println();
		
		System.out.println(str.startsWith("Java"));		//true
		System.out.println(str.startsWith("Programming"));	//false
		System.out.println();
		
		System.out.println(str.endsWith("Language"));	//true
		System.out.println(str.endsWith("Java"));		//false
		System.out.println();
		
		System.out.println("String is :: \n"+str);
		System.out.println(str.charAt(10));
		System.out.println(str.charAt(2));
		//System.out.println(str.charAt(-1));	//RE : StringIndexOutOfBoundsException
		//System.out.println(str.charAt(26));	//RE : StringIndexOutOfBoundsException
		System.out.println();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+"");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(str.indexOf('o'));	//7
		System.out.println(str.indexOf('z'));	//-1
		System.out.println();
		
		System.out.println(str.lastIndexOf('a'));	//22
		System.out.println(str.lastIndexOf('J'));	//0
		System.out.println(str.indexOf('a', 4));	//10
		System.out.println(str.lastIndexOf('a', 22)); 	//22
		System.out.println(str.lastIndexOf('a', 21));	//18
		
		
		
	}
}
