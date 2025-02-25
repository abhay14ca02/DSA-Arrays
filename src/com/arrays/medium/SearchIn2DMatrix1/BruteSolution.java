package com.arrays.medium.SearchIn2DMatrix1;

//You are given an m x n integer matrix matrix with the following two properties:
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3, Output: true
public class BruteSolution {
	private static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length;// row
		int m = matrix[0].length;// col
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
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 34;
		boolean result = searchMatrix(matrix, target);
		System.out.println(result);
	}

}
//Time Complexity:O(n*m)
//Space Complexity:O(1)