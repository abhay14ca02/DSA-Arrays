package com.arrays.medium.findduplicatenum;

import java.util.Arrays;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.
//Input: nums = [1,3,4,2,2]
//Output: 2
//Input: nums = [3,3,3,3,3]
//Output: 3

public class BetterApproach2 {

	// We will sort the array first
	// Iterate over an array, comparing current number to the previous number
	private static int findDuplicateNum(int[] nums) {

		Arrays.sort(nums);

		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		int duplicateNum = findDuplicateNum(nums);
		System.out.println("Duplicate Element :: " + duplicateNum);
	}
}

//Time Complexity : O(NLogN) + O(N)
//Space Complexity : O(1)