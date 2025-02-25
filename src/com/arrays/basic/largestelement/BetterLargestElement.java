package com.arrays.basic.largestelement;

public class BetterLargestElement {

	private static int findLargestElement(int[] arr) {

		int maxElement = Integer.MIN_VALUE;
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}
		}

		return maxElement;

	}

	private static int findSmallestElement(int[] arr) {

		int minElement = Integer.MAX_VALUE;
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			if (arr[i] < minElement) {
				minElement = arr[i];
			}
		}

		return minElement;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 7, 5, 7 };
		int largest = findLargestElement(arr);
		int smallest = findSmallestElement(arr);
		System.out.println("Largest Element is: " + largest);
		
		System.out.println("Smallest Element is: " + smallest);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(1)

