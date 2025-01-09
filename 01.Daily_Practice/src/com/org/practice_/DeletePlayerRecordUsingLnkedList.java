package com.org.practice_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Q. WAP to create LinkedList and store Player object in it and delete the player record by using its id?

class Player01 {

	private int pid;
	private String pname;
	private int runs;

	public Player01() {
	}

	public Player01(int pid, String pname, int runs) {
		this.pid = pid;
		this.pname = pname;
		this.runs = runs;
	}

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
		return "Player01 [ pid=" + pid + ", pname=" + pname + ", runs=" + runs + " ] ";
	}

}

public class DeletePlayerRecordUsingLnkedList {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		List<Player01> list = new LinkedList<Player01>();
		list.add(new Player01(101, "Rohit Sharma", 20000));	
		list.add(new Player01(103, "abc", 1000));
		list.add(new Player01(102, "MS.Dhoni", 50000));	
		list.add(new Player01(104, "Ruturaj Gaikwad", 40000));
		
		list.forEach(System.out::println);
		System.out.println();
		
		
		/*____using Player Id____*/
		
		System.out.println("Enter Player Id to Delete : ");
		int deleteId = scn.nextInt();
		
		boolean flag = false;
		Iterator<Player01> iterator = list.iterator();
		while(iterator.hasNext()) {
			Player01 player = iterator.next();
			
			if(player.getPid()==deleteId) {
				iterator.remove();
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Player Deleted Successfully...");
		}else {
			System.out.println("Player Not Found to Delete.");
		}
		System.out.println();
		
		list.forEach(System.out::println);
		
		
		
		/*____Using Player Name____*/
		
		/*System.out.println("Enter Player Name to Delete : ");
		String deleteName = scn.nextLine();
		
		boolean flag = false;
		Iterator<Player01> iterator = list.iterator();
		while(iterator.hasNext()) {
			Player01 player = iterator.next();
			
			if(player.getPname().equals(deleteName)) {
				iterator.remove();
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Player Deleted Successfully...");
		}else {
			System.out.println("Player Not Found to Delete.");
		}
		System.out.println();
		
		list.forEach(System.out::println);*/
		
		
		
	}
}
