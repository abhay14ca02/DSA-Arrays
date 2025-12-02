package com.arrays.easy.CountPairsWithSumLessThanTarget;

// Given a 0-indexed integer array nums of length n and an integer target, 
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
// Input: nums = [-1,1,2,3,1], target = 2
// Output: 3
// Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
// Output: 10
public class BruteApproach {

	private static int countPairs(int[] nums, int target) {

		int n = nums.length;
		if (n < 2) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] < target) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { -6, 2, 5, -2, -7, -1, 3 };
		int target = -2;
		int count = countPairs(nums, target);
		System.out.println(count);
	}

}

// Time Complexity : O(N*N)
// Space Complexity