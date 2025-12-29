package com.arrays.medium.EquilibriumPointInAnArray;

//Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements
//before that index is the same as the sum of elements after it. Return -1 if no such point exists. 
//Input: arr[] = [-7, 1, 5, 2, -4, 3, 0], Output: 3

public class OptimalSolution {

	// right sum = total sum - left sum - arr[i]
	// if left sum == right sum then equilibrium point/index found

	private static int findEquilibrium(int[] arr) {

		int n = arr.length;
		// If only one element then equilibrium index
		if (n == 1) {
			return arr[0];
		}

		int totalSum = 0;

		for (int num : arr) {
			totalSum += num;
		}

		int rightSum = 0, leftSum = 0;

		for (int i = 0; i < n; i++) {

			rightSum = totalSum - leftSum - arr[i];
			if (leftSum == rightSum) {
				return i; // equilibrium index found
			}

			leftSum += arr[i];

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int eqiPoint = findEquilibrium(arr);
		System.out.println(eqiPoint);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
