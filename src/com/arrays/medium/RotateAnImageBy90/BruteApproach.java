package com.arrays.medium.RotateAnImageBy90;

//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
//DO NOT allocate another 2D matrix and do the rotation.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]], Output: [[7,4,1],[8,5,2],[9,6,3]]

public class BruteApproach {

	private static void rotate(int[][] mat) {

		int n = mat.length;
		int[][] ans = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[j][n - 1 - i] = mat[i][j];
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
		rotate(mat);
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