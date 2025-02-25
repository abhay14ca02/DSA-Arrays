package com.arrays.easy.LongestSubsequenceWithLimitedSum;

import java.util.Arrays;

public class BruteSolution {
	private static int[] answerQueries(int[] nums, int[] queries) {

		int n = nums.length;
		int m = queries.length;
		Arrays.sort(nums);
		int[] result = new int[m];
		int idx = 0;
		for (int query : queries) {
			int sum = 0;
			for (int j = 0; j < n; j++) {

				sum += nums[j];
				if (sum > query) {
					result[idx++] = j;
					break;
				}
				if (j == n - 1) {
					result[idx++] = n;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 2, 1 };
		int[] queries = { 3, 10, 21 };
		int[] result = answerQueries(nums, queries);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(NlogN)+O(m*n)
//Space Complexity : O(m)