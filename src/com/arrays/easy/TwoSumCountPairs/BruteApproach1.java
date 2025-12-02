package com.arrays.easy.TwoSumCountPairs;

// Given an array arr[] of n integers and a target value, find the number of pairs of integers in the array whose sum is equal to target.
// Input: arr[] = [1, 5, 7, -1, 5], target = 6
// Output:  3
public class BruteApproach1 {

	private static int countPairs(int[] arr, int target) {

		// We will use 2 loops here, iterate through the array and compare arr[i] +
		// arr[j] == target and count pairs.
		int n = arr.length;

		if (n < 2) {
			return 0;
		}
		
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, -1, 5 };
		int target = 6;
		int res = countPairs(arr, target);
		System.out.println("Total pairs :: " + res);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)