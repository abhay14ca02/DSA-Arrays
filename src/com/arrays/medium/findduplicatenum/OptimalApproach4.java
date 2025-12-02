package com.arrays.medium.findduplicatenum;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.
//Input: nums = [1,3,4,2,2]
//Output: 2
//Input: nums = [3,3,3,3,3]
//Output: 3

public class OptimalApproach4 {
	// Use element as Index and mark the visited place with negative
	// When we use element as Index then we will do element - 1
	private static int findDuplicateNum(int[] nums) {
		
		int n = nums.length;
		
		for (int i = 0; i < n; i++) {
			int val = Math.abs(nums[i]);
			if (nums[val - 1] > 0) {
				nums[val - 1] = -nums[val - 1];
			} else {
				return val;
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

//Time Complexity : O(N)
//Space Complexity : O(1)
// But we're modifying the array in this approach which strictly not allowed.
