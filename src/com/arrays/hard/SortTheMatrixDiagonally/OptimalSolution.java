package com.arrays.hard.SortTheMatrixDiagonally;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, 
//the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].
//Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
//Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]], Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
public class OptimalSolution {

	private static int[][] diagonalSort(int[][] mat) {
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
		for (List<Integer> list : map.values()) {
			Collections.sort(list);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int key = i - j;
				  mat[i][j] = map.get(key).remove(0);
			}
		}
		return mat;
	}

	public static void main(String[] args) {
		int[][] mat = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
		int[][] result = diagonalSort(mat);
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

