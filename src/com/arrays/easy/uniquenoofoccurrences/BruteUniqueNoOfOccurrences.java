package com.arrays.easy.uniquenoofoccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//Input: arr = [1,2]
//Output: false
public class BruteUniqueNoOfOccurrences {

	private static boolean findUniqueNoOfOccurrences(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (set.contains(entry.getValue())) {
				return false;
			} else {
				set.add(entry.getValue());
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		boolean uniqueOccurrence = findUniqueNoOfOccurrences(arr);
		System.out.println(uniqueOccurrence);

	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)