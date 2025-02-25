package com.arrays.medium.MaximumSubarraySumWithLengthDivisiblebyK;

import java.util.Arrays;

public class OptimalSolution {
	private static long maxSubarraySum(int[] nums, int k) {
		long ans = Long.MIN_VALUE;
		long prefix = 0;
		// minPrefix[i % k] := the minimum prefix sum of the first i numbers
		long[] minPrefix = new long[k];
		Arrays.fill(minPrefix, Long.MAX_VALUE / 2);
		minPrefix[k - 1] = 0;

		for (int i = 0; i < nums.length; ++i) {
			prefix += nums[i];
			ans = Math.max(ans, prefix - minPrefix[i % k]);
			minPrefix[i % k] = Math.min(minPrefix[i % k], prefix);
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { -1, -2, -3, -4, -5 };
		int k = 4;
		long result = maxSubarraySum(nums, k);
		System.out.println(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(K)