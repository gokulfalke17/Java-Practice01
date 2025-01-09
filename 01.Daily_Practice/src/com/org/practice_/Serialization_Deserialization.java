package com.org.practice_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Player implements Serializable{
	private int pid;
	private String pname;
	private int runs;
	
	//setter getter methods
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Player [ pid=" + pid + ", pname=" + pname + ", runs=" + runs + " ] ";
	}

}

public class Serialization_Deserialization {
	
	public static void main(String[] args) throws Exception {
		
		//Serialization
	/*--------------------*/
		FileOutputStream fos = new FileOutputStream("src\\com\\org\\practice_\\playerInfo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Player player = new Player();
		player.setPid(07);
		player.setPname("MSD");
		player.setRuns(10000);
		
		oos.writeObject(player);
		
		fos.close();
		oos.close();
		System.out.println("Player Data Saved Successfully...");
		System.out.println();
		
		//Deserialization
	/*---------------------*/	
		FileInputStream fis = new FileInputStream("src\\com\\org\\practice_\\playerInfo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object data = ois.readObject();
		
		System.out.println("Id \tName \tRuns");
		System.out.println("----------------------");
		if(data!=null) {
			Player p = (Player)data;
			System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getRuns());
		}else {
			System.out.println("Data Not Found...");
		}
	}
}
