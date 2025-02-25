package com.arrays.easy.CountNegativeNumbersinaSortedMatrix;

public class BruteSolution {

	private static int countNegatives(int[][] grid) {
		int countNegtiveNums = 0;
		int n = grid.length;
		int m = grid[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] < 0) {
					countNegtiveNums++;
				}
			}
		}
		return countNegtiveNums;
	}

	public static void main(String[] args) {

		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
		int countNegtiveNums = countNegatives(grid);
		System.out.println(countNegtiveNums);
	}
}
//Time Complexity: O(m*n)
//Space Complexity:O(1)