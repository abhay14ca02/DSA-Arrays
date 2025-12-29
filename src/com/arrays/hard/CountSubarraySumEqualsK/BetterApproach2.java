package com.arrays.hard.CountSubarraySumEqualsK;

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Input: nums = [1,1,1], k = 2, Output: 2
//Input: nums = [1,2,3], k = 3, Output: 2
public class BetterApproach2 {

	public static int countSubarraySumK(int[] nums, int k) {
		int n = nums.length;
		int prefixSum[] = new int[n];
		int count = 0;
		// Build prefix sum
		prefixSum[0] = nums[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		int k = 3;
		int res = countSubarraySumK(nums, k);
		System.out.println(res);
	}
}

//Time Complexity : O(N^2)
//Space Complexity : O(N)
