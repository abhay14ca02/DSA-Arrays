package com.arrays.medium.KadanePrintSubArrayWithMaxSum;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4], Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [5,4,-1,7,8] ,Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

public class OptimalSolution {

	// Iterate through the array using a variable i. During each iteration, add the
	// current element arr[i] to a sum variable.
	// And take maxSum variable to keep track of the maximum sum after comparing
	// with current sum.
	// If any pint the sum becomes negative, reset it to 0, as a negative sum won't
	// contribute positively to the variable maximum sum.
	// Continue the iteration until all elements in the array are processed.
	// We will take 2 variables startIdx = -1 and endIdx = -1.
	// When sum == 0 it means start of new subarray and we will update startIdx
	// = i and if sum > 0 then we will update endIdx = i

	private static int[] printSubArray(int[] nums) {

		int n = nums.length;
		int maxSubSum = Integer.MIN_VALUE;
		int sum = 0;
		int startIdx = -1, endIdx = -1;
		int maxSubIdx[] = new int[2];
		for (int i = 0; i < n; i++) {
			if (sum == 0) {
				startIdx = i; // start of new subarray
			}
			sum += nums[i];
			if (sum > maxSubSum) {
				maxSubSum = sum;
				endIdx = i;
				maxSubIdx[0] = startIdx;
				maxSubIdx[1] = endIdx;

			}
			// If sum is negative then rest it to zero.

			if (sum < 0) {
				sum = 0;
			}
		}

		return maxSubIdx;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] maxSubIdx = printSubArray(nums);
		System.out.println("{" + maxSubIdx[0] + " " + maxSubIdx[1] + "}");
	}
}

//Time Complexity : O(N)
//Space Complexity : O(1)