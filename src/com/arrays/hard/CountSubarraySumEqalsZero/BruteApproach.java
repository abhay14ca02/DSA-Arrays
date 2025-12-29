package com.arrays.hard.CountSubarraySumEqalsZero;

//You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.
//Input: nums[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7], Output: 4

public class BruteApproach {

	private static int findSubarray(int[] nums) {
		int n = nums.length;
		int total = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];
				if (sum == 0) {
					total += 1;
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] nums = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int res = findSubarray(nums);
		System.out.println(res);
	}
}

//Time Complexity : O(N^2)
//Space Complexity : O(1)