package com.arrays.hard.LongestSubarrayWithSumK;

import java.util.HashMap;
import java.util.Map;

//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. 
//If no such sub-array exists, return 0.
//When we've only positives & zeros in nums
//Input: nums = [10, 5, 2, 7, 1, 9], k = 15 , Output: 4 

//When we've both positives & negatives in nums
//Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5, Output: 5
public class OptimalApproach {

	// We're using HashMap technique here, and this solution will work for all types
	// of
	// input array
	// Case 1: An Array contains positives & negatives
	// Case 2: An Array contains only positives & zeros
	// Time complexity : O(N)
	// Space Complexity : O(N)
	private static int longestSubarraySumK(int[] nums, int k) {

		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1); // Prefix sum 0 at index -1
		int prefixSum = 0, maxLen = 0;
		// Prefix sum
		for (int i = 0; i < n; i++) {
			prefixSum += nums[i];

			// Case 1: If full subarray from 0 to i has prefixSum = k
			if (prefixSum == k) {
				maxLen = i + 1;
			}
			// Case 2: If (prefixSum - k) was seen before
			int tar = prefixSum - k;
			if (map.containsKey(tar)) {
				int len = i - map.get(tar);// Length of current valid subarray
				maxLen = Math.max(maxLen, len);
			}
			// map.putIfAbsent(prefixSum, i);
			if (!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
		}
		return maxLen;
	}

	// Case 2: An Array contains only positives & zeros
	// This solution will work for only positives & zeros
	// We'll use here 2 pointers technique (Sliding Window)
	// Time complexity : O(N)
	// Space Complexity : O(1)
	private static int longestSubarraySumPositiveK(int[] nums, int k) {
		int n = nums.length;
		int start = 0; // Left Pointer
		int sum = 0, maxLength = 0;

		for (int end = 0; end < n; end++) {// Right pointer

			// Expand window to the right
			sum += nums[end];

			// Shrink window from the left, if sum exceeds k
			while (sum > k && start <= end) {
				sum -= nums[start];
				start++;
			}
			// Check for valid subarray & store the maximum length
			if (sum == k) {
				maxLength = Math.max(maxLength, end - start + 1);
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = { -5, 8, -14, 2, 4, 12 };
		int k = -5;
		System.out.println("For Positives & Negatives");
		int res = longestSubarraySumK(nums, k);
		System.out.println(res);
		int[] nums1 = { 10, 5, 2, 7, 1, 9 };
		int k1 = 15;
		System.out.println("For Positives & Zeros only");
		int res1 = longestSubarraySumPositiveK(nums1, k1);
		System.out.println(res1);
	}
}
