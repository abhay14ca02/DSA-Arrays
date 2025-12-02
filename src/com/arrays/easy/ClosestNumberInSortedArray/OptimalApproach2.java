package com.arrays.easy.ClosestNumberInSortedArray;

//Given an array arr[] of sorted integers of size n. We need to find the closest value to the given number k. 
//Array may contain duplicate values and negative numbers. If the smallest difference with k is the same for 
//two values in the array return the greater value.
//Input : arr[] = {1, 2, 4, 5, 6, 6, 8, 9}, target = 11, Output : 9
//Input :arr[] = {2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32}, target = 17, Output : 19
//Explanation : 15 and 19 both are closest to 17 in given array ,so return max(15, 19) which is 19

public class OptimalApproach2 {

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

		int left = 0;
		int right = n - 1;
		while (left <= right) {

			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return arr[mid]; // exact match
			}
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		// right: largest element < k
		// left: smallest element > k
		int val1 = arr[right];
		int val2 = arr[left];

		int diff1 = Math.abs(val1 - target);
		int diff2 = Math.abs(val2 - target);

		if (diff1 == diff2) {
			return Math.max(val1, val2); // tie → return greater
		}

		return diff1 < diff2 ? val1 : val2;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32 };
		int target = 17;
		int res = findClosest(arr, target);
		System.out.println(res);
	}
}

// Time Complexity : O(LogN)
// Space Complexity : O(1)