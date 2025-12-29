package com.arrays.medium.CheckifArrayIsSortedandRotated;

//Given an array nums, return true if the array was originally sorted in non-decreasing order, 
//then rotated some number of positions (including zero). Otherwise, return false.
//There may be duplicates in the original array.
//Note: An array A rotated by x positions results in an array B of the same length 
//such that B[i] == A[(i+x) % A.length] for every valid index i.
//Input: nums = [3,4,5,1,2], Output: true
//Input: nums = [2,1,3,4], Output: false
//Input: nums = [1,2,3], Output: true

public class OptimalSolution {
	private static boolean checkSortedRotated(int[] nums) {
		int n = nums.length;
		int peak = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] > nums[(i + 1) % n]) {
				peak += 1;
			}
		}
		return peak <= 1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		boolean check = checkSortedRotated(nums);
		System.out.println(check);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1)