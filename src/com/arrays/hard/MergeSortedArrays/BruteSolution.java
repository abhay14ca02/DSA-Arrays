package com.arrays.hard.MergeSortedArrays;

public class BruteSolution {
	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] result = new int[m + n];

		int i = 0;
		int j = 0;
		int idx = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				result[idx++] = nums1[i];
				i++;
			} else {
				result[idx++] = nums2[j];
				j++;
			}
		}
		while (i < m) {
			result[idx++] = nums1[i];
			i++;

		}
		while (j < n) {
			result[idx++] = nums2[j];
			j++;

		}

		for (int k = 0; k < result.length; k++) {
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