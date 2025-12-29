package com.arrays.hard.LongestSubarrayWithSumZero;

import java.util.HashMap;
import java.util.Map;

//Given an array containing both positive and negative integers, 
//we have to find the length of the longest subarray with the sum of all elements equal to zero. 
//Input : nums = {6, -2, 2, -8, 1, 7, 4, -10}, Output = 8
public class OptimalSolution {

	private static int longestZeroSumSubarray(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1); // prefix sum 0 at index -1
		int prefixSum = 0;
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			prefixSum += nums[i];

			if (map.containsKey(prefixSum)) {
				// Length of current valid subarray
				int len = i - map.get(prefixSum);
				maxLength = Math.max(maxLength, len);
			} else {
				// Store the first occurrence of a prefix sum
				map.put(prefixSum, i);
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int nums[] = { 6, -2, 2, -8, 1, 7, 4, -10 };
		int res = longestZeroSumSubarray(nums);
		System.out.println(res);
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N)
