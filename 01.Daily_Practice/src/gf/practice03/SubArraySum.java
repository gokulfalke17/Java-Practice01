package gf.practice03;

import java.util.HashMap;

public class SubArraySum {
	 public static void main(String[] args) {
	        int[] arr = {10, 2, -2, -20, 10};
	        int target = -10;
	        System.out.println("Count of Subarrays with Sum " + target + ": " + countSubarrays(arr, target));
	    }

	    private static int countSubarrays(int[] arr, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        map.put(0, 1);
	        int sum = 0, count = 0;

	        for (int num : arr) {
	            sum += num;
	            if (map.containsKey(sum - target)) {
	                count += map.get(sum - target);
	            }
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return count;
	    }
}
