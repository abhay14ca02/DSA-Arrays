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

public class BetterApproach2 {

	private static int closestToZero(int[] arr) {
		int n = arr.length;

		if (n < 2) {
			return 0;
		}
		Arrays.sort(arr); // O(NLogN)

		int bestSum = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {// O(N)
			int firstNum = arr[i];

			bestSum = binarySearch(arr, firstNum, i + 1, n - 1, bestSum);// O(LogN)
		}

		return bestSum;
	}

	private static int binarySearch(int[] arr, int firstNum, int left, int right, int bestSum) {

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int currSum = firstNum + arr[mid];

			// If exact pair is found
			if (currSum == 0) {
				return 0;
			}
			// Update bestSum if the current pair is closer
			if (Math.abs(currSum) < Math.abs(bestSum)) {
				bestSum = currSum;
			}
			// If tied, pick the maximum sum (as per problem requirement)

			else if (Math.abs(currSum) == Math.abs(bestSum)) {
				bestSum = Math.max(bestSum, currSum);
			}
			if (currSum < 0) {
				left++;
			} else {
				right--;
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

// Time Complexity : O(NLogN) + O(NLogN)
// Space Complexity : O(1)