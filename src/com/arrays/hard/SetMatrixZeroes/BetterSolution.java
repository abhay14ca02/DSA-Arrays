package com.arrays.hard.SetMatrixZeroes;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]], Output: [[1,0,1],[0,0,0],[1,0,1]]
public class BetterSolution {
	private static void setZeroes(int[][] mat) {

		int n = mat.length;
		int m = mat[0].length;
		int[] row = new int[n];
		int[] col = new int[m];
		
		//Mark rows and columns
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 0) {
					// mark ith index of row with 1:
					row[i] = 1;
					// mark jth index of col with 1:
					col[j] = 1;
				}
			}
		}
		// Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                	mat[i][j]=0;
                }
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
//Time Complexity : O(N*M) + O(N*M)
//Space Complexity : O(N) + O(M)