package gf.pune.Practical.collection;

import java.util.ArrayList;
import java.util.Scanner;

//Q5. WAP to create ArrayList and store 10 player objects in it and find the player detail according to run and arrange run in descending order.

class Player {
	int id;
	String name;
	int run;
	
	public Player(int id, String name, int run) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
	}



	@Override
	public String toString() {
		return " ( id=" + id + ", name=" + name + ", run=" + run + " ) ";
	}
	
}

public class Task09_PlayerArrangeDESCByRun {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Player> al = new ArrayList<>();
		Player p[] = new Player[5];
		
		for(int i=0; i<p.length; i++) {
			System.out.println("Enter Player Id :: ");
			int id = scn.nextInt(); scn.nextLine();
			System.out.println("Enter Player Name :: ");
			String name = scn.nextLine();
			System.out.println("Enter Player Run :: ");
			int run = scn.nextInt();
			
			al.add(new Player(id, name, run)); 
		}
		System.out.println();
		
		System.out.println("Before Sorting :: ");
		System.out.println(al); 
		
		arrangeDESCByRun(al);
	}

	private static void arrangeDESCByRun(ArrayList<Player> al) {
		
		System.out.println("After Sorting Player Details by Run Wise :: ");
		for(int i=0; i<al.size();i++) {
			for(int j=0; j<al.size()-i-1; j++) {
				
				if(al.get(j).run < al.get(j+1).run ) {
					
					Player temp = al.get(j); 
					al.set(j, al.get(j+1));
					al.set(j+1, temp);
				}
			}
		}
		
		System.out.println(al);
		
	}
	
}
