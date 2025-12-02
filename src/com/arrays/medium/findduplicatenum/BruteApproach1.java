package com.arrays.medium.findduplicatenum;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.
//Input: nums = [1,3,4,2,2]
//Output: 2
//Input: nums = [3,3,3,3,3]
//Output: 3

public class BruteApproach1 {

	// We will use 2 loops where we will compare nums[i] == nums[j], if both are
	// equal then we will have duplicate element and return either of them.
	private static int findDuplicateNum(int[] nums) {

		int n = nums.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					return nums[i];
				}
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
//Time Complexity : O(N*N)
//Space Complexity : O(1)