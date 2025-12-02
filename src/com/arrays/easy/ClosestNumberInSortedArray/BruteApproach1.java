package com.arrays.easy.ClosestNumberInSortedArray;

// Given an array arr[] of sorted integers of size n. We need to find the closest value to the given number k. 
// Array may contain duplicate values and negative numbers. If the smallest difference with k is the same for 
// two values in the array return the greater value.
// Input : arr[] = {1, 2, 4, 5, 6, 6, 8, 9}, target = 11, Output : 9
//Input :arr[] = {2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32}, target = 17, Output : 19
// Explanation : 15 and 19 both are closest to 17 in given array ,so return max(15, 19) which is 19
public class BruteApproach1 {

	private static int findClosest(int[] arr, int target) {

		if (arr == null || arr.length == 0) {
			return 0;
		}
		int n = arr.length;

		if (arr.length == 1)
			return arr[0];

		if (target <= arr[0]) {
			return arr[0];
		}

		if (target >= arr[n - 1]) {
			return arr[n - 1];
		}

		int closest = arr[0];
		int minDiff = Math.abs(arr[0] - target);
		for (int i = 1; i < n; i++) {

			int diff = Math.abs(arr[i] - target);

			if (diff < minDiff) {
				minDiff = diff;
				closest = arr[i];
			}
			// Tie-breaking rule: choose greater value
			else if (diff == minDiff && arr[i] > closest) {
				closest = arr[i];
			}
		}
		return closest;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32 };
		int target = 17;
		int res = findClosest(arr, target);
		System.out.println(res);
	}
}
// Time Complexity : O(N)
// Space Complexity : O(1)