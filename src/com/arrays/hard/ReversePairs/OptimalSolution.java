package com.arrays.hard.ReversePairs;

//Given an integer array nums, return the number of reverse pairs in the array.
//A reverse pair is a pair (i, j) where:
//0 <= i < j < nums.length and
//nums[i] > 2 * nums[j].
//Input: nums = [1,3,2,3,1], Output: 2
//Input: nums = [2,4,3,5,1], Output: 3

public class OptimalSolution {
	public static int reversePairs(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);
	}

	public static int mergeSort(int[] nums, int left, int right) {
		int count = 0;
		if (left >= right) {
			return count;
		}
		int mid = left + (right - left) / 2;
		count += mergeSort(nums, left, mid); // left half
		count += mergeSort(nums, mid + 1, right); // right half
		count += countPairs(nums, left, mid, right); // Modification
		merge(nums, left, mid, right); // merging sorted halves
		return count;
	}

	public static void merge(int[] nums, int left, int mid, int right) {
		int[] temp = new int[right - left + 1]; // temporary array

		int i = left; // starting index of left half of arr

		int j = mid + 1; // starting index of right half of arr

		int k = 0;

		// storing elements in the temporary array in a sorted manner

		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}
		// if elements on the left half are still left
		while (i <= mid) {
			temp[k++] = nums[i++];
		}
		// if elements on the right half are still left
		while (j <= right) {
			temp[k++] = nums[j++];
		}
		// Copy back to original array
		for (int l = left; l <= right; l++) {
			nums[l] = temp[l - left];
		}
	}

	public static int countPairs(int[] nums, int left, int mid, int right) {
		int j = mid + 1;
		int count = 0;
		for (int i = left; i <= mid; i++) {// First half sorted array (start from left to mid)
			while (j <= right && (long) nums[i] > 2L * nums[j]) {// Second half sorted array (start from mid+1 to right)
				j++;
			}
			count += (j - (mid + 1));
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 4, 3, 5, 1 };
		int result = reversePairs(nums);
		System.out.println(result);
	}
}
// Time Complexity : O(NLogN) + O(2N)
// Space Complexity : O(N)
