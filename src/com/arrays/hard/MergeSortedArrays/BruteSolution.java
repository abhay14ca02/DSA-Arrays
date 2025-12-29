package com.arrays.hard.MergeSortedArrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
//and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3, Output: [1,2,2,3,5,6]
public class BruteSolution {
	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] result = new int[m + n];

		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				result[k++] = nums1[i++];
			} else {
				result[k++] = nums2[j++];
			}
		}
		while (i < m) {
			result[k++] = nums1[i++];

		}
		while (j < n) {
			result[k++] = nums2[j++];

		}

		for (k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1, m, nums2, n);
	}
}
//Time Complexity : O(n+m)
//Space Complexity : O(n+m)