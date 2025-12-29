package com.arrays.hard.CountInversions;

//Given an array of N integers, count the inversion of the array (using merge-sort).
//Inversion of an array: for all i & j < size of array, if i < j 
//then you have to find pair (A[i],A[j]) such that A[j] < A[i].
//Input: array[]:{1,2,3,4,5}, Output = 0
//Input array[] = {5,4,3,2,1}, Output = 10
public class OptimalSolution {

	private static int inversionCount(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);
	}

	private static int mergeSort(int[] nums, int left, int right) {

		int invCount = 0;
		if (left >= right) {
			return invCount;
		}
		int mid = left + (right - left) / 2;
		// Count inversions in left half
		invCount += mergeSort(nums, left, mid);
		// Count inversions in right half
		invCount += mergeSort(nums, mid + 1, right);
		// Count inversions during merge
		invCount += merge(nums, left, mid, right);
		return invCount;
	}

	private static int merge(int[] nums, int left, int mid, int right) {

		int[] temp = new int[right - left + 1];
		int i = left, j = mid + 1, k = 0;
		int count = 0;
		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
				count += (mid - i + 1);
			}
		}
		while (i <= mid)
			temp[k++] = nums[i++];
		while (j <= right)
			temp[k++] = nums[j++];

		// Copy back to original array
		for (int l = left; l <= right; l++) {
			nums[l] = temp[l - left];
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };
		int count = inversionCount(nums);
		System.out.println(count);
	}
}

// Time Complexity : O(NLogN)
// Space Complexity : O(N)