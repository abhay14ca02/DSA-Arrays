package com.arrays.hard.productofarrayexceptself;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Input: nums = [1,2,3,4], Output: [24,12,8,6]
//Input: nums = [-1,1,0,-3,3], Output: [0,0,9,0,0]

public class OptimalApproach {
	private static int[] productOfArrayExceptSelef(int[] nums) {

		int n = nums.length;
		int[] result = new int[n];

		// Step 1: Build prefix product in res[]
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}

		// Step 2: Multiply with suffix product
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * suffix;
			suffix = nums[i] * suffix;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] ans = productOfArrayExceptSelef(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
//Time Complexity :O(N)
//Space Complexity :O(1)