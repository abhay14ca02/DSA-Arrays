package com.arrays.easy.moveallzerostoend;

//You are given an array of integers, your task is to move all the zeros in the array to the end of the array 
//and move non-negative integers to the front by maintaining their order
//input arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 }
//Output : 1 2 3 4 1 0 0 0 
public class BetterMoveAllZeroToEnd {

	private static void moveZerosToEnd(int[] arr, int n) {

		int nonZero = 0; // Non zero element

		for (int i = 0; i < n; i++) {

			if (arr[i] != 0) {
				arr[nonZero] = arr[i];
				nonZero++;
			}
		}
		for (int j = nonZero; j < n; j++) {
			arr[j] = 0;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, -100, 3, 0, 4, 0, 1 };
		int n = arr.length;
		moveZerosToEnd(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
