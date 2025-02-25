package com.arrays.medium.rearrangearrayelementsbysign;

public class OptimalRearrangeArrayBySign {

	private static int[] rearrangeArrayBySign(int[] nums) {

		int n = nums.length;
		int[] result = new int[n];
		int poi = 0;
		int nei = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				result[poi] = nums[i];
				poi += 2;
			} else {
				result[nei] = nums[i];
				nei += 2;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, -2, -5, 2, -4 };
		int[] result = rearrangeArrayBySign(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
