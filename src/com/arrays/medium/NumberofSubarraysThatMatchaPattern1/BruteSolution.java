package com.arrays.medium.NumberofSubarraysThatMatchaPattern1;

public class BruteSolution {
	private static int countMatchingSubarrays(int[] nums, int[] pattern) {
		int n = nums.length;
		int m = pattern.length;
		int count = 0;
		for (int i = 0; i < n - m; i++) {
			int k = 0;
			while (k < m) {
				if (pattern[k] == 1 && nums[i + k + 1] > nums[i + k]) {
					k++;
				} else if (pattern[k] == 0 && nums[i + k + 1] == nums[i + k]) {
					k++;
				} else if (pattern[k] == -1 && nums[i + k + 1] < nums[i + k]) {
					k++;
				} else {
					break;
				}
			}
			if (k == m) { // Found complete pattern
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int[] pattern = { 1, 1 };
		int result = countMatchingSubarrays(nums, pattern);
		System.out.println(result);
	}
}
//Time Complexity : O(N*M)
//Space Complexity : O(1)