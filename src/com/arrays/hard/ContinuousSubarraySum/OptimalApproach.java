package com.arrays.hard.ContinuousSubarraySum;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
//its length is at least two, and the sum of the elements of the subarray is a multiple of k.
//An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
//Input: nums = [23,2,4,6,7], k = 6, Output: true
//Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
//Input: nums = [23,2,6,4,7], k = 6, Output: true
//Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
//42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.

public class OptimalApproach {

	private static boolean checkSubArraySum(int[] nums, int k) {

		int n = nums.length;
		if (n == 1) {
			return false;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1); // remainder 0 at index -1
		int prefixSum = 0;
		for (int i = 0; i < n; i++) {
			prefixSum += nums[i];
			// Edge Case: k == 0
			// We check if there are two consecutive zeros
			// Because only 0 can be a multiple of 0
			int remainder = (k == 0) ? prefixSum : prefixSum % k;
			// Check if it's present in map
			if (map.containsKey(remainder)) {
				if (i - map.get(remainder) >= 2) {
					return true; // found valid subarray
				}
			} else {
				map.put(remainder, i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 23, 2, 4, 6, 7 };
		int k = 6;
		boolean checkSubArraySum = checkSubArraySum(nums, k);
		System.out.println(checkSubArraySum);
	}
}
//Time Complexity:O(N)
//Space Complexity:O(N)
