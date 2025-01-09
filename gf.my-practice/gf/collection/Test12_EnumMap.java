package gf.collection;

import java.util.EnumMap;

/**
 * EnumMap is used for storing one enum's named constants as keys 
 * and any type of object as values
 * 
 * For creating EnumMap object we must use constructor,'
 * but not factory method.
 * 
 * entries are stored in named constants declared order in its enum
 * 
 * */ class Test12_EnumMap {
	public static void main(String[] args) {
		EnumMap<FoodItems, Object> em = new EnumMap<FoodItems, Object>(FoodItems.class);
		System.out.println(em.put(FoodItems.IDLY, 30));
		System.out.println(em.put(FoodItems.DOSA, 45));
		System.out.println(em.put(FoodItems.PURI, 35));
		System.out.println(em.put(FoodItems.UPMA, 50));
		System.out.println(em.put(FoodItems.UPMA, 100));
		System.out.println(em.put(FoodItems.WADA, 50));	
		//here value can be duplicate but key must be unique and you are trying
		//to stored duplicate key it is not stored it pointing previous object
		//and previous value replace with new value
		System.out.println(em);
	}
}
