package gf.custome_collection;


public class Test01_typeProgram {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20; 
		//a[2] = true;
		//a[2] = 20.5;
		a[2] = 'a';
		
		System.out.println(a[0]+ " "+ a[1]+" "+a[2]);
		
		double d[] = new double[6];
		d[0] = 10;
		d[1] = 20;
		d[2] = 6L;
		d[3] = 20.50;
		d[4] = 'a';
		//d[4] = true;
		//d[5] = "a";
		System.out.println(d[0]+" "+d[1] +" "+d[2]+" "+d[3]+" "+d[4]);
		
		Object obj[] = new Object[10];
		obj[0] = 5;
		obj[1] = 'a';
		obj[2] = "b";
		obj[3] = 5.5;
		obj[4] = true;
		obj[5] = false;
		obj[6] = 10.5f;
		obj[7] = 5;
		obj[8] = null;
		obj[9] = 'm';
		System.out.println(obj[0]+" "+obj[1] +" "+obj[2]+" "+obj[3]+" "+obj[4]+" "+obj[5]+" "+obj[6] +" "+obj[7]+" "+obj[8]+" "+obj[9]);
	}

}
