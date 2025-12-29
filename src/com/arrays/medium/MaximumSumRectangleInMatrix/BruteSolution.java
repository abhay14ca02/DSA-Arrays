package com.arrays.medium.MaximumSumRectangleInMatrix;

//You are given a 2D matrix (grid) of integers, positive or negative.
//You need to find a sub-rectangle (continuous block of rows and columns) that has the maximum possible sum.
public class BruteSolution {

	private static int maxSumRectangle(int[][] matrix) {

		int n = matrix.length; // row
		int m = matrix[0].length; // column
		int maxSum = Integer.MIN_VALUE;

		// Choose all pairs of rows
		for (int top = 0; top < n; top++) {
			for (int bot = top; bot < n; bot++) {
				// Choose all pairs of columns
				for (int left = 0; left < m; left++) {

					for (int right = left; right < m; right++) {

						int currSum = 0;
						// Sum all elements in rectangle:
						// rows = top..bottom, columns = left..right
						for (int i = top; i <= bot; i++) {
							for (int j = left; j <= right; j++) {
								currSum += matrix[i][j];
							}
						}
						// Update result
						if (currSum > maxSum) {
							maxSum = currSum;
						}
					}
				}

			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } };
		int res = maxSumRectangle(matrix);
		System.out.println(res);
	}
}
