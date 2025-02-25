package com.arrays.basic.leftarrayrotationbyDplace;

//Given an array of integers, rotating array of elements by d elements left
//array[] = {3,7,8,9,10,11}, d = 3
//Output: 9 10 11 3 7 8

public class OptimalLeftArrayRotationByD {

	private static void leftRotateByD(int[] arr, int n, int d) {

		int start = 0;
		int end = n - 1;
       
		//Reverse the first d elements of the array
		reverseArray(arr, start, d - 1);
		//Reverse the last n-d elements of the array
		reverseArray(arr, d, end);
		//Reverse the whole array
		reverseArray(arr, start, end);
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
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		d = d % n;
		leftRotateByD(arr, n, d);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

// Time Complexity : O(N) + (N-D) + O(D) ----> O(2N)
// Space Complexity : O(1)