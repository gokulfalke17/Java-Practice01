package company.programming.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfWord {
	
	public static void main(String[] args) {
		
		//Using String simply way
		/*String str[] = {"sachin", "saurabh", "samir", "sahsh", "saurabh", "sachin"};
		
		for(int i=0; i<str.length; i++) {
			int count = 1;
			if(str[i]!=null) {
				for (int j = i+1; j < str.length; j++) {
					if(str[i].equals(str[j])) {
						count++;
						str[j]=null;
					}
				}
				
				System.out.println(str[i]+"-->"+count);
			}
		}*/
		
		//In Array elements
		
		/*int arr[] = {1, 2, 3, 1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if(arr[i]!=-1) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(arr[i]+"-->"+count);
			}
		}*/
		
		//String using Map
		/*String str[] = {"sachin", "saurabh", "samir", "sahsh", "saurabh", "sachin"};
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : str) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}*/
		
		
		//String using Map and java 8 feature
		String str[] = {"sachin", "saurabh", "samir", "sahsh", "saurabh", "sachin"};
		
		Map<Object, Long> map = Arrays.stream(str).collect(Collectors.groupingBy(s->s, Collectors.counting()));
		
		map.forEach((key, value)->System.out.println(key+"-->"+value));
		
	}
}
