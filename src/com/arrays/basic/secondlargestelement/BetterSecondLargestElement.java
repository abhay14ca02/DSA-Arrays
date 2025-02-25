package com.arrays.basic.secondlargestelement;

//Given an array, find the second smallest and second largest element in the array.
//Input : {1,2,4,7,7,5}
//Output Second Smallest : 2 and Second Largest : 5
public class BetterSecondLargestElement {

	private static int findSecondLargestElement(int[] arr) {

		int n = arr.length;
		int firstLargest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {

			if (arr[i] > firstLargest) {
				firstLargest = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {

			if (arr[i] > secondLargest && arr[i] < firstLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	private static int findSecondSmallestElement(int[] arr) {
		int n = arr.length;
		int firstSmallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {

			if (arr[i] < firstSmallest) {
				firstSmallest = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {

			if (arr[i] < secondSmallest && arr[i] > firstSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 7, 5, 6, 7, 9, 8, 9 };
		int secondLargest = findSecondLargestElement(arr);
		int secondSmallest = findSecondSmallestElement(arr);
		System.out.println("Second Largest Element is: " + secondLargest);
		System.out.println("Second Smallest Element is: " + secondSmallest);
	}
}
// Time Complexity : O(N) + O(N) --> O(N + N) -->O(2N)
// Space complexity : O(1)
