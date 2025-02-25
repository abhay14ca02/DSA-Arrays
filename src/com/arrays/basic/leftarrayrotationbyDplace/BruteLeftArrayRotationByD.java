package com.arrays.basic.leftarrayrotationbyDplace;

// Given an array of integers, rotating array of elements by d elements left
// array[] = {3,7,8,9,10,11}, d = 3
// Output: 9 10 11 3 7 8

public class BruteLeftArrayRotationByD {

	private static void leftRotateByD(int[] arr, int d) {

		int n = arr.length;

		int temp[] = new int[n];

		d = d % n;

		// Copy (n-d) elements to the front of temp array

		for (int i = 0; i < n - d; i++) {

			temp[i] = arr[i + d];
		}

		// Copy D elements to the back of temp array

		for (int i = 0; i < d; i++) {
			temp[(n - d) + i] = arr[i];
		}

		// Copy temp array to original array

		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	public static void main(String[] args) {

		int d = 2;
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		leftRotateByD(arr, d);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

// Time Complexity : O(N-D) + O(D) + O(N) -- O(2N)
// Space Complexity : O(N)
