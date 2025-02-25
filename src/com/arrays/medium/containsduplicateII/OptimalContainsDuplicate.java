package com.arrays.medium.containsduplicateII;

import java.util.HashMap;

//Given an integer array nums and an integer k, return true if there are two distinct indices
//i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
public class OptimalContainsDuplicate {
	private static boolean containsDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				int diff = Math.abs(map.get(nums[i]) - i);
				if (diff <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		boolean duplicate = containsDuplicate(nums, k);
		System.out.println(duplicate);
	}

}
