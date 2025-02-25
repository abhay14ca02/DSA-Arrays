package com.arrays.medium.SubarraySumsDivisiblebyK;

public class BruteSolution {

	private static int subarraysDivByK(int[] nums, int k) {

		int result = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {// O(N)
			int sum = 0;
			for (int j = i; j < n; j++) {// O(N)
				sum = sum + nums[j];//O(N)--> We calculate sum from i to j
				if (sum % k == 0) {
					result += 1;
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
//Time complexity : O(N^3)
//Space Complexity : O(1)
