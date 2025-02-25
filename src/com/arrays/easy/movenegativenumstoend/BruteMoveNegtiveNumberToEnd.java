package com.arrays.easy.movenegativenumstoend;

//You are given an array of integers, your task is to move all the zeros in the array to the end of the array 
//and move non-negative integers to the front by maintaining their order
//input arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 }
//Output : 1 3 2 11 6 -1 -7 -5
public class BruteMoveNegtiveNumberToEnd {

	private static void moveNegativeNumbersToEnd(int[] arr) {

		int n = arr.length;

		int[] posNum = new int[n];

		int[] negNum = new int[n];

		int nonNegative = 0;
		int negative = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] > 0) {
				posNum[nonNegative] = arr[i];
				nonNegative++;
			} else {
				negNum[negative] = arr[i];
				negative++;

			}
		}
		for (int i = 0; i < nonNegative; i++) {

			arr[i] = posNum[i];
		}

		for (int i = 0; i < negative; i++) {

			arr[nonNegative] = negNum[i];
			nonNegative++;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		moveNegativeNumbersToEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
// Time Complexity : O(N) + O(N)--> O(N)
// Space Complexity : O(N) + O(N)--> O(N)
