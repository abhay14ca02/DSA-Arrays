package com.arrays.hard.KthLargestElement;

//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?
//Input: nums = [3,2,1,5,6,4], k = 2, Output: 5
//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4, Output: 4

public class OptimalApproach {
	public static int findKthLargest(int[] nums, int k) {
		int left = 0, right = nums.length - 1;
		int target = k - 1; // kth largest in descending order

		while (left <= right) {
			int pivotIndex = partition(nums, left, right);
			if (pivotIndex == target)
				return nums[pivotIndex];
			else if (pivotIndex > target)
				right = pivotIndex - 1;
			else
				left = pivotIndex + 1;
		}

		return -1;
	}

	private static int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		int i = left + 1;
		int j = right;

		while (i <= j) {
			if (nums[i] < pivot && nums[j] > pivot) {
				swap(nums, i, j);
				i++;
				j--;
			}
			if (nums[i] >= pivot)
				i++;
			if (nums[j] <= pivot)
				j--;
		}

		swap(nums, left, j); // place pivot in correct position
		return j;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		int res = findKthLargest(nums, k);
		System.out.println(res);

	}
}
