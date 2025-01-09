package gf.object;

interface A {
		default void m1() {
				//this
		}
}
class B {
	void m2() {
			//this
	}
}
public class Test01_NeedOfObjectClass {

	public static void main(String[] args) {
		
		A a1 = null;
//		a1.
		
		B b1 = null;
		//b1.

	}

}
