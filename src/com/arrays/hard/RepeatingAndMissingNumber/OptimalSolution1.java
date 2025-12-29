package com.arrays.hard.RepeatingAndMissingNumber;

//Given an integer array nums of size n containing values from [1, n] and each value appears 
//exactly once in the array, except for A, which appears twice and B which is missing
//Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
//Note: You are not allowed to modify the original array. 
//Input: nums = [3, 5, 4, 1, 1], Output: [1, 2] 
//Input: nums = [1, 2, 3, 6, 7, 5, 7], Output: [7, 4] 

public class OptimalSolution1 {

	private static int[] findRepeatingAndMissing(int[] nums) {
		int n = nums.length;
		int repeating = -1, missing = -1;
		for (int i = 0; i < n; i++) {
			int val = Math.abs(nums[i]);
			int idx = val - 1;
			if (nums[idx] > 0) {
				nums[idx] = -nums[idx];
			} else {
				repeating = val;
				break;
			}
		}

		int arrSum = 0;
		for (int i = 0; i < n; i++) {
			arrSum += Math.abs(nums[i]); // As nums marked as negative, take abs(nums[i)
		}

		// Natural numbers sum from 1 to n
		int expectedSum = n * (n + 1) / 2;

		missing = expectedSum + repeating - arrSum;

		return new int[] { repeating, missing };
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 6, 7, 5, 7 };
		int[] result = findRepeatingAndMissing(nums);
		// Print the repeating and missing numbers found
		System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
	}
}
// Time Complexity : O(N) + O(N)
// Space Complexity : O(1)