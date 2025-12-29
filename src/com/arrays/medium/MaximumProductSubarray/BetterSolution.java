package com.arrays.medium.MaximumProductSubarray;

//Given an integer array nums, find a subarray that has the largest product, and return the product.
//Input: nums = [2,3,-2,4], Output: 6

public class BetterSolution {
	private static int maxProduct(int[] nums) {
		int maxProd = Integer.MIN_VALUE;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int prod = 1;
			for (int j = i; j < n; j++) {
				prod *= nums[j];
				maxProd = Math.max(maxProd, prod);
			}
		}
		return maxProd;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		int maximumProduct = maxProduct(nums);
		System.out.println(maximumProduct);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)