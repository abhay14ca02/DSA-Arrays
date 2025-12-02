package com.arrays.easy.TwoSum;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

public class BruteApproach1 {

	private static int[] findTwoSum(int[] nums, int target) {

		// We will use 2 loops here, iterate over an array and compare nums[i] + nums[j] = target

		int res[] = { -1, -1 };
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {

				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
					return res;
				}

			}
		}
		return res;
	}

	public static void main(String[] args) {

		int nums[] = { 2, 7, 11, 15 };
		int target = 26;
		int res[] = findTwoSum(nums, target);
		System.out.print("{" + res[0] + " " + res[1] + "}");
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)