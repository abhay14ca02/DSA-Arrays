package com.arrays.easy.moveallzerostoend;

//You are given an array of integers, your task is to move all the zeros in the array to the end of the array 
//and move non-negative integers to the front by maintaining their order
//input arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 }
//Output : 1 2 3 4 1 0 0 0 
public class BruteMoveAllZerosToEnd {

	private static void moveZerosToEnd(int[] arr, int n) {

		int[] temp = new int[n];

		int nonZeroSize = 0; // Non zero element

		for (int i = 0; i < n; i++) {	
			if (arr[i] != 0) {
				temp[nonZeroSize] = arr[i];
				nonZeroSize++;
			}
		}
		for (int i = 0; i < nonZeroSize; i++) {

			arr[i] = temp[i];
		}

		for (int i = nonZeroSize; i < n; i++) {
			arr[i] = 0;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1, -100, 0 };
		int n = arr.length;
		moveZerosToEnd(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

// Time Complexity : O(N) + O(X) + O(N-X) ----- O(2N)
// Space Complexity : O(X) 
// In Worst case it will O(N). Suppose array contains all non-zeros elements
