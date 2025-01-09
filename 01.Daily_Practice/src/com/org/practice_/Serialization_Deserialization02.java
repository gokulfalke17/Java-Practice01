package com.org.practice_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Printer implements Serializable{

	private int printerId;
	private String printerName;

	public int getPrinterId() {
		return printerId;
	}

	public void setPrinterId(int printerId) {
		this.printerId = printerId;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	@Override
	public String toString() {
		return "Printer [ printerId=" + printerId + ", printerName=" + printerName + " ] ";
	}	

}

public class Serialization_Deserialization02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		/*_____Serialization_____*/
		
		FileOutputStream fos = new FileOutputStream("src\\com\\org\\practice_\\printer.bat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Printer printer = new Printer();
		printer.setPrinterId(101);
		printer.setPrinterName("ram");
		
		oos.writeObject(printer);
		
		fos.close();
		oos.close();
		
		System.out.println("Data Write Successfully...");
		System.out.println();
		
		
		
		/*_____Deserialization_____*/
		
		FileInputStream fis = new FileInputStream("src\\com\\org\\practice_\\printer.bat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object data = ois.readObject();
		
		System.out.println("Printer Object Data is :: ");
		if(data!=null) {
			Printer p = (Printer)data;
			System.out.println(p.getPrinterId()+"\t"+p.getPrinterName());
		}else {
			System.out.println("Data is Not Found...");
		}
		
		fis.close();
		ois.close();
		
		
	}
}
