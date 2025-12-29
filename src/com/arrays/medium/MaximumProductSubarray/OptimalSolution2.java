package com.arrays.medium.MaximumProductSubarray;

//Given an integer array nums, find a subarray that has the largest product, and return the product.
//Input: nums = [2,3,-2,4], Output: 6

public class OptimalSolution2 {

	private static int maxProduct(int[] nums) {

		int n = nums.length;
		int maxProd = nums[0];
		int minProd = nums[0];
		int res = nums[0];

		// Traverse from second element

		for (int i = 1; i < n; i++) {

			int curr = nums[i];

			// Swap if current is negative
			if (curr < 0) {
				int temp = maxProd;
				maxProd = minProd;
				minProd = temp;
			}

			// Update max and min product
			maxProd = Math.max(curr, maxProd * curr);
			minProd = Math.min(curr, minProd * curr);

			// Update result

			res = Math.max(res, maxProd);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums = { -2, -3, -4 };
		int maximumProduct = maxProduct(nums);
		System.out.println(maximumProduct);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(1
