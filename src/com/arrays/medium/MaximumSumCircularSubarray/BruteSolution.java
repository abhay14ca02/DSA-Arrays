package com.arrays.medium.MaximumSumCircularSubarray;

//Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
//A circular array means the end of the array connects to the beginning of the array. Formally, 
//the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
//Input: nums = [1,-2,3,-2], Output: 3
//Explanation: Subarray [3] has maximum sum 3.

public class BruteSolution {
	private static int maxSumCircular(int[] nums) {

		int res = Integer.MIN_VALUE;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			rotate(nums, n);
			res = Math.max(res, kadane(nums));
		}
		return res;
	}

	private static void rotate(int[] nums, int n) {
		int temp = nums[0];
		for (int i = 0; i < n - 1; i++) {
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}

	}

	private static int kadane(int[] nums) {
		int currSum = 0;
		int n = nums.length;
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

	public static void main(String[] args) {
		int[] nums = { 1, -2, 3, -2 };
		int maxSubarraySum = maxSumCircular(nums);
		System.out.println(maxSubarraySum);

	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)
