package org.techhub.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class Biscuit {

	private int ID;
	private String NAME;
	private int price;

	public Biscuit(int iD, String nAME, int price) {
		super();
		ID = iD;
		NAME = nAME;
		this.price = price;
	}

	public int getID() {
		return ID;
	} 

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String name) {
		NAME = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "--> \t ID=" + ID + " \t NAME=" + NAME + " \t price=" + price + "  ";
	}
	
}

public class BiscuitFactory {
	public static void main(String[] args) {
		
		LinkedHashMap<String, LinkedHashMap<String, Biscuit>> list = new LinkedHashMap<String, LinkedHashMap<String,Biscuit>>();
		
		LinkedHashMap<String, Biscuit> parleG = new LinkedHashMap<String, Biscuit>();
		parleG.put("PG001", new Biscuit(1, "parle-g            ", 5));
		parleG.put("PG002", new Biscuit(2, "parle-g-gold       ", 10));
		parleG.put("PG003", new Biscuit(3, "parle-g chota bheem", 15));
		
		LinkedHashMap<String, Biscuit> britannia = new LinkedHashMap<String, Biscuit>();
		britannia.put("BR001", new Biscuit(1, "Britannia           ", 5));
		britannia.put("BR002", new Biscuit(2, "Britannia Milk Bikis", 10));
		britannia.put("BR003", new Biscuit(3, "Britannia Choco nuts", 15));
		
		LinkedHashMap<String, Biscuit> oreo = new LinkedHashMap<String, Biscuit>();
		oreo.put("Or001", new Biscuit(1, "Oreo Original Cookies", 10));
		oreo.put("Or002", new Biscuit(2, "Oreo Golden          ", 15));
		oreo.put("Or003", new Biscuit(3, "Oreo Chocolate Cream ", 20));
		
		list.put("Parle-G", parleG);
		list.put("britannia", britannia); 
		list.put("Oreo", oreo);
		
		Iterator<Entry<String, LinkedHashMap<String, Biscuit>>> iterator = list.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, LinkedHashMap<String, Biscuit>> fEntry = iterator.next();
			LinkedHashMap<String, Biscuit> product = fEntry.getValue();
			System.out.println("Product Name :"+fEntry.getKey());
			System.out.println("------------------------");
			
			Iterator<Entry<String, Biscuit>> fNames = product.entrySet().iterator();
			while(fNames.hasNext()) {
				Map.Entry<String, Biscuit> pName = fNames.next();
				System.out.println(pName.getKey()+"\t"+pName.getValue());
			}
			System.out.println();
		}
	}
}
