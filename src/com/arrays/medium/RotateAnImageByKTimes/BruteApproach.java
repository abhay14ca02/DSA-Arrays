package com.arrays.medium.RotateAnImageByKTimes;

//Rotate a matrix by K times (each = 90° clockwise).
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]], k=1, Output: [[7,4,1],[8,5,2],[9,6,3]]
public class BruteApproach {

	private static void rotateKTimes(int[][] mat, int k) {
		k = k % 4;
		if (k == 0) {
			return;
		}
		for (int i = 0; i < k; i++) {
			rotate(mat);
		}

	}

	private static void rotate(int[][] mat) {
		int n = mat.length;
		int[][] ans = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[j][n - i - 1] = mat[i][j];
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

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int k = 1;
		rotateKTimes(mat, k);
		int n = mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//Time: O(k × n²)
//Space: O(n²)
