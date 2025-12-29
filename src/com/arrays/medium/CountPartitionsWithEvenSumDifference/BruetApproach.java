package com.arrays.medium.CountPartitionsWithEvenSumDifference;

//You are given an integer array nums of length n. A partition is defined as an index i where 0 <= i < n - 1, 
//splitting the array into two non-empty subarrays such that:
//Left subarray contains indices [0, i].
//Right subarray contains indices [i + 1, n - 1].
//Return the number of partitions where the difference between the sum of the left and right subarrays is even.
//Input: nums = [10,10,3,7,6], Output: 4
public class BruetApproach {

	public static int countPartitions(int[] nums) {
		int n = nums.length;
		int split = 0;
		for (int i = 0; i < n - 1; i++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 0; j <= i; j++) {
				leftSum += nums[j];
			}
			for (int k = i + 1; k < n; k++) {
				rightSum += nums[k];
			}
			if (Math.abs(leftSum - rightSum) % 2 == 0) {
				split += 1;
			}
		}
		return split;

	}

	public static void main(String[] args) {
		int[] nums = { 10, 10, 3, 7, 6 };
		int res = countPartitions(nums);
		System.out.println(res);
	}
}
// Time Complexity : O(N^2)
// Space Complexity : O(1)
