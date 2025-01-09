package pune.collection.practice;

public class ObjArrApp {
	
	public static void main(String[] args) {
		
		Object obj[] = new Object[5];
		obj[0] = "good morning";
		obj[1] = 'p';
		obj[2] = 5.7f;
		obj[3] = 5;
		obj[4] = new java.util.Date();
		System.out.println("Display Array Data");
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}
}
