package com.arrays.hard.RepeatingAndMissingNumber;

//Given an integer array nums of size n containing values from [1, n] and each value appears 
//exactly once in the array, except for A, which appears twice and B which is missing
//Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
//Note: You are not allowed to modify the original array. 
//Input: nums = [3, 5, 4, 1, 1], Output: [1, 2] 
//Input: nums = [1, 2, 3, 6, 7, 5, 7], Output: [7, 4] 

public class OptimalSolution2 {

	private static int[] findRepeatingAndMissing(int[] nums) {
		int n = nums.length;
		int repeating, missing;

		long arrSum = 0;
		long arrSqrSum = 0;

		for (int num : nums) {
			arrSum += num;
			arrSqrSum += (long) num * num;
		}

		long expectedSum = (long) n * (n + 1) / 2;
		long expectedSqrSum = (long) n * (n + 1) * (2 * n + 1) / 6;

		long diffSum = arrSum - expectedSum; // A - B

		long diffSquare = arrSqrSum - expectedSqrSum; // A^2 - B^2

		long sumAB = diffSquare / diffSum; // A + B

		long A = (diffSum + sumAB) / 2;
		long B = A - diffSum;
		repeating = (int) A;
		missing = (int) B;
		return new int[] { repeating, missing };
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 6, 7, 5, 7 };
		int[] result = findRepeatingAndMissing(nums);
		// Print the repeating and missing numbers found
		System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
	}
}

// Time Complexity : O(N)
// Space Complexity : O(1)