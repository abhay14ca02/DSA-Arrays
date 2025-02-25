package com.arrays.medium.MaximumSumCircularSubarray;

public class OptimalSolution {
	private static int maxSubarraySumCircular(int[] nums) {
		int currMaxSum = 0;
		int currMinSum = 0;
		int totalSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		for (int num : nums) {
			totalSum += num;
			currMaxSum = Math.max(currMaxSum + num, num);
			currMinSum = Math.min(currMinSum + num, num);
			maxSum = Math.max(maxSum, currMaxSum);
			minSum = Math.min(minSum, currMinSum);
		}

		return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
	}

	public static void main(String[] args) {
		int[] nums = { 5, -3, 5 };
		int maxSubarraySum = maxSubarraySumCircular(nums);
		System.out.println(maxSubarraySum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)