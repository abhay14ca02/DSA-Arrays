package com.arrays.medium.MaximumMatrixSum;

//Input: matrix = [[1,-1],[-1,1]], Output: 4
public class OptimalSolution {
	private static long maxMatrixSum(int[][] mat) {
		int n = mat.length;
		long sum = 0;
		int countNegatives = 0;
		int smallestAbsoluteValue = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += Math.abs(mat[i][j]);
				if (mat[i][j] < 0) {
					countNegatives++;
				}
				smallestAbsoluteValue = Math.min(smallestAbsoluteValue, Math.abs(mat[i][j]));
			}
		}
		if (countNegatives % 2 == 0) {
			return sum;
		}
		return sum - 2 * smallestAbsoluteValue;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, -1 }, { -1, 1 } };
		long result = maxMatrixSum(mat);
		System.out.println(result);
	}

}
//Time Complexity : O(n*m)
//Space Complexity : O(1)