package com.arrays.medium.MaximumSumRectangleInMatrix;

//You are given a 2D matrix (grid) of integers, positive or negative.
//You need to find a sub-rectangle (continuous block of rows and columns) that has the maximum possible sum.
public class OptimalSolution {

	private static int maxSumRectangle(int[][] matrix) {

		int n = matrix.length; // row
		int m = matrix[0].length; // column
		int maxSum = Integer.MIN_VALUE;

		// Fix left column

		for (int left = 0; left < m; left++) {

			// Temp array that stores row sums between left and right columns
			int[] temp = new int[n];

			// Fix right column
			
			for (int right = left; right < m; right++) {
				// Add current column to each row sum
				for (int i = 0; i < n; i++) {
					temp[i] += matrix[i][right];
				}
				// Apply Kadane’s algorithm on temp

				int currMax = kadane(temp);

				// Track global maximum
				maxSum = Math.max(maxSum, currMax);
			}
		}
		return maxSum;
	}

	// Standard Kadane’s algorithm for 1D array
	private static int kadane(int[] temp) {
		int n = temp.length;
		int currSum = temp[0];
		int maxSum = temp[0];
		for (int i = 1; i < n; i++) {
			currSum = Math.max(temp[i], currSum + temp[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } };
		int res = maxSumRectangle(matrix);
		System.out.println(res);
	}
}

// Time Complexity : O(n * m^2)
// Space Complexity : O(n)