package com.arrays.easy.TwoSumPairClosestToZero;

//Given an integer array arr[], find the sum of any two elements whose sum is closest to zero.

//Note: In case if we have two ways to form sum closest to zero, return the maximum sum among them.

// Input: arr[] = [-8, 5, 2, -6]
// Output: -1
// Explanation: The min absolute sum pair is (5, -6)
// Input:  arr[] = [0, -8, -6, 3]
// Output: 3
// Explanation: We have a tie between (0, 3) and (-6, 3). We pick the max sum in this case which is 0+3

public class BruteApproach1 {

	private static int closestToZero(int[] arr) {
		int n = arr.length;

		if (n < 2)
			return 0;

		int bestSum = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int currSum = arr[i] + arr[j];
				if (Math.abs(currSum) < Math.abs(bestSum)) {
					bestSum = currSum;
				} else if (Math.abs(currSum) == Math.abs(bestSum)) {
					bestSum = Math.max(currSum, bestSum);
				}
			}
		}
		return bestSum;
	}

	public static void main(String[] args) {
		int[] arr = { 0, -8, -6, 3 };
		int res = closestToZero(arr);
		System.out.println(res);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)