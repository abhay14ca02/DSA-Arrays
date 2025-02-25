package com.arrays.medium.FinalArrayStateAfterKMultiplicationOperations;

//You are given an integer array nums, an integer k, and an integer multiplier.
//You need to perform k operations on nums. In each operation:
// Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
//Replace the selected minimum value x with x * multiplier.
//Return an integer array denoting the final state of nums after performing all k operations.
public class BruteApproach {

	private static int[] getFinalState(int[] nums, int k, int multiplier) {
		int n = nums.length;
		for (int j = 0; j < k; j++) {
			int idx = 0;
			for (int i = 0; i < n; i++) {
				if (nums[i] < nums[idx]) {
					idx = i;
				}
			}
			nums[idx] *= multiplier;
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 1, 3, 5, 6 };
		int k = 5;
		int multiplier = 2;
		int[] finalState = getFinalState(nums, k, multiplier);
		for (int i = 0; i < finalState.length; i++) {
			System.out.print(finalState[i] + " ");
		}
	}
}
//T.C : O(n * k)
//S.C : O(1)