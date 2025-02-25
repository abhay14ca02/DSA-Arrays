package com.arrays.easy.CountNegativeNumbersinaSortedMatrix;

public class BetterSolution {
	private static int countNegatives(int[][] grid) {
		int n = grid.length;
		int countNegativeNums = 0;
		for (int i = 0; i < n; i++) {
			int j = binarySearch(grid, i);
			if (j != -1) {
				countNegativeNums += (grid[i].length - j);
			}
		}
		return countNegativeNums;
	}

	private static int binarySearch(int[][] grid, int i) {
		int n = grid[i].length;
		int s = 0;
		int e = n - 1;
		int pos = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (grid[i][mid] < 0) {
				pos = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
		int countNegtiveNums = countNegatives(grid);
		System.out.println(countNegtiveNums);
	}
}
//Time Complexity: O(m * log(n))
//Space Complexity:O(1)