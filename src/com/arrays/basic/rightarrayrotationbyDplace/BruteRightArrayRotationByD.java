package com.arrays.basic.rightarrayrotationbyDplace;

//Given an array of integers, rotating array of elements by d elements right
// array[] = {1,2,3,4,5,6,7}, d = 2
// Output: 6 7 1 2 3 4 5
public class BruteRightArrayRotationByD {

	private static void rightRotateByD(int[] arr, int d) {

		int n = arr.length;

		if (n == 0) {
			return;
		}

		d = d % n;

		if (d > n) {
			return;
		}
		// Create temp array
		int temp[] = new int[n];

		// Copy (n-d) elements to back of the temp array
		for (int i = d; i < n; i++) {

			temp[i] = arr[i - d];
		}
		// Copy d elements to front of the temp array
		for (int i = 0; i < d; i++) {

			temp[i] = arr[n - d + i];
		}
		// Copy temp array to original array
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}

		// Print rotated array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int d = 2;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		rightRotateByD(arr, d);
	}
}
// Time Complexity : O(N-D) + O(D) + O(N) ----> O(2N)
// Space Complexity : O(N)