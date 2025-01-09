package gf.pune.Practical.collection;

import java.util.Scanner;
import java.util.Vector;

public class Task04_ArrayObjectOfDocterClassDoTask {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//Docter[] docter = new Docter[1];
		Vector<Docter> v = new Vector<>(); 
		
			do {
				System.out.println("1. Display All Docter Details ");
				System.out.println("2. Add New Docter ");
				System.out.println("3. Update Docter ");
				System.out.println("4. Delete Docter by Id ");
				System.out.println("5. Sort Docters in Ascending Order by Rank ");
				System.out.println("6. Search Docter by Its Specialist ");
				System.out.println("7. Exit");
				System.out.println();
				
				System.out.println("Enter Choice ");
				int choice = scn.nextInt();
				
				switch (choice) {
				case 1: 
					display(v);
					break;
				
				case 2:
					addDocter(v);
					break;
					
				case 3: 
					updateDocter(v);
					break;
				
				case 4:
					removeDocter(v);
				    break;

				
				case 5: 
					sortDocter(v);
					break;
				
				case 6:
					searchDocter(v);
					break;
				
				case 7: 
					System.out.println("Thank You.! Visit Again.......");
					System.exit(0);
				
					default :
						System.out.println(" Invalid Choice");
				
				}
				
			}while (true);
		
	}

	private static void display(Vector<Docter>  v) {
		//Display All Docters
		System.out.println("Docters Are :: ");
		System.out.println(v);
		System.out.println();	
		
	}	
	
	private static void addDocter(Vector<Docter> v) {
		//Add New Docter
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Docter Id :: ");
		int did = scn.nextInt(); scn.nextLine();
		System.out.println("Enter Docter Name :: ");
		String dname = scn.nextLine();
		System.out.println("Enter Docter Specialist :: ");
		String dspecialist = scn.nextLine();
		System.out.println("Enter Docter City :: ");
		String dcity = scn.nextLine();
		System.out.println("Enter Docter Fees :: ");
		int dfees = scn.nextInt();
		System.out.println("Enter Docter Rank :: ");
		double rank = scn.nextDouble(); scn.nextLine();
		
		v.add(new Docter(did, dname, dspecialist, dcity, dfees, rank));
		System.out.println("Docter Added Successfully....");
		System.out.println();
		display(v);
		
		System.out.println();
		
	}
	
	private static void updateDocter(Vector<Docter> v) {
		//Upadate Docter Details
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter Id for Search Key Updation Purpose :: ");
	    int skey = scn.nextInt();

	    for (Docter doc : v) {
	        if (doc.getDid() == skey) {
	            scn.nextLine();
	            System.out.println("Enter Docter Name :: ");
	            String dname = scn.nextLine();
	            System.out.println("Enter Docter Specialist :: ");
	            String dspecialist = scn.nextLine();
	            System.out.println("Enter Docter City :: ");
	            String dcity = scn.nextLine();
	            System.out.println("Enter Docter Fees :: ");
	            int dfees = scn.nextInt();
	            System.out.println("Enter Docter Rank :: ");
	            double rank = scn.nextDouble();
	            scn.nextLine();

	            doc.setDname(dname);
	            doc.setDspecialist(dspecialist);
	            doc.setDcity(dcity);
	            doc.setDfees(dfees);
	            doc.setRank(rank);
	            
	            System.out.println("Docter Updated Successfully..........");
	            System.out.println();
	            display(v);

	            System.out.println();
	        }
	    }
	}

	
	private static void removeDocter(Vector<Docter> v) {
		// Delete Docter by Id
	    Scanner scn = new Scanner(System.in);
	    
	    System.out.println("Enter Id of Docter for Remove :: ");
	    int id = scn.nextInt();
	    
	    for (int i = 0; i < v.size(); i++) {
	        if (v.get(i).getDid() == id) {
	            v.remove(i);
	            System.out.println("Docter Removed Successfully.");
	            display(v);
	        }else {
	        	 System.out.println("Docter Not Found.");
	        }
	    }
	   
	    System.out.println();
	}

	private static void sortDocter(Vector<Docter> v) {
		//Sort Docters in Ascending Order by Rank
	    for (int i = 0; i < v.size() - 1; i++) {
	        int swap = i;
	        for (int j = i + 1; j < v.size(); j++) {
	            if (v.get(j).getRank() < v.get(swap).getRank()) {
	                swap = j;
	            }
	        }
	        // Swaping Data
	        Docter temp = v.get(i);
	        v.set(i, v.get(swap)); 
	        v.set(swap, temp);
	    }

	    System.out.println("Docters Sorted by Rank Wise");
	    display(v);
	}


	private static void searchDocter(Vector<Docter> v) {
		//Search Docter by Its Specialist
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter Specialist for Searching :: ");
	    String search = scn.nextLine();
	    
	    boolean found = false;
	    for (Docter doc : v) {
	        if (doc.getDspecialist().equals(search)) {
	            System.out.println("Docter Found ");
	            System.out.println(doc); 
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("Docter Not  Found with Specialist " + search);
	    }
	    System.out.println();
	    
	}
	
}

class Docter {
	private int did;
	private String dname;
	private String dspecialist;
	private String dcity;
	private int dfees;
	private double rank;
	
	public Docter(int did, String dname, String dspecialist, String dcity, int dfees, double rank) {
		this.did = did;
		this.dname = dname;
		this.dspecialist = dspecialist;
		this.dcity = dcity;
		this.dfees = dfees;
		this.rank = rank;
	}
	
	public Docter() {

	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDspecialist() {
		return dspecialist;
	}
	public void setDspecialist(String dspecialist) {
		this.dspecialist = dspecialist;
	}
	public String getDcity() {
		return dcity;
	}
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}
	public int getDfees() {
		return dfees;
	}
	public void setDfees(int dfees) {
		this.dfees = dfees;
	}
	public double getRank() {
		return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
	}


	@Override
	public String toString() {
		return " ( " + did + ",  " + dname + ",  " + dspecialist + ",  " + dcity+ ",  " + dfees + ",  " + rank + " ) ";
	}

	
}