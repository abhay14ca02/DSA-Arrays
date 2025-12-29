package com.arrays.hard.CountSubarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//When we've only positives & zeros in nums
//Input: nums = [1,1,1], k = 2, Output: 2
//Input: nums = [1,2,3], k = 3, Output: 2

//When we've both positives & negatives in nums
//Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5, Output: 2

public class OptimalApproach {
	// Case 1: An Array contains positives & negatives
	// Time complexity : O(N)
	// Space Complexity : O(N)
	private static int countSubarraySumKWithNeg(int[] nums, int k) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// Base case: prefix sum 0 has occurred once
		map.put(0, 1);
		int prefixSum = 0, count = 0;
		for (int i = 0; i < n; i++) {
			// Add current element to prefix sum
			prefixSum += nums[i];
			// If (prefixSum - k) was seen before
			int tar = prefixSum - k;
			// If this prefix sum was seen before, add its count to the result
			if (map.containsKey(tar)) {
				count += map.get(tar);
			}
			map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
		}
		return count;
	}

	// Case 2: An Array contains only positives & zeros
	// We'll use here 2 pointers technique (Sliding Window)
	// Time complexity : O(N)
	// Space Complexity : O(1)
	private static int countSubarraySumK(int[] nums, int k) {
		int n = nums.length;
		int start = 0;// Left Pointer
		int sum = 0, count = 0;
		for (int end = 0; end < n; end++) {
			// Expand window to the right
			sum += nums[end];

			// Shrink window from the left, if sum exceeds k
			while (sum > k && start <= end) {
				sum -= nums[start];
				start++;
			}
			// Check for valid subarray & store the count
			if (sum == k) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int k = 3;
		int res = countSubarraySumK(nums, k);
		System.out.println(res);

		int[] nums1 = { -5, 8, -14, 2, 4, 12 };
		int k1 = -5;
		System.out.println("For Positives & Negatives");
		int res1 = countSubarraySumKWithNeg(nums1, k1);
		System.out.println(res1);
	}
}
