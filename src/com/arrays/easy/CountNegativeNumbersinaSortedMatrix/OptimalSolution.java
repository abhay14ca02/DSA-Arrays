package com.arrays.easy.CountNegativeNumbersinaSortedMatrix;

public class OptimalSolution {
	private static int countNegatives(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int row = n - 1;
		int col = 0;
		int countNegNums = 0;
		while (row >= 0 && col < m) {
			if (grid[row][col] < 0) {
				countNegNums += m - col;
				row--;
			} else {
				col++;
			}
		}
		return countNegNums;
	}

	public static void main(String[] args) {
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
		int countNegtiveNums = countNegatives(grid);
		System.out.println(countNegtiveNums);
	}
}
//Time Complexity : O(m+n) 
//Space Complexity : O(1)