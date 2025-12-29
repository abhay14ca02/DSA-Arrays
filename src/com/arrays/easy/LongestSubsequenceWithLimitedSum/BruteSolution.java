package com.arrays.easy.LongestSubsequenceWithLimitedSum;

//You are given an integer array nums of length n, and an integer array queries of length m.
//Return an array answer of length m where answer[i] is the maximum size of a subsequence that 
//you can take from nums such that the sum of its elements is less than or equal to queries[i].
//A subsequence is an array that can be derived from another array by deleting some or no elements 
//without changing the order of the remaining elements.
//Input: nums = [4,5,2,1], queries = [3,10,21], Output: [2,3,4]

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