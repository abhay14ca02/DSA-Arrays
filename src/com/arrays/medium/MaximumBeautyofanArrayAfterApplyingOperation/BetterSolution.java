package com.arrays.medium.MaximumBeautyofanArrayAfterApplyingOperation;

import java.util.Arrays;

//Maximum Beauty of an Array After Applying Operation

public class BetterSolution {
	private static int maximumBeauty(int[] nums, int k) {
		Arrays.sort(nums);// O(NLogN)
		int maxBeauty = 0;

		for (int i = 0; i < nums.length; i++) {// O(N)
			int x = nums[i];
			int y = x + 2 * k;
			// Find the farthest y=x+2*k
			int upperBound = binarySearch(nums, y);// LogN
			maxBeauty = Math.max(maxBeauty, upperBound - i + 1);
		}

		return maxBeauty;
	}

	private static int binarySearch(int[] nums, int target) {
		int low = 0, high = nums.length;
		int result = 0;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] <= target) {
				result = mid;
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 6, 1, 2 };
		int k = 2;
		int maxBeauty = maximumBeauty(nums, k);
		System.out.println(maxBeauty);
	}
}
//Time Complexity : O(NLogN) + O(NLogN) == O(2NlogN)
//Space Complexity : O(1)