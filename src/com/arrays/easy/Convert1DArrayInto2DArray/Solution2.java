package com.arrays.easy.Convert1DArrayInto2DArray;

public class Solution2 {
	private static int[][] construct2DArray(int[] original, int m, int n) {

		if (original.length != m * n) {

			return new int[0][0];
		}
		int[][] result = new int[m][n];
		for (int i = 0; i < original.length; i++) {
			result[i / n][i % n] = original[i];
		}
		return result;
	}

	public static void mainn(String[] args) {

		int[] original = { 1, 2, 3, 4 };
		int m = 2;
		int n = 2;
		int[][] result = construct2DArray(original, m, n);

		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(result[row][col] + " ");
			}
			System.out.println();
		}

	}
}
//Time Complexity : O(m*n)
//Space Complexity : O(m*n)