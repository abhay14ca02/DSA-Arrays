package com.arrays.hard.productofarrayexceptself;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Input: nums = [1,2,3,4], Output: [24,12,8,6]
//Input: nums = [-1,1,0,-3,3], Output: [0,0,9,0,0]

public class BetterApproach {

	private static int[] productOfArrayExceptSelef(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int[] prefix = new int[n];
		int[] suffix = new int[n];

		prefix[0] = 1;
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] * nums[i - 1];
		}

		suffix[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < n; i++) {
			result[i] = prefix[i] * suffix[i];
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
//Time Complexity :O(N) + O(N) + O(N)
//Space Complexity :O(N) + O(N)