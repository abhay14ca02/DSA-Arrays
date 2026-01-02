package com.arrays.hardSortMatrixByDiagonals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//You are given an n x n square matrix of integers grid. Return the matrix such that:

//The diagonals in the bottom-left triangle (including the middle diagonal) are sorted in non-increasing order.
//The diagonals in the top-right triangle are sorted in non-decreasing order.
//Input: grid = [[1,7,3],[9,8,2],[4,5,6]]
//Output: [[8,2,3],[9,6,7],[4,5,1]]

public class OptimalApproach {

	public static int[][] sortMatrix(int[][] mat) {

		int n = mat.length;
		int m = mat[0].length;
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int key = i - j;
				if (map.containsKey(key)) {
					List<Integer> list = map.get(key);
					list.add(mat[i][j]);
				} else {
					List<Integer> list = new ArrayList<Integer>();
					list.add(mat[i][j]);
					map.put(key, list);
				}
			}
		}
		// Step 2: sort each diagonal according to triangle
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			int key = entry.getKey();
			List<Integer> list = entry.getValue();
			if (key >= 0) {
				// Bottom-left triangle (including main diagonal) -> descending
				list.sort(Collections.reverseOrder());
			} else {
				// Top-right triangle -> ascending
				Collections.sort(list);
			}
		}

		// Step 3: put back into the matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int key = i - j;
				mat[i][j] = map.get(key).remove(0);
			}
		}
		return mat;
	}

	public static void main(String[] args) {

		int[][] mat = { { 1, 7, 3 }, { 9, 8, 2 }, { 4, 5, 6 } };
		int[][] result = sortMatrix(mat);
		int n = result.length;
		int m = result[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//Time Complexity : O(N*M*Log(M))
//Space Complexity : O(M*N)
