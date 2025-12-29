package com.arrays.hard.CountSubarraysWithGivenXOR;

//Given an array of integers arr[] and a number k, the task is to count 
//the number of subarrays having XOR of their elements as k.
//Input: arr = [4, 2, 2, 6, 4], k = 6, Output: 4
//Input: arr = [5, 6, 7, 8, 9], k = 5, Output: 2

public class BruteSolution {

	public static int countSubarrayXOR(int[] arr, int k) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int xor = 0;
			for (int j = i; j < n; j++) {
				xor = xor ^ arr[j];
				if (xor == k) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;
		int res = countSubarrayXOR(arr, k);
		System.out.println(res);
	}
}

// Time Complexity : O(N^2)
// Space Complexity : O(1)