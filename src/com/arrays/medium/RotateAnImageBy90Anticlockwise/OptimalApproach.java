package com.arrays.medium.RotateAnImageBy90Anticlockwise;

//Given a square matrix mat[][], rotate it 90 degrees counterclockwise, modifying the original matrix directly.
//counterclockwise = Anti-clockwise
//Input: mat[][] = [[1,  2,  3,  4],[5,  6,  7,  8], [9, 10, 11, 12],[13, 14, 15, 16]]
//Output: [[4, 8, 12, 16], [3, 7, 11, 15],[2, 6, 10, 14],[1, 5, 9, 13]]

public class OptimalApproach {

	private static void rotateMatrix(int[][] mat) {
		int n = mat.length;
		// Transpose Matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		// Column wise reverse
		for (int j = 0; j < n; j++) {
			int start = 0, end = n - 1;
			while (start < end) {
				int temp = mat[start][j];
				mat[start][j] = mat[end][j];
				mat[end][j] = temp;
				start++;
				end--;
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
