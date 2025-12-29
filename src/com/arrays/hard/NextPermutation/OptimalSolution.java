package com.arrays.hard.NextPermutation;

//A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
//Given an array of integers nums, find the next permutation of nums.
//The replacement must be in place and use only constant extra memory.

public class OptimalSolution {
	private static void nextPermutation(int[] nums) {
		int n = nums.length;

		// Find the pivot
		int pivot = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				pivot = i;
				break;
			}
		}

		if (pivot >= 0) {
			// 2. Find element just larger than pivot
			for (int j = n - 1; j > pivot; j--) {
				if (nums[j] > nums[pivot]) {
					// Swap pivot with next larger
					int temp = nums[j];
					nums[j] = nums[pivot];
					nums[pivot] = temp;
					break;
				}
			}
		}

		// 3rd Step : Reverse suffix (peivot + 1 to n-1)
		int start = pivot + 1;
		int end = n - 1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1 };
		nextPermutation(nums);
		System.out.print("{");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.print("}");
	}
}
//Time Complexity : O(N)
//Space Complexity: O(1)
