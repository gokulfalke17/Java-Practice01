package pune.collection.practice;

import java.util.Vector;

public class Test04_FeachVectorDataByForLoop {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);	//index-0
		v.add(20);	//index-1
		v.add(30);	//index-2
		v.add(40);	//index-3
		v.add(50);	//index-4
		
		for(int i=0;i<v.size();i++) {
			Object obj = v.get(i);
			System.out.print(obj+"  ");
		}
	}
}
