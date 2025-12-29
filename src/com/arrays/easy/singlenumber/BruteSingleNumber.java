package com.arrays.easy.singlenumber;

//Single Number
//Given an array arr[] of positive integers where every element appears even times except for one. Find that number occurring an odd number of times
//Input : arr[] = { 1, 1, 2, 2, 2 }
//Output : 2
public class BruteSingleNumber {

	private static int getSingleNumber(int[] arr) {

		int n = arr.length;
		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {

				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count % 2 != 0) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2 };
		System.out.println(getSingleNumber(arr));
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(N)