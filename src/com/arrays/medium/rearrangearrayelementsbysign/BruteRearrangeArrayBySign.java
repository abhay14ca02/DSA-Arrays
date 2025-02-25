package com.arrays.medium.rearrangearrayelementsbysign;

public class BruteRearrangeArrayBySign {

	private static int[] rearrangeArrayBySign(int[] nums) {

		int n = nums.length;
		int[] posArr = new int[n / 2];
		int[] negArr = new int[n / 2];
		int[] result = new int[n];
		int posSign = 0;
		int negSign = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				posArr[posSign] = nums[i];
				posSign++;
			} else {
				negArr[negSign] = nums[i];
				negSign++;
			}
		}
		posSign = 0;
		negSign = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				result[i] = posArr[posSign];
				posSign++;
			} else {
				result[i] = negArr[negSign];
				negSign++;
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
// Time Complexity : O(N) + O(N)
// Space Complexity : O(N) + O(N)