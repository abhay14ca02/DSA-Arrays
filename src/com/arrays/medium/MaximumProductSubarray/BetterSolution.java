package com.arrays.medium.MaximumProductSubarray;

public class BetterSolution {
	private static int maxProduct(int[] nums) {
		int maximumProduct = Integer.MIN_VALUE;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int prod = 1;
			for (int j = i; j < n; j++) {
				prod = prod * nums[j];
				maximumProduct = Math.max(maximumProduct, prod);
			}
		}
		return maximumProduct;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		int maximumProduct = maxProduct(nums);
		System.out.println(maximumProduct);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)