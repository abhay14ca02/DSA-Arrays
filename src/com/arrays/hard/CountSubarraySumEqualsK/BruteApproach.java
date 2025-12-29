package com.arrays.hard.CountSubarraySumEqualsK;

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Input: nums = [1,1,1], k = 2, Output: 2
//Input: nums = [1,2,3], k = 3, Output: 2
public class BruteApproach {

	public static int countSubarraySumK(int[] nums, int k) {

		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int l = i; l <= j; l++) {
					sum += nums[l];
				}
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1 };
		int k = 2;
		int res = countSubarraySumK(nums, k);
		System.out.println(res);
	}
}

//Time Complexity : O(N^3)
//Space Complexity : O(1)
