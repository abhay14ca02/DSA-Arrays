package com.arrays.hard.SetMatrixZeroes;

//Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]], Output: [[1,0,1],[0,0,0],[1,0,1]]

public class BruteSolution {
	private static void setZeroes(int[][] mat) {

		int n = mat.length; // row
		int m = mat[0].length; // col

		// Set -1 for rows and cols that contains 0.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 0) {
					markRow(mat, n, m, i);
					markCol(mat, n, m, j);
				}
			}
		}
		// Finally, mark all -1 as 0:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == -1) {
					mat[i][j] = 0;
				}
			}
		}
	}

	// Mark row
	private static void markRow(int[][] mat, int n, int m, int i) {
		// set all non-zero elements as -1 in the row i:
		for (int j = 0; j < m; j++) {
			if (mat[i][j] != 0) {
				mat[i][j] = -1;
			}
		}
	}
	 // Mark column
	private static void markCol(int[][] mat, int n, int m, int j) {
		// set all non-zero elements as -1 in the col j:
		for (int i = 0; i < n; i++) {
			if (mat[i][j] != 0) {
				mat[i][j] = -1;
			}
		}

	}

	public static void main(String[] args) {

		int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setZeroes(mat);
		int n = mat.length;
		int m = mat[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//Time Complexity : O(N*M) * O(N+M) + O(N*m)
//Space Complexity : O(1)
