package com.arrays.basic.largestelement;

import java.util.Arrays;
//Given an array, we have to find the largest element in the array.
// Input arr[] = {2,5,1,3,0};
// Output : 5
public class BruteLargestElement {

	private static int findLargestElement(int[] arr) {

		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 7, 5, 7 };
		int largest = findLargestElement(arr);
		System.out.println("Largest Element is: " + largest);
	}
}

// Time Complexity : O(N*NlogN)
// Space Complexity : O(1)