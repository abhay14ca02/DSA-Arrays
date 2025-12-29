package com.arrays.medium.kadanealgorithm;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4], Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [5,4,-1,7,8] ,Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class BruteApproach {

	private static int maxSubSum(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) { // start index
			
			for (int j = i; j < n; j++) { // end index
				
				int sum = 0;
				// Calculate the sum of subarray nums[i...j]
				for (int k = i; k <= j; k++) { // iterate from i to j
					sum += nums[k];
				}	
				maxSum = Math.max(maxSum, sum);
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, -2, 7, -4 };
		int maxSum = maxSubSum(nums);
		System.out.println(maxSum);
	}
}

// Time Complexity : O(N^3)
// Space Complexity : O(1)