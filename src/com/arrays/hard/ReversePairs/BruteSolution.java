package com.arrays.hard.ReversePairs;

public class BruteSolution {
	private static int reversePairs(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > 2 * nums[j]) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 4, 3, 5, 1 };
		int result = reversePairs(nums);
		System.out.println(result);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)