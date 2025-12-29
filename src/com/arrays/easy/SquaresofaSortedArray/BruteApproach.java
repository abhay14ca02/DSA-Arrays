package com.arrays.easy.SquaresofaSortedArray;

import java.util.Arrays;

//Given an integer array nums sorted in non-decreasing order, return an array of the 
//squares of each number sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10], Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
public class BruteApproach {

	private static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] result = sortedSquares(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity:O(N) + O(NLogN)
//Space Complexity : O(1)