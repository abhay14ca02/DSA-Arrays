package com.arrays.medium.findduplicatenum;

import java.util.HashSet;
import java.util.Set;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.
//Input: nums = [1,3,4,2,2]
//Output: 2
//Input: nums = [3,3,3,3,3]
//Output: 3

public class BetterApproach3 {

	private static int findDuplicateNum(int[] nums) {
		// Initialize a HashSet
		// HashSet is used to store unique elements only
		// If an element is encounter while traversing, and is present in HashSet so
		// that is duplicate element

		int n = nums.length;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {

			if (set.contains(nums[i])) {
				return nums[i];
			}

			set.add(nums[i]);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		int duplicateNum = findDuplicateNum(nums);
		System.out.println("Duplicate Element :: " + duplicateNum);
	}

}

//Time Complexity : O(N)
//Space Complexity : O(N)