package com.arrays.basic.secondlargestelement;

import java.util.Arrays;
//Given an array, find the second smallest and second largest element in the array.
// Input : {1,2,4,7,7,5}
// Output Second Smallest : 2 and Second Largest : 5
public class BruteSecondLargestElement {

	private static int findSecondLargestElement(int[] arr) {
		int n = arr.length;
		int secondLargest = 0;
		Arrays.sort(arr);
		int firstLarget = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != firstLarget) {
				secondLargest = arr[i];
				break;
			}
		}
		return secondLargest;
	}

	private static int findSecondSmallestElement(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int firstSmallest = arr[0];
		int secondSmallest = 0;
		for (int i = 1; i < n; i++) {

			if (arr[i] != firstSmallest) {
				secondSmallest = arr[i];
				break;
			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 4, 7, 5, 7 };
		int secondLargest = findSecondLargestElement(arr);
		int secondSmallest = findSecondSmallestElement(arr);
		System.out.println("Second Largest Element is: " + secondLargest);
		System.out.println("Second Smallest Element is: " + secondSmallest);
	}
}

// Time Complexity : O(NlogN) + O(N)
// Space Complexity : O(1)