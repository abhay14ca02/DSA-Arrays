package com.arrays.medium.findduplicatenum;

import java.util.HashSet;
import java.util.Set;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return true if number is repeated.
//You must solve the problem without modifying the array nums and using only constant extra space.
//Input: nums = [1,3,4,2,2]
//Output: true
//Input: nums = [3,3,3,3,3]
//Output: true

public class BetterApproach {

	private static boolean findDuplicateNum(int[] nums) {

		Set<Integer> set = new HashSet<Integer>();
		for (Integer num : nums) {

			set.add(num);
		}
		return set.size() < nums.length;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 2, 2 };
		boolean isDuplicate = findDuplicateNum(nums);
		System.out.println("Duplicate Element found :: " + isDuplicate);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(N)