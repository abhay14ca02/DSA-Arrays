package com.arrays.medium.EquilibriumPointInAnArray;

//Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements
//before that index is the same as the sum of elements after it. Return -1 if no such point exists. 
//Input: arr[] = [-7, 1, 5, 2, -4, 3, 0], Output: 3

public class BruteForce {

	private static int findEquilibrium(int[] arr) {

		int n = arr.length;

		// If only one element then equilibrium index itself
		
		if (n == 1) {
			return arr[0];
		}

		for (int i = 0; i < n; i++) {

			int leftSum = 0, rightSum = 0;

			for (int j = 0; j < i; j++) {
				leftSum += arr[j];
			}

			for (int j = i + 1; j < n; j++) {
				rightSum += arr[j];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int eqiPoint = findEquilibrium(arr);
		System.out.println(eqiPoint);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)