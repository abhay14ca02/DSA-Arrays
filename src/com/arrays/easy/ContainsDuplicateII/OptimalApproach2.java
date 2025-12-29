package com.arrays.easy.ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
//such that nums[i] == nums[j] and abs(i - j) <= k.
//Input: nums = [1,2,3,1], k = 3, Output: true
//Input: nums = [1,2,3,1,2,3], k = 2, Output: false

public class OptimalApproach2 {

	private static boolean containsNearbyDuplicate(int[] nums, int k) {
		int n = nums.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) {
				int prevIdx = map.get(nums[i]);
				if (i - prevIdx <= k) {
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
		boolean duplicate = containsNearbyDuplicate(nums, k);
		System.out.println(duplicate);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(N)
