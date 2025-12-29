package com.arrays.medium.TransposeMatrix;

//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]], Output: [[1,4,7],[2,5,8],[3,6,9]]

public class OptimalSolution {
	private static int[][] transpose(int[][] mat) {

		int n = mat.length;// row
		int m = mat[0].length;// col
		int[][] result = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[j][i] = mat[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] result = transpose(mat);
		int n = result.length;// row
		int m = result[0].length;// col
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