package com.arrays.basic.isarraysorted;

// Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
// If the array is sorted then return True, Else return False
// Input : {1,2,3,4,5}
// Output : true
public class BruteIsArraySorted {

	private static boolean isArraySorted(int[] arr) {

		int n = arr.length;

		if (n == 1) {
			return true;
		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (arr[i] > arr[j]) {

					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 5, 6, 6, 7, 10 };
		boolean isSorted = isArraySorted(arr);
		System.out.println("Array is sorted---> " + isSorted);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)