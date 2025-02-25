package com.arrays.easy.noofoccurrence;

public class NumberOfOccurrence {

	private static int findNumberOfOccurrence(int[] arr, int n, int num) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
		int n = arr.length;
		int num = 2;
		int numberOfOccurrence = findNumberOfOccurrence(arr, n, num);
		System.out.println(numberOfOccurrence);
	}

}

// Time Complexity : O(N)
// Space Complexity : O(1)
