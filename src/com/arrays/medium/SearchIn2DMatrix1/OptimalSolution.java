package com.arrays.medium.SearchIn2DMatrix1;

//You are given an m x n integer matrix matrix with the following two properties:
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3, Output: true
public class OptimalSolution {
	private static boolean searchMatrix(int[][] matrix, int target) {
		int n = matrix.length;// row
		int m = matrix[0].length;// col
		int start = 0;
		int end = n * m - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int row = mid / m;
			int col = mid % m;
			if (matrix[row][col] == target) {
				return true;
			} else if (matrix[row][col] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean result = searchMatrix(matrix, target);
		System.out.println(result);
	}
}
//Time Complexity:O(Log(n*m)
//Space Complexity:O(1)