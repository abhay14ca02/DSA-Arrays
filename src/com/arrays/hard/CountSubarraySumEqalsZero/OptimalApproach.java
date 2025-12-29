package com.arrays.hard.CountSubarraySumEqalsZero;

import java.util.HashMap;
import java.util.Map;

//You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.
//Input: nums[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7], Output: 4

public class OptimalApproach {

	private static int findSubarray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int total = 0, prefixSum = 0;
		for (int num : nums) {
			prefixSum += num;
			if (map.containsKey(prefixSum)) {
				total += map.get(prefixSum);
				map.put(prefixSum, map.get(prefixSum) + 1);
			} else {
				map.put(prefixSum, 1);
			}
		}

		return total;
	}

	public static void main(String[] args) {
		int[] nums = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int res = findSubarray(nums);
		System.out.println(res);
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N)