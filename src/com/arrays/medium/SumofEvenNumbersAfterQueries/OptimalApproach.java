package com.arrays.medium.SumofEvenNumbersAfterQueries;

//You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
//For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
//Return an integer array answer where answer[i] is the answer to the ith query.
//Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]], Output: [8,6,2,4]
public class OptimalApproach {
	private static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		int n = nums.length;
		int q = queries.length;
		int sumEven = 0;
		// Sum of even numbers
		for (int i = 0; i < n; i++) {
			if (nums[i] % 2 == 0) {
				sumEven = sumEven + nums[i];
			}
		}

		int[] result = new int[n];
		// Operation
		for (int i = 0; i < q; i++) {

			int val = queries[i][0];
			int idx = queries[i][1];
			if (nums[idx] % 2 == 0) {
				sumEven = sumEven - nums[idx];
			}
			nums[idx] = nums[idx] + val;
			if (nums[idx] % 2 == 0) {
				sumEven = sumEven + nums[idx];
			}
			result[i] = sumEven;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		int[] result = sumEvenAfterQueries(nums, queries);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity:O(n+q)
//Space Complexity:O(1)