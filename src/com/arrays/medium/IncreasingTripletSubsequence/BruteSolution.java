package com.arrays.medium.IncreasingTripletSubsequence;

public class BruteSolution {
	private static boolean increasingTriplet(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i; j < n - 1; j++) {
				for (int k = j; k < n; k++) {

					if (i < j && j < k) {

						if (nums[i] < nums[j] && nums[j] < nums[k]) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 0, 4, 6 };
		boolean res = increasingTriplet(nums);
		System.out.println(res);
	}
}
//Time Complexity : O(N^3)
//Space Complexity : O(1)