package com.arrays.medium.RotateAnImageByKTimes;

//Rotate a matrix by K times (each = 90° clockwise).
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]], k=1, Output: [[7,4,1],[8,5,2],[9,6,3]]

public class OptimalApproach {

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
		// Transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		// Row wise reverse
		for (int i = 0; i < n; i++) {
			int start = 0, end = n - 1;
			while (start < end) {
				int temp = mat[i][start];
				mat[i][start] = mat[i][end];
				mat[i][end] = temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int k = 2;
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
//Space: O(1)