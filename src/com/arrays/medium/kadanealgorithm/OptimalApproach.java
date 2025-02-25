package com.arrays.medium.kadanealgorithm;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4], Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [5,4,-1,7,8] ,Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class OptimalApproach {

	private static int maxSubArray(int[] nums) {
		int n = nums.length;
		int maxSubArraySum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < n; i++) {
			currentSum += nums[i];
			maxSubArraySum = Math.max(maxSubArraySum, currentSum);
			// If currentSum is negative then assign it with zero.
			if (currentSum < 0) {
				currentSum = 0;
			}
		}

		return maxSubArraySum;
	}
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSubArraySum = maxSubArray(nums);
		System.out.println(maxSubArraySum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)