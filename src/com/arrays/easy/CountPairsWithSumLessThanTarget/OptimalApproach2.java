package com.arrays.easy.CountPairsWithSumLessThanTarget;

import java.util.Arrays;

//Given a 0-indexed integer array nums of length n and an integer target, 
//return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
//Input: nums = [-1,1,2,3,1], target = 2
//Output: 3
//Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
//Output: 10

public class OptimalApproach2 {

	private static int countPairs(int[] nums, int target) {

		int n = nums.length;
		if (n < 2) {
			return 0;
		}
		Arrays.sort(nums);
		int left = 0;
		int right = n - 1;
		int count = 0;
		while (left < right) {
			int currSum = nums[left] + nums[right];
			if (currSum < target) {
				count += (right - left);// If nums[left] + nums[right] < target, then all numbers between left and right
										// will also form sums with nums[left] that are less than target.
				left++;
			} else {
				right--;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { -6, 2, 5, -2, -7, -1, 3 };
		int target = -2;
		int count = countPairs(nums, target);
		System.out.println(count);
	}
}
// Time Complexity : O(NLogN) + O(N)
// Space Complexity : O(1)
