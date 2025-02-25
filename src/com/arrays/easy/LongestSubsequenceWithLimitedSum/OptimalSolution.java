package com.arrays.easy.LongestSubsequenceWithLimitedSum;

import java.util.Arrays;

public class OptimalSolution {

	private static int[] answerQueries(int[] nums, int[] queries) {

		int n = nums.length;
		int m = queries.length;
		Arrays.sort(nums);
		int[] result = new int[m];
		for (int i = 1; i < n; i++) {
			nums[i] += nums[i - 1];
		}
		for (int i = 0; i < m; i++) {
			int idx = binarySearch(nums, n, queries[i]);
			result[i] = idx;
		}
		return result;
	}

	private static int binarySearch(int[] nums, int n, int target) {

		int start = 0;
		int end = n - 1;
		int idx = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] <= target) {
				idx = mid;
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			}
		}
		return idx + 1;
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
//Time Complexity : O((m+n)*log(n))
//Space Complexity : O(m)