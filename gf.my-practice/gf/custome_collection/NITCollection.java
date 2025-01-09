package gf.custome_collection;

import java.util.Vector;

/**
 * This class is a custom collection class
 * It is means It is developed by programmer in  his project <BR>
 * specific to this project <BR> <BR>
 * 
 * 
 * This class is meant for storing multiple Homogeneous, Heterogeneous, Unique, Duplicate Objects <BR>
 * without size limitation. this class is implements growable array algorithm
 * for storing objects objects without size limitation .
 * 
 * This class Stores objects without mapping 
 * with index in insertion order <BR>
 * 
 * This collection allow null and multiple nulls .<BR> <BR>
 * 
 * this collection supports adding, counting, printing, searching, retrieving, removing, inserting and replacing operations
 * 
 * */

public class NITCollection {
	/**
	 * for storing object without size limitation
	 * */
	private Object elementData[];
	
	/**
	 * for maintaining size and index of current location to store 
	 * */
	private int elementCount;

	/**
	 * for creating empty collection with increase capacity 10 
	 * and incremental capacity double
	 * */
	public NITCollection() {
		elementData = new Object[10];
	}
	
	/**
	 * For adding object to this collection <BR>
	 * always stores objects end of last element
	 * 
	 * @param obj object to be stored
	 * */

	public void add(Object obj) {
		if (size() == capacity()) {
			increaseCapacity();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	
	/**
	 * for increasing capacity of this collection
	 * it implements growable array algorithm
	 * */

	private void increaseCapacity() {
		// 1. create new array object with more capacity
		Object newArray[] = new Object[capacity() * 2];

		// 2. copy elements from old array into this new array
		for (int i = 0; i < elementData.length; i++) {
			newArray[i] = elementData[i];
		}

		// 3. assign new array reference to old reference variable
		elementData = newArray;
	}
	
	/**
	 * for returning capacity of this collection
	 * 
	 * @return int returning capacity of this collection
	 * */

	public int capacity() {
		return elementData.length;
	}
	
	/**
	 * for returning size of this collection
	 * 
	 * @return int returning size of this collection
	 * */

	public int size() {
		return elementCount;
	}
	
	/**
	 * returns this collection elements in String format
	 * */
	
	@Override
	public String toString() {


		if (elementCount == 0) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < elementCount; i++) { // coping data from collection object
			sb.append(elementData[i]); // to StringBuilder object for printing
			sb.append(", ");
		}

		int index = sb.lastIndexOf(", "); // for finding last , space
		sb.delete(index, index + 2); // and remove last , space

		sb.append("]");

		return sb.toString(); // convert StringBuilder object to String object

	}
	
	/*
	 * for searching  given object in this collection
	 * 
	 * @param obj the object for finding
	 * @return true if object found
	 * 					false object not found
	 * */

	public boolean contains(Object obj) {
		 
		return indexOf(obj)>=0; 
	}
	
	/**
	 * returns the first occurrence of this given object
	 * @param obj the objects for finding its index
	 * @return index number 
	 * 					not found return -1;
	 * */
	
	public int indexOf(Object obj) { 
		
		if(obj==null) { 
			
			for(int i=0;i<elementCount;i++) {
				if(obj==elementData[i])
					return i;
			}
			return -1;
			
		}else {
			
			for(int i=0;i<elementCount;i++) {
				if(obj.equals(elementData[i]))
					return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * returns the last occurrence of this given object
	 * @param obj the objects for finding its index
	 * @return index number 
	 * 					not found return -1;
	 * */
	
	
	public int lastIndexOf(Object obj) { 
		
		if(obj==null) { 
			
			for(int i=elementCount;i>=0;i--) {
				if(obj==elementData[i])
					return i;
			}
			return -1;
			
		}else {
			
			for(int i=elementCount;i>=0;i--) {
				if(obj.equals(elementData[i]))
					return i;
			}
		}
		
		return -1;
	}
	

	/**
	 * return index for given index location
	 * 
	 * @param index for retrieving object
	 * @return object available in this given index
	 *throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 * */

	public Object get(int index) {
		
		checkIndex(index);
		
		return elementData[index];
	}
	
	/**
	 * remove and return the object from the given index location
	 * 
	 * @param index for removing object
	 * @return object available in this given index
	 * throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 * */
	
	public Object remove(int index) {
		
		checkIndex(index);
		
		Object ele = elementData[index];
		for(int i=index;i<elementCount-1; i++) {
			elementData[i] = elementData[i+1];
		}
		
		elementData[elementCount-1] = null;
		elementCount--;
		
		return ele;
	}
	
	/**
	 *remove the given object from this collection
	 * 
	 * @return object available return true 
	 * 					not found return false
	 * 
	 * */
	
	public boolean remove(Object obj) {
		
			int index = indexOf(obj);  //searching object and retrieving index
			if(index>=0) {    //if found
				remove(index);  //removing that object from collections
				return true;
			}
			
			return false;
			
	}
	
	/**
	 * insert the given object in the given index
	 * 
	 * @param index which location we need to insert
	 * throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 * */
	
	public void insert(int index, Object obj) {
		
		if(index < 0 || index > elementCount) {
			throw new IndexOutOfBoundsException(index);
		}
		
		if(size() == capacity()) {
			increaseCapacity();
		}
		
		for(int i=elementCount-1; i>=index; i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = obj;
		elementCount++;
		
	}
	
	/**
	 * insert the given object in the given index
	 * 
	 * @param index which location object to be replaced
	 * throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 * */

	public Object set(int index, Object obj) {
		checkIndex(index);
		
		Object ele = elementData[index];
		elementData[index] = obj;
		
		return ele; 
		
	}
	
	/**
	 * for throwing exception if index is wrong
	 * 
	 * @param index to be checked
	 * */
	
	private void checkIndex(int index) {
		if(index < 0 || index>=elementCount) {
			throw new IndexOutOfBoundsException(index);
		}
		
	}
	
	public static void main(String[] args) {
		
		NITCollection nit = new NITCollection();
		System.out.println("Size :"+nit.size());	
		System.out.println("Capacity :"+nit.capacity());
		System.out.println("Elements :"+ nit);
		System.out.println();

		nit.add("a");
		nit.add("b");
		nit.add("c");
		nit.add("d");
		nit.add("e");
		nit.add("f");
		nit.add("g");
		nit.add("h");
		nit.add("i");
		nit.add("j");
		nit.add("k");
		
		System.out.println("Elements :"+nit);
		System.out.println("Size :"+nit.size());	
		System.out.println("Capacity :"+nit.capacity());
		
		System.out.println(nit.contains("b"));
		System.out.println(nit.contains(new String("f")));
	//	System.out.println(nit.contains(new Integer(5)));
	//	System.out.println(nit.contains(5));
		System.out.println();
		
		nit.insert(5, "PPP");
		System.out.println(nit);
		
		nit.set(3, "XYZ");
		System.out.println(nit);

	}

}
