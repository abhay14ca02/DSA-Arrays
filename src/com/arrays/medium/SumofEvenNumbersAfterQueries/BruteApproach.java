package com.arrays.medium.SumofEvenNumbersAfterQueries;

//You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
//For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
//Return an integer array answer where answer[i] is the answer to the ith query.
//Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]], Output: [8,6,2,4]
public class BruteApproach {
	private static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		int n = nums.length;
		int q = queries.length;

		int[] result = new int[n];

		int k = 0;
		for (int j = 0; j < q; j++) {
			int val = queries[j][0];
			int index = queries[j][1];
			nums[index] = nums[index] + val;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (nums[i] % 2 == 0) {
					sum = sum + nums[i];
				}
			}
			result[k++] = sum;
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
//Time Complexity:O(Q*N)
//Space Complexity:O(1)