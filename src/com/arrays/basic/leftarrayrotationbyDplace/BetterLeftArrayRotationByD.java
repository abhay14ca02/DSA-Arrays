package com.arrays.basic.leftarrayrotationbyDplace;

//Given an array of integers, rotating array of elements by d elements left
//array[] = {3,7,8,9,10,11}, d = 3
//Output: 9 10 11 3 7 8

public class BetterLeftArrayRotationByD {

	private static void leftRotateByD(int[] arr, int n, int d) {

		int temp[] = new int[d];

		d = d % n;
		
		// Copy D elements to temp array
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		// Copy (n-d) elements to the front of original array

		for (int i = 0; i < n - d; i++) {

			arr[i] = arr[i + d];
		}

		// Copy temp array to the back of original array

		for (int i = 0; i < d; i++) {
			arr[(n - d) + i] = temp[i];
		}

	}

	public static void main(String[] args) {
		int d = 3;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		leftRotateByD(arr, n, d);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

// Time Complexity : O(D) + O(N-D) + O(D) ----- O(N+D)
// Space Complexity : O(D)