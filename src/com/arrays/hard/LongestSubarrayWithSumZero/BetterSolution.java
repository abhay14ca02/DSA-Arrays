package com.arrays.hard.LongestSubarrayWithSumZero;

//Given an array containing both positive and negative integers, 
//we have to find the length of the longest subarray with the sum of all elements equal to zero. 
//Input : nums = {6, -2, 2, -8, 1, 7, 4, -10}, Output = 8
public class BetterSolution {

	private static int longestZeroSumSubarray(int[] nums) {

		int n = nums.length;
		int maxLength = 0;
		int[] prefixSum = new int[n];
		// Build prefix sum
		prefixSum[0] = nums[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i];
		}
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				int sum;
				if (i == 0) {
					sum = prefixSum[j];
				} else {
					sum = prefixSum[j] - prefixSum[i - 1];
				}
				if (sum == 0) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
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
//Time Complexity : O(N^2) + O(N)
//Space Complexity : O(N)
