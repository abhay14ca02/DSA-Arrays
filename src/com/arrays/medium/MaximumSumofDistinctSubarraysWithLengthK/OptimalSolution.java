package com.arrays.medium.MaximumSumofDistinctSubarraysWithLengthK;

import java.util.HashSet;

public class OptimalSolution {
	private static long maximumSubarraySum(int[] nums, int k) {
		int i = 0, j = 0;
		long result = 0;
		long currWindowSum = 0;
		HashSet<Integer> set = new HashSet<>();
		while (j < nums.length) {
			// Adjust the window if nums[j] is already in the set
			while (set.contains(nums[j])) {
				currWindowSum -= nums[i];
				set.remove(nums[i]);
				i++;
			}
			currWindowSum += nums[j];
			set.add(nums[j]);
			// Check if the window size is equal to k
			if (j - i + 1 == k) {
				result = Math.max(result, currWindowSum);

				// Shrink the window from the left
				currWindowSum -= nums[i];
				set.remove(nums[i]);
				i++;
			}
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
		int k = 3;
		long result = maximumSubarraySum(nums, k);
		System.out.println(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)