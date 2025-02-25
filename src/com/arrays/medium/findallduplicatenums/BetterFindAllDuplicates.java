package com.arrays.medium.findallduplicatenums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, 
//return an array of all the integers that appears twice.
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
//Input: nums = [1,1,2]
//Output: [1]
//Input: nums = [1]
//Output: []
public class BetterFindAllDuplicates {

	private static List<Integer> findAllDuplicates(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				list.add(entry.getKey());
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1, 4 };
		List<Integer> ans = findAllDuplicates(arr);
		System.out.println(ans);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)