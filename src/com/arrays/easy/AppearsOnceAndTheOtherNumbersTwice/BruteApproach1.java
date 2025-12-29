package com.arrays.easy.AppearsOnceAndTheOtherNumbersTwice;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
// Input: nums = [2,2,1], output = 1
// Input: nums = [4,1,2,1,2], Output: 4
public class BruteApproach1 {

	private static int singleNumber(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 1, 2, 1, 2 };
		int num = singleNumber(nums);
		System.out.println(num);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)