package com.arrays.medium.WaveFormMatrix;

//Input: mat[][]={ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } }
//Output: 1 5 9 13 17 18 14 10 6 2 3 7 11 15 19 20 16 12 8 4
//Wave form means top to down and down to top vice-versa
public class BruteSolution {
	private static void waveForm(int[][] mat) {
		int n = mat.length; // row
		int m = mat[0].length; // col
		for (int col = 0; col < m; col++) {

			if (col % 2 == 0) {
				for (int row = 0; row < n; row++) {
					System.out.print(mat[row][col] + " ");// Top to Bottom when column is even
				}
			} else {
				for (int row = n - 1; row >= 0; row--) {
					System.out.print(mat[row][col] + " ");// Bottom to Top when column is odd
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		waveForm(mat);
	}
}
//Time Complexity : O(N*M)
//Space Complexity:O(1)