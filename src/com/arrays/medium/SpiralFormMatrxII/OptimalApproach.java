package com.arrays.medium.SpiralFormMatrxII;

//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
//Input: n = 3, Output: [[1,2,3],[8,9,4],[7,6,5]]
public class OptimalApproach {

	public static int[][] generateMatrix(int n) {
		int[][] mat = new int[n][n];
		int t = 0; // Top
		int bt = n - 1; // Bottom
		int l = 0; // Left
		int rt = n - 1; // Right
		int num = 1;

		while (t <= bt && l <= rt) {
			// Fill top row
			for (int i = l; i <= rt; i++) {
				mat[t][i] = num++;
			}
			t++;
			// Fill right column
			for (int j = t; j <= bt; j++) {
				mat[j][rt] = num++;
			}
			rt--;
			// Fill bottom row
			if (t <= bt) {
				for (int i = rt; i >= l; i--) {
					mat[bt][i] = num++;
				}
				bt--;
			}
			// Fill left column
			if (l <= rt) {
				for (int j = bt; j >= t; j--) {
					mat[j][l] = num++;
				}
				l++;
			}
		}
		return mat;

	}

	public static void main(String[] args) {

		int n = 3;
		int[][] res = generateMatrix(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//Time Complexity:O(N*N)
//Space Complexity:O(1)