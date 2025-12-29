package com.arrays.hard.KthSmallestElement;

import java.util.Arrays;

//Given an integer array arr[] and k. Find the k'th smallest element in the given array.
//Note: k is always smaller than the size of the array.
//Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4, Output: 5
//Explanation: 4th smallest element in the given array is 5.
public class BruteApproach {

	private static int findKthSmallest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[k - 1];
	}

	public static void main(String[] args) {

		int[] nums = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
		int k = 4;
		int res = findKthSmallest(nums, k);
		System.out.println(res);
	}
}

//Time Complexity : O(NLogN)
//Space Complexity: O(1)