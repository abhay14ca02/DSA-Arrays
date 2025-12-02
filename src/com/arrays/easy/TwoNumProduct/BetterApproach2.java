package com.arrays.easy.TwoNumProduct;

import java.util.Arrays;

//Given an array arr[] of n distinct integers and a target value, the task is to check whether 
//there is a pair of elements in the array whose product is equal to target.
//Input: arr[] = [1, 5, 7, -1, 5], target = 35
//Output: true
//Input: arr[] = [-10, 20, 9, -40], target = 30
//Output: false

public class BetterApproach2 {

	private static boolean isProduct(int[] arr, long target) {
		// We will sort the array in ascending order and maintain 2 pointers left = 0 &
		// right = arr.length - 1.
		// We will iterate through array by using left and right pointers.
		// Check if arr[left] * arr[right] == target if matches then return true else we
		// will adjust left & right pointer

		Arrays.sort(arr); // O(NLogN)
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left < right) { // O(N)
			long product = (long) arr[left] * arr[right];
			if (product == target) {
				return true;
			} else if (product < target) {
				left++;
			} else {
				right--;
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
// Time Complexity : O(NLogN) + O(N)
// Space Complexity : O(1)
