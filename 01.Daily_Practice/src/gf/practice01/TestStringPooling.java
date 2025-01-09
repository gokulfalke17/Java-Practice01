package gf.practice01;

public class TestStringPooling {
	
	public static void main(String[] args) {
		
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);			//true
		System.out.println(str1.equals(str2));	//true
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4);				//false -> both objects pointing to different object == operator compare
																					//with hash code is hash code is different....
		
		System.out.println(str3.equals(str4));		//true -> both objects pointing to different object but .equals() method
																			//compate content/field comparision on hash cede comparation
																			//its hash code is different but its content is same....
	}
}	
