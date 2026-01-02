package com.arrays.hard.DiagonalTraverseII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a 2D integer array nums, return all elements of nums in diagonal order as shown in the below images.
//Input: nums = [[1,2,3],[4,5,6],[7,8,9]], Output: [1,4,2,7,5,3,8,6,9]
//Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]], Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]

public class OptimalSolution {
	private static int[] findDiagonalOrder(int[][] mat) {
		int row = mat.length;
		int n = 0;
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		// Traverse rows bottom → top
		for (int i = row - 1; i >= 0; i--) {
			int col = mat[i].length; //length of that specific row as matrix is jagged (rows have different lengths).
			for (int j = 0; j < col; j++) {
				int key = i + j;
				if (!map.containsKey(key)) {
					List<Integer> list = new ArrayList<Integer>();
					map.put(key, list);
				}
				map.get(key).add(mat[i][j]);
				n++;
			}
		}
		int[] result = new int[n];
		int i = 0;
		int d = 0; // diagonal
		while (map.containsKey(d)) {
			for (int num : map.get(d)) {
				result[i] = num;
				i++;
			}
			d++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4, 5 }, { 6, 7 }, { 8 }, { 9, 10, 11 }, { 12, 13, 14, 15, 16 } };
		int[] result = findDiagonalOrder(mat);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(N*M)
//Space Complexity : O(N*M)