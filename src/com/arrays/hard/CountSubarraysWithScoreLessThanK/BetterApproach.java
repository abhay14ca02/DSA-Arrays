package com.arrays.hard.CountSubarraysWithScoreLessThanK;

//The score of an array is defined as the product of its sum and its length.
//For example, the score of [1, 2, 3, 4, 5] is (1 + 2 + 3 + 4 + 5) * 5 = 75.
//Given a positive integer array nums and an integer k, return the number of 
//non-empty subarrays of nums whose score is strictly less than k.
//A subarray is a contiguous sequence of elements within an array.
//Input: nums = [2,1,4,3,5], k = 10, Output: 6

public class BetterApproach {

	public static long countSubarrays(int[] nums, long k) {
		int n = nums.length;
		long total = 0L;
		for (int i = 1; i < n; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				long sum = (i == 0) ? nums[j] : nums[j] - nums[i - 1];
				if (sum * (j - i + 1) < k) {
					total += 1;
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 4, 3, 5 };
		long k = 10;
		long res = countSubarrays(nums, k);
		System.out.println(res);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)