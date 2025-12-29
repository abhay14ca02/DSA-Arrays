package com.arrays.hard.RepeatingAndMissingNumber;

//Given an integer array nums of size n containing values from [1, n] and each value appears 
//exactly once in the array, except for A, which appears twice and B which is missing
//Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
//Note: You are not allowed to modify the original array. 
// Input: nums = [3, 5, 4, 1, 1], Output: [1, 2] 
// Input: nums = [1, 2, 3, 6, 7, 5, 7], Output: [7, 4]  
public class BruteSolution {

	private static int[] findRepeatingAndMissing(int[] nums) {
		int n = nums.length;
		int repeating = -1, missing = -1;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (nums[j] == i) {
					count++;
				}
			}
			if (count == 2) {
				repeating = i;

			} else if (count == 0) {
				missing = i;
			}
			if (repeating != -1 && missing != -1) {
				break;
			}
		}
		return new int[] { repeating, missing };
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 6, 7, 5, 7 };
		int[] result = findRepeatingAndMissing(nums);
		// Print the repeating and missing numbers found
		System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)