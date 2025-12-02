package com.arrays.easy.TwoSumPairClosestToZero;

import java.util.Arrays;

//Given an integer array arr[], find the sum of any two elements whose sum is closest to zero.

//Note: In case if we have two ways to form sum closest to zero, return the maximum sum among them.

//Input: arr[] = [-8, 5, 2, -6]
//Output: -1
//Explanation: The min absolute sum pair is (5, -6)
//Input:  arr[] = [0, -8, -6, 3]
//Output: 3
//Explanation: We have a tie between (0, 3) and (-6, 3). We pick the max sum in this case which is 0+3

public class OptimalApproach3 {

	private static int closestToZero(int[] arr) {
		int n = arr.length;

		if (n < 2) {
			return 0;
		}
		Arrays.sort(arr); // O(NLogn)

		int left = 0;
		int right = n - 1;

		int bestSum = Integer.MAX_VALUE;

		while (left < right) { // O(N)

			int currSum = arr[left] + arr[right];

			if (currSum == 0) {
				return 0;
			}

			// If this sum is closer to 0
			if (Math.abs(currSum) < Math.abs(bestSum)) {
				bestSum = currSum;
			}
			// If tied, pick the maximum sum (as per problem requirement)
			else if (Math.abs(currSum) == Math.abs(bestSum)) {//
				bestSum = Math.max(currSum, bestSum);
			}
			if (currSum < 0) {
				left += 1;
			} else {
				right -= 1;
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

// Time Complexity : O(NlogN) + O(N)
// Space Complexity : O(1)