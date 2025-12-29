package com.arrays.hard.ReversePairs;

///Given an integer array nums, return the number of reverse pairs in the array.
//A reverse pair is a pair (i, j) where: 0 <= i < j < nums.length and nums[i] > 2 * nums[j].
//Input: nums = [1,3,2,3,1], Output: 2
//Input: nums = [2,4,3,5,1], Output: 3

public class BruteSolution {
	private static int reversePairs(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((long) nums[i] > 2L * nums[j]) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 4, 3, 5, 1 };
		int result = reversePairs(nums);
		System.out.println(result);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)