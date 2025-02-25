package com.arrays.medium.productofarrayexceptself;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Input: nums = [1,2,3,4], Output: [24,12,8,6]
//Input: nums = [-1,1,0,-3,3], Output: [0,0,9,0,0]
public class BetterApproach2 {

	private static int[] productOfArrayExceptSelef(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int[] leftProduct = new int[n];
		int[] rightProduct = new int[n];
		leftProduct[0] = 1;
		rightProduct[n - 1] = 1;
		for (int i = 1; i < n; i++) {
			leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
		}
		for (int i = n - 2; i >= 0; i--) {
			rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
		}
		for (int i = 0; i < n; i++) {
			result[i] = leftProduct[i] * rightProduct[i];
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
//Space Complexity :O(N)