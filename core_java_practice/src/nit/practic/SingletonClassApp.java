package nit.practic;

class Test {
	private static Test test;
	private Test() {
		System.out.println("I'm Singleton Class Constructor....");
	}
	
	public static Test classInfo() {
		if(test==null) {
			test = new Test();
		} 
		return test;
	}
}
public class SingletonClassApp {
	public static void main(String[] args) {
		Test t1 = Test.classInfo();
		Test t2 = Test.classInfo();
		Test t3 = Test.classInfo();
		
		//Math class is a utility class
		System.out.println(Math.abs(-10));
	}
}
