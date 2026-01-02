package com.arrays.medium.RotateAnImageBy180;

//Given a square matrix mat[][], Rotate the matrix by 180 degrees.
//Note:Rotating 180°clockwise or ant-iclockwise gives the same result.
//Input:  mat[][] = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//Output: [[9, 8, 7],[6, 5, 4], [3, 2, 1]]

public class OptimalApproach {

	private static void rotateMatrix(int[][] mat) {
		int n = mat.length;
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
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
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
//Space Complexity:O(1)
