package com.arrays.medium.containsduplicateI;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Input: nums = [1,2,3,1]
//Output: true
//Input: nums = [1,2,3,4]
//Output: false
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
public class OptimalContainsDuplicate {
	private static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			}
			map.put(nums[i], i);
		}

		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1,1,1,3,3,4,3,2,4,2 };
		boolean duplicate = containsDuplicate(nums);
		System.out.println(duplicate);
	}
}
