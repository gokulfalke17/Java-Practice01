package com.org.practice_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable{
	private int prodId;
	private String prodName;
	private int prodPrice;

	//setter getter methods
	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	
}

public class Serialization_DeserializationTest {

	public static void main(String[] args) throws Exception {
		
		//Serialization 
		
		FileOutputStream fos = new FileOutputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\com\\org\\practice_\\productInfo.bat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Product prod = new Product();
		prod.setProdId(101);
		prod.setProdName("abc121");
		prod.setProdPrice(5000);
		
		oos.writeObject(prod);
		
		fos.close();
		oos.close();
		System.out.println("Data Write Successfully...");
		System.out.println();
		
//----------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Deserialization
		
		FileInputStream fis = new FileInputStream("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\com\\org\\practice_\\productInfo.bat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		System.out.println("ProdId \tProdName \tProdPrice ");
		System.out.println("__________________________________");
		if(obj!=null) {
			Product p = (Product)obj;
			System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t\t"+p.getProdPrice());
		}else {
			System.out.println("Data Not Found....");
		}
		
		fis.close();
		ois.close();
	}

}
