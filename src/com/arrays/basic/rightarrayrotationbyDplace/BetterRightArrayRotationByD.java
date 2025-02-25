package com.arrays.basic.rightarrayrotationbyDplace;

//Given an array of integers, rotating array of elements by d elements right
//array[] = {1,2,3,4,5,6,7}, d = 2
//Output: 6 7 1 2 3 4 5

public class BetterRightArrayRotationByD {

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
		
		int temp[] = new int[d];

		// Copy last d elements to the temporary array
		for (int i = 0; i < d; i++) {

			temp[i] = arr[(n - d) + i];
		}

		// Shift the first (n - d) elements to the back of original array

		for (int i = n - d - 1; i >= 0; i--) {

			arr[i + d] = arr[i];
		}
		
		// Copy the d elements from temporary array to the front of original array
		for (int i = 0; i < d; i++) {

			arr[i] = temp[i];
		}

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int d = 2;
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		rightRotateByD(arr, d);
	}
}

//Time Complexity : O(D) + O(N-D) + O(D)  --> O(N+D)
//Space Complexity : O(D)
