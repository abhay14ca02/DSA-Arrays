package com.arrays.easy.TwoSumPairClosestTarget;

import java.util.Arrays;

//Given an array arr[] of n integers and an integer target, find a pair of elements 
//from the array such that the sum of the pair is closest to the given target.
//Return the pair in sorted order.
//If multiple pairs have the same closest sum, return the one with the maximum absolute difference (i.e., |a - b| is largest).
//If no valid pair exists (i.e., array has fewer than 2 elements), return an empty array.
//Input: arr[] = [10, 30, 20, 5], target = 25
//Output: [5, 20]
//Input: arr[] = [5, 2, 7, 1, 4], target = 10
//Output: [2, 7]
//Explanation: As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. 
//Hence, [2, 7] has maximum absolute difference and closest to target.
public class OptimalApproach2 {

	private static int[] sumClosestToTarget(int[] arr, int target) {

		int n = arr.length;

		if (n < 2) {
			return new int[0];
		}

		Arrays.sort(arr);
		int res[] = new int[2];
		int closestDiff = Integer.MAX_VALUE;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			
			int currSum = arr[left] + arr[right];
			
			if (currSum == target) {
				return new int[] { arr[left], arr[right] };
			}
			
			int diff = Math.abs(target - currSum);
			if (diff < closestDiff) {
				closestDiff = diff;
				res[0] = arr[left];
				res[1] = arr[right];
			}

			else if (diff == closestDiff) {
				// If same closeness, choose pair with maximum absolute difference
				if (Math.abs(arr[left] - arr[right]) > Math.abs(res[1] - res[0])) {
					res[0] = arr[left];
					res[1] = arr[right];
				}
			}

			// Move pointers based on sum
			if (currSum < target) {
				left++;
			} else {
				right--;
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

// Time Complexity : O(NLogN) + O(N)
// Space Complexity : O(1)