package com.arrays.easy.CountPairsWithAbsDiffK;

// Given an array nums[] and a positive integer k, the task is to count all pairs (i, j) 
// such that i < j and absolute value of (nums [i] - nums[j]) is equal to k. 
// Input: nums = [1,2,2,1], k = 1
// Output: 4
public class BruteApproach1 {
	private static int countPairs(int[] nums, int k) {
		// The basic idea is to use two nested loops to generate all pairs in nums[]. For
		// each pair, if the absolute difference is equal to k, increment the count by 1
		int n = nums.length;
		if (n < 2) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(nums[i] - nums[j]) == k) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 1 };
		int k = 1;
		int count = countPairs(nums, k);
		System.out.println(count);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)