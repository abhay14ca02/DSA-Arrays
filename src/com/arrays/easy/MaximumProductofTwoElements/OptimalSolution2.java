package com.arrays.easy.MaximumProductofTwoElements;
//By using Kandane’s algorithm
public class OptimalSolution2 {
	private static int maxProduct(int[] nums) {
		int n = nums.length;
		int prod1 = nums[0], prod2 = nums[0], maximumProduct = nums[0];
		for (int i = 1; i < n; i++) {
			int temp = Math.max(nums[i], Math.max(prod1 * nums[i], prod2 * nums[i]));
			prod2 = Math.min(nums[i], Math.min(prod1 * nums[i], prod2 * nums[i]));
			prod1 = temp;
			maximumProduct = Math.max(maximumProduct, prod1);
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
