package com.arrays.medium.MaximumSumCircularSubarray;

//Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
//A circular array means the end of the array connects to the beginning of the array. Formally, 
//the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
//Input: nums = [1,-2,3,-2], Output: 3
//Explanation: Subarray [3] has maximum sum 3.

public class BetterSolution {

	private static int maxSumCircular(int[] nums) {
		int n = nums.length;
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += nums[i];
		}
		int circularMax = 0;
		int maxSum = kadaneMaxSum(nums, n);
		int minSum = kadaneMinSum(nums, n);

		circularMax = totalSum - minSum;

		// If all numbers are negative, maxSum is the answer.
		if (maxSum < 0)
			return maxSum;

		return Math.max(maxSum, circularMax);
	}

	private static int kadaneMaxSum(int[] nums, int n) {

		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {

			currSum += nums[i];
			if (currSum > maxSum) {
				maxSum = currSum;
			}
			if (currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}

	private static int kadaneMinSum(int[] nums, int n) {

		int currSum = 0;
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			currSum += nums[i];
			if (currSum < minSum) {
				minSum = currSum;
			}
			if (currSum > 0) {
				currSum = 0;
			}
		}
		return minSum;
	}

	public static void main(String[] args) {
		int[] nums = { 5, -3, 5 };
		int maxSubarraySum = maxSumCircular(nums);
		System.out.println(maxSubarraySum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)