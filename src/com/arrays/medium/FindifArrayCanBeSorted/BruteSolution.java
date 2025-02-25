package com.arrays.medium.FindifArrayCanBeSorted;

//Input: nums = [8,4,2,30,15], Output: true
public class BruteSolution {

	private static boolean canSortArray(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {// in every pass, the max element bubbles up to the rightmost index
				if (nums[j] <= nums[j + 1]) {
					// no swap required
					continue;
				} else {
					// swap is required
					if (Integer.bitCount(nums[j]) == Integer.bitCount(nums[j + 1])) {
						// swapping nums[j] and nums[j + 1]
						int temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
						swapped = true;
					} else {
						// not able to swap, hence can't sort it
						return false;
					}
				}
			}
			if (!swapped) { // no swapping was done in the pass, hence array was already sorted
				break; // no more passes are required
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 8, 4, 2, 30, 15 };
		boolean res = canSortArray(nums);
		System.out.println(res);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)