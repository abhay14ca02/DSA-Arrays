package com.arrays.hard.MinimumOperationstoMakeArrayEqualtoTarget;

public class OptimalSolution {
	private static long minimumOperations(int[] nums, int[] target) {
		int n = nums.length;
		long operations = 0;
		int curr = 0;
		int prev = 0;
		for (int i = 0; i < n; i++) {
			curr = target[i] - nums[i];
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
		int[] nums = { 3, 5, 1, 2 };
		int[] target = { 4, 6, 2, 4 };
		long operations = minimumOperations(nums, target);
		System.out.println(operations);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1)