package com.arrays.basic.reverseanarray;

public class OptimalReverseAnArray {

	private static void reverseAnArray(int[] arr) {

		int n = arr.length;

		int start = 0;
		int end = n - 1;;
		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 4, 1, 10, 13 };
		reverseAnArray(arr);
	}

}
// Time Complexity : O(N)
// Space Complexity : O(1)