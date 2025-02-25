package com.arrays.easy.movenegativenumstoend;

//You are given an array of integers, your task is to move all the zeros in the array to the end of the array 
//and move non-negative integers to the front by maintaining their order
//input arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 }
//Output : 1 3 2 11 6 -1 -7 -5  
public class OptimalMoveNegativeNumsToEnd {

	private static void moveNegativeNumbersToEnd(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
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

// Time Complexity : O(N)
// Space Complexity :O(1)
