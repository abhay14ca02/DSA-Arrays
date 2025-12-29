package com.arrays.hard.MergeSortedArrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
//and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3, Output: [1,2,2,3,5,6]

public class OptimalSolution {

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1; // Last element of nums1’s valid portion
		int j = n - 1; // Last element of nums2
		int k = m + n - 1; // Last index of merged array in nums1
		// Merge from the back
		while (i >= 0 && j >= 0) {
			if (nums1[i] >= nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
		// If nums2 still has elements left, copy them
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
	
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1, m, nums2, n);
		// Print merged array
		for (int num : nums1) {
			System.out.print(num + " ");
		}
	}
}

//Time: O(m + n) → every element is visited once.
//Space: O(1) → in-place, no extra arrays used.
