package com.arrays.easy.ContainsDuplicateII;

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
// such that nums[i] == nums[j] and abs(i - j) <= k.
// Input: nums = [1,2,3,1], k = 3, Output: true
// Input: nums = [1,2,3,1,2,3], k = 2, Output: false

public class BruteApproach1 {

	private static boolean containsNearbyDuplicate(int[] nums, int k) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		boolean duplicate = containsNearbyDuplicate(nums, k);
		System.out.println(duplicate);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)