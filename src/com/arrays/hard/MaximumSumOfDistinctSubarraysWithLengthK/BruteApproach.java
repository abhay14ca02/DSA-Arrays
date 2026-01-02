package com.arrays.hard.MaximumSumOfDistinctSubarraysWithLengthK;

import java.util.HashSet;
import java.util.Set;

//You are given an integer array nums and an integer k. Find the maximum subarray sum of 
//all the subarrays of nums that meet the following conditions:
//The length of the subarray is k, and
//All the elements of the subarray are distinct.
//Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Input: nums = [1,5,4,2,9,9,9], k = 3 ,Output: 15
//Input: nums = [4,4,4], k = 3, Output: 0

public class BruteApproach {
	public static long maximumSubarraySum(int[] nums, int k) {
		int n = nums.length;
		long maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<Integer>();
			long sum = 0;
			for (int j = i; j < n; j++) {
				if (set.contains(nums[j])) {
					break;
				}
				set.add(nums[j]);
				sum += nums[j];
				if (j - i + 1 == k) {
					maxSum = Math.max(maxSum, sum);
					break;
				}
			}
		}
		return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
	}

	public static void main(String[] args) {
		int[] nums = { 9, 9, 9, 1, 2, 3 };
		int k = 3;
		long res = maximumSubarraySum(nums, k);
		System.out.println(res);
	}
}

//Time Complexity : O(N*N)
//Space Complexity : O(K)