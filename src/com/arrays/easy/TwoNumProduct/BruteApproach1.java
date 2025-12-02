package com.arrays.easy.TwoNumProduct;

// Given an array arr[] of n distinct integers and a target value, the task is to check whether 
// there is a pair of elements in the array whose product is equal to target.
// Input: arr[] = [1, 5, 7, -1, 5], target = 35
// Output: true
// Input: arr[] = [-10, 20, 9, -40], target = 30
// Output: false
public class BruteApproach1 {

	private static boolean isProduct(int[] arr, long target) {
		// We will iterate through array by using 2 loops.
		// Check if arr[i] * arr[j] == target if matches then return true else false

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] * arr[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		long target = 35;
		System.out.println(isProduct(arr, target));
	}

}

// Time Complexity : O(N*N)
// Space Complexity : O(1)