package gf.custome_collection;

public class Test02_NITMap {

	public static void main(String[] args) {
		
		NITMap map = new NITMap();
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println();
		
		map.put("a" , 1);	
		map.put("b" , 2); 	
		map.put(5, 3);		
		map.put(40.5, 4); 
		map.put(null, 5);  
		map.put(true, 6);  
		System.out.println(map);
		System.out.println(map.size());
		

	}

}
