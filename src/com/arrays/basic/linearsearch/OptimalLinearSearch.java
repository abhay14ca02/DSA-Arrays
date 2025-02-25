package com.arrays.basic.linearsearch;

//Given an array, and an element num the task is to find if num is present in the given array or not. 
// If present print the index of the element or print -1.
// Input: arr[]= 1 2 3 4 5, num = 3 & Output: 2
public class OptimalLinearSearch {

	private static int findAnElement(int[] arr, int num) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 4, 1, 10 };
		int num = 4;
		int index = findAnElement(arr, num);
		System.out.println("Number at index : "+index);

	}

}

// Time Complexity: O(N)
// Space Complexity: O(1)