package com.arrays.easy.SortArraybyParityI;

public class OptimalSolution {
	private static int[] sortArrayByParity(int[] nums) {
		int n = nums.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 4 };
		int[] result = sortArrayByParity(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)