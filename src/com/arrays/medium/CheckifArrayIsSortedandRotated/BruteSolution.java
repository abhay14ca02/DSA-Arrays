package com.arrays.medium.CheckifArrayIsSortedandRotated;

public class BruteSolution {
	private static boolean checkSortedRotated(int[] nums) {
		int n = nums.length;
		int[] sorted = new int[n];
		for (int r = 0; r < n; r++) {
			int idx = 0;
			for (int i = r; i < n; i++) {
				sorted[idx] = nums[i];
				idx++;
			}
			for (int i = 0; i < r; i++) {
				sorted[idx] = nums[i];
				idx++;
			}
			// check if sorted;
			boolean isSorted = true;
			for (int i = 0; i < n - 1; i++) {
				if (sorted[i] > sorted[i + 1]) {
					isSorted = false;
					break;
				}
			}
			if (isSorted) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		boolean check = checkSortedRotated(nums);
		System.out.println(check);
	}
}
//Time Complexity : O(N)*O(N)+O(N)+O(N)--> O(N)*O(3N) ----> O(N^2)
//Space Complexity : O(N)