package com.arrays.easy.Convert1DArrayInto2DArray;

//Input: original = [1,2,3,4], m = 2, n = 2, Output: [[1,2],[3,4]]
public class Solution1 {
	private static int[][] construct2DArray(int[] original, int m, int n) {

		// Check if the total elements of the 2D array (m * n) match the length of the
		// original 1D array
		if (m * n != original.length) {
			// If they don't match, return an empty 2D array
			return new int[0][0];

		}
		int[][] result = new int[m][n];

		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				result[row][col] = original[row * n + col];
			}
		}
		return result;
	}

	public static void main(String[] args) {

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