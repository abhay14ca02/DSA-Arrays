package com.arrays.hard.LongestSubarrayWithSumK;

//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. 
//If no such sub-array exists, return 0.
//Input: nums = [10, 5, 2, 7, 1, 9], k = 15 , Output: 4  
public class BetterApproach2 {

	private static int longestSubarraySumK(int[] nums, int k) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		int[] prefixSum = new int[n];
		prefixSum[0] = nums[0];
		// Building Prefix Sum
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i];
		}
		int maxLength = 0;
		// Try all subarrays using prefix sums
		for (int i = 0; i < n; i++) {// starting index of subarray
			for (int j = i; j < n; j++) {// ending index of subarray
				int sum;
				if (i == 0) {
					sum = prefixSum[j];
				} else {
					sum = prefixSum[j] - prefixSum[i - 1];
				}
				if (sum == k) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {

		int[] nums = { 10, 5, 2, 7, 1, 9 };
		int k = 15;
		int res = longestSubarraySumK(nums, k);
		System.out.println(res);
	}
}
//Time Complexity : O(N^2) + O(N)
//Space Complexity : O(N)