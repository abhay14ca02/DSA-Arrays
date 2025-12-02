package com.arrays.easy.TwoSumPairClosestTarget;

// Given an array arr[] of n integers and an integer target, find a pair of elements 
// from the array such that the sum of the pair is closest to the given target.
// Return the pair in sorted order.
// If multiple pairs have the same closest sum, return the one with the maximum absolute difference (i.e., |a - b| is largest).
// If no valid pair exists (i.e., array has fewer than 2 elements), return an empty array.
// Input: arr[] = [10, 30, 20, 5], target = 25
// Output: [5, 20]
// Input: arr[] = [5, 2, 7, 1, 4], target = 10
// Output: [2, 7]
// Explanation: As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. 
// Hence, [2, 7] has maximum absolute difference and closest to target.
public class BruteApproach1 {

	private static int[] sumClosestToTarget(int[] arr, int target) {

		int n = arr.length;

		if (n < 2) {
			return new int[0];
		}

		int res[] = new int[2];
		int closestDiff = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				int currSum = arr[i] + arr[j];

				if (currSum == target) {
					res[0] = Math.min(arr[i], arr[j]);
					res[1] = Math.max(arr[i], arr[j]);
					return res;
				}
				int currDiff = Math.abs(currSum - target);
				// if currDiff is less than closestDiff, it indicates
				// that this pair is closer to the target
				if (currDiff < closestDiff) {
					closestDiff = currDiff;
					res[0] = Math.min(arr[i], arr[j]);
					res[1] = Math.max(arr[i], arr[j]);

				}
				// if currDiff is equal to closestDiff, find the one with
				// largest absolute difference
				else if (currDiff == closestDiff) {

					if (Math.abs(arr[i] - arr[j]) > Math.abs(res[1] - res[0])) {
						res[0] = Math.min(arr[i], arr[j]);
						res[1] = Math.max(arr[i], arr[j]);
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 2, 7, 1, 4 };
		int target = 10;
		int[] res = sumClosestToTarget(arr, target);
		System.out.print("{" + res[0] + " " + res[1] + "}");
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)