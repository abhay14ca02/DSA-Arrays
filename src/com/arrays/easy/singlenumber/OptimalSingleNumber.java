package com.arrays.easy.singlenumber;

//Single Number
//Given an array arr[] of positive integers where every element appears even times except for one.
//Find that number occurring an odd number of times
// Input : arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4 }
// Output : 4
public class OptimalSingleNumber {

	private static int findSingleNumber(int[] arr) {

		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		return xor;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 4 };
		System.out.println(findSingleNumber(arr));
	}

}

// Time Complexity : O(N)
// Space Complexity : O(1)