package gf.custome_collection;

public class NITMap {

	private Object keys[];
	private Object values[];

	private int size ;
	
	public NITMap() {
		keys = new Object[10];
		values = new Object[10];
		size = 0;
	}

	public void put(Object key , Object value) {
		if (size() == keys.length) {
			grow();
		}
		keys[size] = key;
		values[size] = value;
		size++;
	}

	private void grow() {
		// 1. create new array object with more capacity
		Object newKeyArray[] = new Object[keys.length * 2];
		Object newValueArray[] = new Object[values.length * 2];

		// 2. copy elements from old array into this new array
		for (int i = 0; i < size; i++) {
			newKeyArray[i] = keys[i];
			newValueArray[i] = values[i];
		}

		// 3. assign new array reference to old reference variable
		keys = newKeyArray;
		values = newValueArray;
	}

	public int size() {
		return size;
	}
	
	@Override
	public String toString() {


		if (size == 0) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < size; i++) { // coping data from collection object
			sb.append(keys[i]); // to StringBuilder object for printing
			sb.append("=");
			sb.append(values[i]);
			sb.append(", ");
		}

		int index = sb.lastIndexOf(", "); // for finding last , space
		sb.delete(index, index + 2); // and remove last , space

		sb.append("}");

		return sb.toString(); // convert StringBuilder object to String object

	}
	

}
