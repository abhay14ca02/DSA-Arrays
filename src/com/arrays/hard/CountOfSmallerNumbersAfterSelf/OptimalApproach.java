package com.arrays.hard.CountOfSmallerNumbersAfterSelf;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums, return an integer array counts where counts[i] 
//is the number of smaller elements to the right of nums[i].
//Input: nums = [5,2,6,1], Output: [2,1,1,0]
public class OptimalApproach {

	private static List<Integer> countSmaller(int[] nums) {
		int n = nums.length;
		int[] count = new int[n];
		int[] indexes = new int[n];

		// indexes stores the original positions of elements.
		for (int i = 0; i < n; i++) {
			indexes[i] = i;
		}

		mergeSort(nums, indexes, count, 0, n - 1);

		List<Integer> result = new ArrayList<>();
		for (int c : count)
			result.add(c);
		return result;
	}

	private static void mergeSort(int[] nums, int[] indexes, int[] count, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(nums, indexes, count, left, mid);
		mergeSort(nums, indexes, count, mid + 1, right);
		merge(nums, indexes, count, left, mid, right);
	}

	private static void merge(int[] nums, int[] indexes, int[] count, int left, int mid, int right) {
		int i = left, j = mid + 1, k = 0;
		int[] temp = new int[right - left + 1];
		int rightCount = 0; // number of elements from right half that are smaller than left elements
		while (i <= mid && j <= right) {
			if (nums[indexes[j]] < nums[indexes[i]]) {
				// Right element is smaller than left element
				temp[k++] = indexes[j++];
				rightCount++;// track smaller elements on the right
			} else {
				// Left element is smaller or equal
				count[indexes[i]] += rightCount;// add number of smaller elements after it
				temp[k++] = indexes[i++];
			}
		}
		while (i <= mid) {
			count[indexes[i]] += rightCount;
			temp[k++] = indexes[i++];
		}
		while (j <= right) {
			temp[k++] = indexes[j++];
		}
		// Copy back to original array
		for (int l = left; l <= right; l++) {
			indexes[l] = temp[l - left];
		}
	}

	public static void main(String[] args) {
		int[] nums = { 5, 2, 6, 1 };
		List<Integer> res = countSmaller(nums);
		System.out.println(res);
	}
}

// Time Complexity: O(NLogN)
// Space Complexity : O(N)