package com.arrays.easy.TwoSum;

import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

public class BetterApproach3 {

	private static int[] findTwoSum(int[] nums, int target) {
		// We will sort the array in ascending order, take 2 pointers left & right and
		// assign left = 0 & right = arr.length -1.
		// We will iterate the array over 2 pointers in while loop and check if
		// array[left] + array[right] == target if matches then return indices left &
		// right

		int res[] = { -1, -1 };

		Arrays.sort(nums); // O(NLogN)

		int n = nums.length;
		int left = 0;
		int right = n - 1;
		while (left < right) { // O(N)
			int sum = nums[left] + nums[right];
			if (sum == target) {
				res[0] = left;
				res[1] = right;
				return res;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int res[] = findTwoSum(nums, target);
		System.out.print("{" + res[0] + " " + res[1] + "}");
	}
}

// Time Complexity : O(NlogN) + O(N)
// Space Complexity : O(1)