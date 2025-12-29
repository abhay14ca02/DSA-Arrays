package com.arrays.hard.smallestpositivemissingorfirstpositivemissing;

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//Input: nums = [1,2,0]
//Output: 3
//Input: nums = [3,4,-1,1]
//Output: 2
//Input: nums = [7,8,9,11,12]
//Output: 1

public class OptimalSolution1 {

	private static int findFirstPositiveMissing(int[] nums) {

		int n = nums.length;
		// STEP 1: Replace bad numbers with n+1
		for (int i = 0; i < n; i++) {
			if (nums[i] <= 0 || nums[i] > n) {
				nums[i] = n + 1;
			}
		}

		// STEP 2: Mark presence

		for (int i = 0; i < n; i++) {
			int val = Math.abs(nums[i]);
			if (val >= 1 && val <= n) {
				int idx = val - 1;
				if (nums[idx] > 0) {
					nums[idx] = -nums[idx];
				}
			}
		}

		// STEP 3: First positive index is answer

		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				return i + 1;
			}
		}

		// If all positions are correct, missing number is n+1

		return n + 1;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0 };
		int firstMissing = findFirstPositiveMissing(nums);
		System.out.println(firstMissing);
	}
}

// Time Complexity : O(N+N+N)
// Space Complexity : O(1)
