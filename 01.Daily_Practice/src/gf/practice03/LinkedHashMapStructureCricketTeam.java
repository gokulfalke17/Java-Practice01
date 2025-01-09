package gf.practice03;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Players {
	
	private int id;
	private String name;
	private int runs;
	
	
}

public class LinkedHashMapStructureCricketTeam {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, ArrayList<Players>> lhm = new LinkedHashMap<String, ArrayList<Players>>();
		
		ArrayList<Players> Iplayers = new ArrayList<Players>();
		Iplayers.add(new Players(1, "MS Dhoni", 10000));
		Iplayers.add(new Players(2, "Rohit Sharma", 5000));
		
		ArrayList<Players> aplayers = new ArrayList<Players>();
		aplayers.add(new Players(1, "Trevis Head", 10000));
		aplayers.add(new Players(2, "Devid Warnner", 5000));
		
		lhm.put("India", Iplayers);
		lhm.put("Austrolia", aplayers); 

		for(Map.Entry<String, ArrayList<Players>> entry : lhm.entrySet() ) {

			System.out.println(entry.getKey());
			System.out.println("====================");
			
			for(Players p : entry.getValue()) {
				System.out.println(p.getId()+" "+p.getName()+" "+p.getRuns());
				
			}
			System.out.println();

		}
		
	}
}
