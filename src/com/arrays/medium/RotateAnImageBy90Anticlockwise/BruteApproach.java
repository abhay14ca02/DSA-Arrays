package com.arrays.medium.RotateAnImageBy90Anticlockwise;

//Given a square matrix mat[][], rotate it 90 degrees counterclockwise, modifying the original matrix directly.
//counterclockwise = Anti-clockwise
//Input: mat[][] = [[1,  2,  3,  4],[5,  6,  7,  8], [9, 10, 11, 12],[13, 14, 15, 16]]
//Output: [[4, 8, 12, 16], [3, 7, 11, 15],[2, 6, 10, 14],[1, 5, 9, 13]]
public class BruteApproach {

	private static void rotateMatrix(int[][] mat) {

		int n = mat.length;
		int[][] ans = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[n - 1 - j][i] = mat[i][j];
			}
		}
		// Copy back to original matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = ans[i][j];
			}
		}

	}

	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		rotateMatrix(mat);
		int n = mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//Time Complexity:O(N*N)
//Space Complexity:O(N*N)
