package com.arrays.medium.kadanealgorithm;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4], Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [5,4,-1,7,8] ,Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class OptimalApproach {

	// Iterate through the array using a variable i. During each iteration, add the
	// current element arr[i] to a sum variable.
	// And take maxSum variable to keep track of the maximum sum after comparing
	// with current sum.
	// If any pint the sum becomes negative, reset it to 0, as a negative sum won't
	// contribute positively to the variable maximum sum.
	// Continue the iteration until all elements in the array are processed.
	
	private static int maxSubArray(int[] nums) {
		int n = nums.length;
		int maxSubSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			maxSubSum = Math.max(maxSubSum, sum);
			// If sum is negative then rest it to zero.
			if (sum < 0) {
				sum = 0;
			}
		}

		return maxSubSum;
	}

	public static void main(String[] args) {
		int[] nums = { -3, -2, -5 };
		int maxSubArraySum = maxSubArray(nums);
		System.out.println(maxSubArraySum);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)