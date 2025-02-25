package com.arrays.hard.MinimumOperationstoMakeArrayEqualtoTarget;

public class BetterSolution {
	private static long minimumOperations(int[] nums, int[] target) {
		int n = nums.length;
		long operations = 0;
		int curr = 0;
		int prev = 0;
		int[] diff = new int[n];
		for (int i = 0; i < n; i++) {
			diff[i] = target[i] - nums[i];
		}
		for (int i = 0; i < n; i++) {
			curr = diff[i];
			// Check for sign change
			if ((curr > 0 && prev < 0) || (curr < 0 && prev > 0)) {
				operations += Math.abs(curr);
			} else if (Math.abs(curr) > Math.abs(prev)) {
				operations += Math.abs(curr - prev);
			}
			prev = curr;
		}
		return operations;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2 };
		int[] target = { 2, 1, 4 };
		long operations = minimumOperations(nums, target);
		System.out.println(operations);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(N)