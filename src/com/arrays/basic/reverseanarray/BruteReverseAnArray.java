package com.arrays.basic.reverseanarray;

public class BruteReverseAnArray {

	private static void reverseAnArray(int[] arr) {

		int n = arr.length;

		int temp[] = new int[n];

		for (int i = n - 1, j = 0; i >= 0; i--, j++) {

			temp[j] = arr[i];
		}

		for (int i = 0; i < n; i++) {

			arr[i] = temp[i];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 4, 1, 10 };
		reverseAnArray(arr);
	}
}

// Time Complexity: O(N+N+N)--> O(3N)
// Space Complexity:O(N)