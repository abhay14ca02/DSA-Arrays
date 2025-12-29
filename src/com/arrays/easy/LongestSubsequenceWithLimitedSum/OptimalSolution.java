package com.arrays.easy.LongestSubsequenceWithLimitedSum;

import java.util.Arrays;

//You are given an integer array nums of length n, and an integer array queries of length m.
//Return an array answer of length m where answer[i] is the maximum size of a subsequence that 
//you can take from nums such that the sum of its elements is less than or equal to queries[i].
//A subsequence is an array that can be derived from another array by deleting some or no elements 
//without changing the order of the remaining elements.
//Input: nums = [4,5,2,1], queries = [3,10,21], Output: [2,3,4]

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