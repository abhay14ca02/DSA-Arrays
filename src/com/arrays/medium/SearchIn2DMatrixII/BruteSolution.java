package com.arrays.medium.SearchIn2DMatrixII;

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5, Output: true
public class BruteSolution {
	private static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length; // row
		int m = matrix[0].length; // col
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 22;
		boolean isPresent = searchMatrix(matrix, target);
		System.out.println(isPresent);
	}
}
//Time Complexity:O(n*m)
//Space Complexity:O(1)