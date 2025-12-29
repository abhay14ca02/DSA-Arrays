package com.arrays.hard.LongestSubarrayWithSumK;

//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. 
//If no such sub-array exists, return 0.
//Input: nums = [10, 5, 2, 7, 1, 9], k = 15 , Output: 4  
public class BruteApproach {

	private static int longestSubarraySumK(int[] nums, int k) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int l = i; l <= j; l++) {
					sum += nums[l];
				}
				if (sum == k) {
					maxLength = Math.max(maxLength, j - i + 1);
					break;
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

// Time Complexity : O(N^3)
// Space Complexity : O(1)