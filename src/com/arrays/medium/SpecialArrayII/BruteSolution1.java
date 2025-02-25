package com.arrays.medium.SpecialArrayII;

//An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
//You are given an array of integer nums and a 2D integer matrix queries, where for queries[i] = [fromi, toi] 
//your task is to check that subarray nums[fromi..toi] is special or not.
//Return an array of booleans answer such that answer[i] is true if nums[fromi..toi] is special.
//Input: nums = [3,4,1,2,6], queries = [[0,4]] , Output: [false]
//Input: nums = [4,3,1,6], queries = [[0,2],[2,3]], Output: [false,true]
public class BruteSolution1 {

	private static boolean[] isArraySpecial(int[] nums, int[][] queries) {

		int n = nums.length;
		int m = queries.length;
		boolean[] result = new boolean[m];
		int[] parity = new int[n];
		parity[0] = 0;
		for (int i = 1; i < n; i++) {
			if (nums[i - 1] % 2 != nums[i] % 2) {
				parity[i] = parity[i - 1];
			} else {
				parity[i] = i;
			}
		}
		for (int i = 0; i < m; i++) {
			result[i] = parity[queries[i][1]] <= queries[i][0];
		}
		return result;

	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 1, 6 };
		int[][] queries = { { 0, 2 }, { 2, 3 } };
		boolean[] isSpecial = isArraySpecial(nums, queries);
		for (int i = 0; i < isSpecial.length; i++) {
			System.out.print(isSpecial[i] + " ");
		}
	}
}
//Time Complexity:O(N+M)
//Space Complexity:O(N+M)