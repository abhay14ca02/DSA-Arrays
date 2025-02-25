package com.arrays.medium.MaximumProductSubarray;
//By using prefix and suffix mechanism
//It is the most optimal solution with intuitive approach
public class OptimalSolution {
	private static int maxProduct(int[] nums) {

		int maximumProduct = Integer.MIN_VALUE;
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
			maximumProduct = Math.max(maximumProduct, Math.max(suffix, prefix));
		}
		return maximumProduct;
	}

	public static void main(String[] args) {
		int[] nums = { 3, -1, 4 };
		int maximumProduct = maxProduct(nums);
		System.out.println(maximumProduct);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)