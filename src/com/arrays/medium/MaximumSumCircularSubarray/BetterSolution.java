package com.arrays.medium.MaximumSumCircularSubarray;

public class BetterSolution {

	private static int maxSubarraySumCircular(int[] nums) {
		int n = nums.length;
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += nums[i];
		}
		int maxSubArrSum = 0;
		int maxSum = kadaneMaxSum(nums, n);
		int minSum = kadaneMinSum(nums, n);
		maxSubArrSum = totalSum - minSum;
		if (maxSum > 0) {
			return Math.max(maxSum, maxSubArrSum);
		}
		return maxSum;
	}

	private static int kadaneMaxSum(int[] nums, int n) {

		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			currSum = Math.max(currSum + nums[i], nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

	private static int kadaneMinSum(int[] nums, int n) {

		int currSum = 0;
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			currSum = Math.min(currSum + nums[i], nums[i]);
			minSum = Math.min(minSum, currSum);
		}
		return minSum;
	}

	public static void main(String[] args) {
		int[] nums = { 5, -3, 5 };
		int maxSubarraySum = maxSubarraySumCircular(nums);
		System.out.println(maxSubarraySum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)