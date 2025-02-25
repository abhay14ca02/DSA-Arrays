package com.arrays.medium.FindValidMatrixGivenRowandColumnSums;

//Input: rowSum = [3,8], colSum = [4,7],Output: [[3,0], [1,7]]
public class Solution {
	private static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int n = rowSum.length;
		int m = colSum.length;
		int i = 0;
		int j = 0;
		int[][] result = new int[n][m];
		while (i < n && j < m) {
			result[i][j] = Math.min(rowSum[i], colSum[j]);
			rowSum[i] -= result[i][j];
			colSum[j] -= result[i][j];
			if (rowSum[i] == 0) {
				i++;
			}
			if (colSum[j] == 0) {
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] rowSum = { 3, 8 };
		int[] colSum = { 4, 7 };
		int[][] result = restoreMatrix(rowSum, colSum);
		int n = result.length;
		int m = result[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}
//Time Complexity : O(N*M)
//Space Complexity : O(N*M)