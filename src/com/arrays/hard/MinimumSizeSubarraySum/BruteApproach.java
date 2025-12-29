package com.arrays.hard.MinimumSizeSubarraySum;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a 
//subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//Input: target = 7, nums = [2,3,1,2,4,3], Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.

public class BruteApproach {
	public static int minSubArrayLen(int target, int[] nums) {
		int n = nums.length;
		int minLen = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];
				if (sum >= target) {
					minLen = Math.min(minLen, j - i + 1);
				}
			}
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		int res = minSubArrayLen(target, nums);
		System.out.println(res);
	}
}

//Time Complexity : O(N^2)
//Space Complexity : O(1)