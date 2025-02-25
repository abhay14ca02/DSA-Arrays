package com.arrays.easy.SpecialArrayI;

//An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
//You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
//Input: nums = [2,1,4] ,Output: true
public class BruteSolution {
	private static boolean isArraySpecial(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] % 2 == nums[i + 1] % 2) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] nums = { 2, 1, 4 };
		boolean isSpecial = isArraySpecial(nums);
		System.out.println(isSpecial);
	}
}
//Time Complexity : O(N*N)
//Space Complexity : O(1)