package com.arrays.easy.uniquenoofoccurrences;

import java.util.Arrays;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//Input: arr = [1,2]
//Output: false
public class BetterUniqueNoOfOccurrences {

	private static boolean findUniqueNoOfOccurrences(int[] arr) {
		int[] nums = new int[2001];

		for (int i = 0; i < arr.length; i++) {
			nums[arr[i] + 1000]++;
		}

		Arrays.sort(nums);

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != 0 && nums[i] == nums[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		boolean uniqueOccurrence = findUniqueNoOfOccurrences(arr);
		System.out.println(uniqueOccurrence);

	}
}
//Time Complexity : O(NLogN)
//Space Complexity : O(1)