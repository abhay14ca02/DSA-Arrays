package com.arrays.medium.IncreasingTripletSubsequence;

//Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
//such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
//Input: nums = [1,2,3,4,5], Output: true
//Input: nums = [5,4,3,2,1], Output: false
public class BruteSolution {
	private static boolean increasingTriplet(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] < nums[j] && nums[j] < nums[k]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 0, 4, 6 };
		boolean res = increasingTriplet(nums);
		System.out.println(res);
	}
}
//Time Complexity : O(N^3)
//Space Complexity : O(1)