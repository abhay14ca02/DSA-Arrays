package com.arrays.hard.MinimumSizeSubarraySum;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a 
//subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//Input: target = 7, nums = [2,3,1,2,4,3], Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.

public class OptimalApproach {
	public static int minSubArrayLen(int target, int[] nums) {
		int n = nums.length;
		int minLen = Integer.MAX_VALUE;
		int sum = 0, start = 0;
		for (int end = 0; end < n; end++) {
			sum += nums[end];
			while (sum >= target && start <= end) {
				minLen = Math.min(minLen, end - start + 1);
				sum -= nums[start++];
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

//Time Complexity : O(N)
//Space Complexity : O(1)