package com.arrays.basic.isarraysorted;

//Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
//If the array is sorted then return True, Else return False
//Input : {1,2,3,4,5}
//Output : true
public class OptimalArraySorted {

	private static boolean isArraySorted(int[] arr) {

		int n = arr.length;
		if (n == 1) {
			return true;
		}

		for (int i = 1; i < n; i++) {

			if (arr[i] < arr[i - 1]) {

				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 5, 6, 6, 7 };
		boolean isSorted = isArraySorted(arr);
		System.out.println("Array is sorted---> " + isSorted);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1)
