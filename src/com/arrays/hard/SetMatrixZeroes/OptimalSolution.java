package com.arrays.hard.SetMatrixZeroes;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]], Output: [[1,0,1],[0,0,0],[1,0,1]]
public class OptimalSolution {

	private static void setZeroes(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int col0 = 1;

		// step 1: Traverse the matrix and
		// mark 1st row & col accordingly:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 0) {
					// mark i-th row:
					mat[i][0] = 0;
					// mark j-th column:
					if (j != 0)
						mat[0][j] = 0;
					else
						col0 = 0;
				}
			}
		}
		// Step 2: Mark with 0 from (1,1) to (n-1, m-1):
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (mat[i][j] != 0) {
					// check for col & row:
					if (mat[i][0] == 0 || mat[0][j] == 0) {
						mat[i][j] = 0;
					}
				}
			}
		}
		// step 3: Finally mark the 1st col & then 1st row:
		if (mat[0][0] == 0) {
			for (int j = 0; j < m; j++) {
				mat[0][j] = 0;
			}
		}
		if (col0 == 0) {
			for (int i = 0; i < n; i++) {
				mat[i][0] = 0;
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

//Time Complexity: O(2*(N*M))
//Space Complexity: O(1) 
