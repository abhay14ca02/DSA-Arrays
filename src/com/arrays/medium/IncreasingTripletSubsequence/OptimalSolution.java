package com.arrays.medium.IncreasingTripletSubsequence;

//Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
//such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
//Input: nums = [1,2,3,4,5], Output: true
//Input: nums = [5,4,3,2,1], Output: false

public class OptimalSolution {
	// First, we can find first & second smallest values in a given subsequence.
	// The, we're going to check if there is a value which larger than first & second smallest value in given sequence.
	// If thirdNum > firstNum && thirdNum > secondNum, which there is an increasing triplet
	private static boolean increasingTriplet(int[] nums) {

		int n = nums.length;
		int firstNum = Integer.MAX_VALUE;
		int secondNum = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int thirdNum = nums[i];
			if (thirdNum <= firstNum) {
				firstNum = thirdNum;
			} else if (thirdNum <= secondNum) {
				secondNum = thirdNum;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 20, 100, 10, 12, 5, 13 };
		boolean res = increasingTriplet(nums);
		System.out.println(res);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1) 