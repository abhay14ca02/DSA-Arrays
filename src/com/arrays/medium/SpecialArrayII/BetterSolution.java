package com.arrays.medium.SpecialArrayII;
//Approach-2 (Using 2 pointers)
public class BetterSolution {

	private static boolean[] isArraySpecial(int[] nums, int[][] queries) {
		int n = nums.length;
		int m = queries.length;
		int[] validRightMostIdx = new int[n];
		// validRightMostIdx[i] = j; the rightmost index starting from i which is a
		// special subarray [i..j]
		int i = 0;
		int j = 0;
		while (i < n) {
			if (j < i) {
				j = i;
			}
			while (j + 1 < n && nums[j] % 2 != nums[j + 1] % 2) {
				j++;
			}
			validRightMostIdx[i] = j;
			i++;
		}
		boolean[] result = new boolean[m];
		for (int k = 0; k < m; k++) {
			int start = queries[k][0];
			int end = queries[k][1];

			if (end <= validRightMostIdx[start]) {
				result[k] = true;
			} else {
				result[k] = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 3, 1, 6 };
		int[][] queries = { { 0, 2 }, { 2, 3 } };
		boolean[] isSpecial = isArraySpecial(nums, queries);
		for (int i = 0; i < isSpecial.length; i++) {
			System.out.print(isSpecial[i] + " ");
		}
	}
}
//Time Complexity : O(n + m)
//Space Complexity : O(n)
