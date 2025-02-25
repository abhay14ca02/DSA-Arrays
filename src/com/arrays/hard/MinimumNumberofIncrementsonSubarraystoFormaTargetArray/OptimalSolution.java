package com.arrays.hard.MinimumNumberofIncrementsonSubarraystoFormaTargetArray;

public class OptimalSolution {
	private static int minNumberOperations(int[] target) {
		int n = target.length;
		int result = 0;
		int prev = 0;
		for (int i = 0; i < n; i++) {
			int curr = target[i];
			if (curr > prev) {
				result += (curr - prev);
			}
			prev = curr;
		}
		return result;
	}

	public static void main(String[] args) {

		int[] target = { 1, 2, 3, 2, 1 };
		int result = minNumberOperations(target);
		System.out.println(result);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1)