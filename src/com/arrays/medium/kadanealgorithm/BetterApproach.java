package com.arrays.medium.kadanealgorithm;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4], Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [5,4,-1,7,8] ,Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

public class BetterApproach {

//The idea is to run two nested loops to iterate over all possible subarrays and find the maximum sum. 
//The outer loop will mark the starting point of a subarray and inner loop will mark the ending point of the subarray.

	private static int maxSubArray(int[] nums) {

		int n = nums.length;
		int maxSubSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {// start index
			int sum = 0;
			for (int j = i; j < n; j++) {// end index
				sum += nums[j];
				maxSubSum = Math.max(maxSubSum, sum);
			}
		}
		return maxSubSum;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSubArraySum = maxSubArray(nums);
		System.out.println(maxSubArraySum);
	}
}
//Time Complexity : O(N*N)
//Space Complexity : O(1)