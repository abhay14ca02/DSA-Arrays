package com.arrays.medium.IncreasingTripletSubsequence;

public class OptimalSolution {
	private static boolean increasingTriplet(int[] nums) {

		int n = nums.length;
		int num1 = Integer.MAX_VALUE;
		int num2 = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int num3 = nums[i];
			if (num3 <= num1) {
				num1 = num3;
			} else if (num3 <= num2) {
				num2 = num3;
			} else {// num1 < num2
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 20, 100, 10, 12, 5, 13 };
		boolean res = increasingTriplet(nums);
		System.out.println(res);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1) 