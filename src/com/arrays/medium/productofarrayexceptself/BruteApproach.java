package com.arrays.medium.productofarrayexceptself;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Input: nums = [1,2,3,4], Output: [24,12,8,6]
//Input: nums = [-1,1,0,-3,3], Output: [0,0,9,0,0]
public class BruteApproach {

	private static int[] productOfArrayExceptSelef(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			int product = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					product = product * nums[j];
				}
			}
			ans[i] = product;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] ans = productOfArrayExceptSelef(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
//Time Complexity :O(N*N)
//Space Complexity :O(1)
