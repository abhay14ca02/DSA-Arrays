package com.arrays.medium.CheckifArrayIsSortedandRotated;

import java.util.Arrays;

public class BetterSolution {
	private static boolean checkSortedRotated(int[] nums) {
		int n = nums.length;
		int[] sorted = nums.clone();
		Arrays.sort(sorted);// O(NLogN)
		for (int r = 0; r < n; r++) {
			boolean isSorted = true;
			for (int i = 0; i < n; i++) {
				if (sorted[i] != nums[(i + r) % n]) {
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
//Time Complexity : O(N^2)
//Space Complexity : O(N)