package com.arrays.medium.SubarraySumsDivisiblebyK;

public class BetterSolution {
	private static int subarraysDivByK(int[] nums, int k) {
		int n = nums.length;
		int result = 0;
		// Cumulative sum in same array
		for (int i = 1; i < n; i++) {// O(N)
			nums[i] += nums[i - 1];
		}
		for (int i = 0; i < n; i++) {// O(N)
			int sum = 0;
			for (int j = i; j < n; j++) {// O(N)
				sum = (i == 0) ? nums[j] : nums[j] - nums[i - 1];
				if (sum % k == 0) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		int result = subarraysDivByK(nums, k);
		System.out.println(result);
	}

}
//Time Complexity : O(N^2)
//Space Complexity : O(1)