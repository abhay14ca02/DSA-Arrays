package com.arrays.medium.MaximumSumCircularSubarray;

//Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
//A circular array means the end of the array connects to the beginning of the array. Formally, 
//the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
//Input: nums = [1,-2,3,-2], Output: 3
//Explanation: Subarray [3] has maximum sum 3.

public class OptimalSolution {
	private static int maxSumCircular(int[] nums) {
		int currMax = 0;
		int currMin = 0;
		int totalSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		
		for (int num : nums) {

			totalSum += num;
			currMax += num;

			if (currMax > maxSum) {
				maxSum = currMax;
			}
			if (currMax < 0) {
				currMax = 0;
			}
			currMin += num;

			if (currMin < minSum) {
				minSum = currMin;
			}
			if (currMin > 0) {
				currMin = 0;
			}

		}

		return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
	}

	public static void main(String[] args) {
		int[] nums = { 5, -3, 5 };
		int maxSubarraySum = maxSumCircular(nums);
		System.out.println(maxSubarraySum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)