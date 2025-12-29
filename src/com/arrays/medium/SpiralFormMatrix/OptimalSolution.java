package com.arrays.medium.SpiralFormMatrix;

import java.util.ArrayList;
import java.util.List;

//Given an m x n matrix, return all elements of the matrix in spiral order.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]], Output: [1,2,3,6,9,8,7,4,5]

public class OptimalSolution {

	private static List<Integer> spiralForm(int[][] mat) {
		List<Integer> result = new ArrayList<Integer>();
		int r = mat.length; // Row
		int c = mat[0].length; // Column
		int t = 0; // Top
		int bt = r - 1; // Bottom
		int l = 0; // Left
		int rt = c - 1; // Right
		while (t <= bt && l <= rt) {
			
			// print top
			for (int i = l; i <= rt; i++) {
				result.add(mat[t][i]);
			}
			t++;
			// print right
			for (int j = t; j <= bt; j++) {
				result.add(mat[j][rt]);
			}
			rt--;
			// print bottom
			if (t <= bt) {
				for (int i = rt; i >= l; i--) {
					result.add(mat[bt][i]);
				}
				bt--;
			}
			// print left
			if (l <= rt) {
				for (int j = bt; j >= t; j--) {
					result.add(mat[j][l]);
				}
				l++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> result = spiralForm(mat);
		System.out.println(result);
	}
}
//Time Complexity:O(N*M)
//Space Complexity:O(1)