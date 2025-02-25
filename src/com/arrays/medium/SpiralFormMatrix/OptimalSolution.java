package com.arrays.medium.SpiralFormMatrix;

import java.util.ArrayList;
import java.util.List;

//Given an m x n matrix, return all elements of the matrix in spiral order.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]], Output: [1,2,3,6,9,8,7,4,5]
public class OptimalSolution {

	private static List<Integer> spiralForm(int[][] mat) {
		List<Integer> result = new ArrayList<Integer>();
		int row = mat.length;
		int col = mat[0].length;
		int top = 0, bottom = row - 1, left = 0, right = col - 1;
		while (top <= bottom && left <= right) {

			// print top
			for (int i = left; i <= right; i++) {
				result.add(mat[top][i]);
			}
			top++;
			// print right
			for (int j = top; j <= bottom; j++) {
				result.add(mat[j][right]);
			}
			right--;
			// print bottom
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(mat[bottom][i]);
				}
				bottom--;
			}
			// print left
			if (left <= right) {
				for (int j = bottom; j >= top; j--) {
					result.add(mat[j][left]);
				}
				left++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 4, 6 }, { 7, 8, 9 } };
		List<Integer> result = spiralForm(mat);
		System.out.println(result);
	}
}
//Time Complexity:O(N*M)
//Space Complexity:O(1)