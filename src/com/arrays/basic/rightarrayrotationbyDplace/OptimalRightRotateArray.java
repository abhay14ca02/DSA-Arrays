package com.arrays.basic.rightarrayrotationbyDplace;

//Given an array of integers, rotating array of elements by d elements right
//array[] = {1,2,3,4,5,6,7}, d = 2
//Output: 6 7 1 2 3 4 5
public class OptimalRightRotateArray {

	private static void rightRotateByD(int[] arr, int d, int n) {

		if (n == 0) {
			return;
		}

		d = d % n;
		
		if (d > n) {
			return;
		}

		int start = 0;
		int end = n;

		// Reverse the first n-d elements of the array
		reverseArray(arr, start, end - 1 - d);

		// Reverse the last d elements of the array.
		reverseArray(arr, end - d, end - 1);

		// Reverse the whole array
		reverseArray(arr, start, end - 1);
	}

	private static void reverseArray(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}
	
	public static void main(String[] args) {
		int d = 3;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		
		rightRotateByD(arr, d, n);

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}
	}
}
// Time Complexity : O(N) + O(D) + (N-D) --- O(2N)
// Space Complexity : O(1)