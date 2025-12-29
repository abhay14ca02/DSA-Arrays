package com.arrays.medium.NumberofWaystoSplitArray;

//You are given a 0-indexed integer array nums of length n.
//nums contains a valid split at index i if the following are true:
//The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
//There is at least one element to the right of i. That is, 0 <= i < n - 1.
//Return the number of valid splits in nums.
//Input: nums = [10,4,-8,7], Output: 2
public class OptimalApproach {

	private static int waysToSplitArray(int[] nums) {

		int n = nums.length;
		long totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += nums[i];
		}
		long leftSum = 0;
		int split = 0;
		for (int i = 0; i < n - 1; i++) {
			leftSum += nums[i];
			long rightSum = totalSum - leftSum;
			if (leftSum >= rightSum) {
				split += 1;
			}
		}
		return split;
	}

	public static void main(String[] args) {

		int[] nums = { 10, 4, -8, 7 };
		int split = waysToSplitArray(nums);
		System.out.println(split);
	}
}
//Time Complexity:O(N)+O(N)
//Space Complexity:O(1)