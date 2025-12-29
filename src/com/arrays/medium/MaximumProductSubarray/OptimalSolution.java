package com.arrays.medium.MaximumProductSubarray;

//Given an integer array nums, find a subarray that has the largest product, and return the product.

//Input: nums = [2,3,-2,4], Output: 6

//By using prefix and suffix mechanism
//It is the most optimal solution with intuitive approach
public class OptimalSolution {
	
	// 1 Pass solution
	private static int maxProduct(int[] nums) {

		int maxProd = Integer.MIN_VALUE;
		int n = nums.length;
		int prefix = 1;
		int suffix = 1;
		for (int i = 0; i < n; i++) {
			if (prefix == 0) {
				prefix = 1;
			}
			if (suffix == 0) {
				suffix = 1;
			}
			prefix = prefix * nums[i];
			suffix = suffix * nums[n - i - 1];
			maxProd = Math.max(maxProd, Math.max(suffix, prefix));
		}
		return maxProd;
	}

	// 2 Pass solution
	private static int maxProd(int[] nums) {

		int n = nums.length;
		int maxProd = Integer.MIN_VALUE;
		
		// Prefix pass
		int prefix = 1;
		for (int i = 0; i < n; i++) {
			if (prefix == 0) {
				prefix = 1;
			}
			prefix = prefix * nums[i];
			maxProd = Math.max(maxProd, prefix);
		}
		// Suffix pass
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			if (suffix == 0) {
				suffix = 1;
			}
			suffix = suffix * nums[i];
			maxProd = Math.max(maxProd, suffix);
		}

		return maxProd;
	}

	public static void main(String[] args) {
		int[] nums = { 3, -1, 4 };
		int maximumProduct = maxProduct(nums);
		System.out.println(maximumProduct);

		System.out.println();

		int maxProd = maxProd(nums);

		System.out.println(maxProd);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)