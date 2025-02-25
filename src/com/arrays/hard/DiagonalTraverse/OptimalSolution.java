package com.arrays.hard.DiagonalTraverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
//Input: mat = [[1,2,3],[4,5,6],[7,8,9]], Output: [1,2,4,7,5,3,6,8,9]
//Input: mat = [[1,2],[3,4]], Output: [1,2,3,4]
//[[2,5],[8,4],[0,-1]] ,Output: [2,5,8,0,4,-1]

public class OptimalSolution {
	private static int[] findDiagonalOrder(int[][] mat) {

		int n = mat.length;
		int m = mat[0].length;
		int[] result = new int[n * m];
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int key = i + j;
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
		boolean flip = true;
		int idx = 0;
		for (List<Integer> list : map.values()) {
			System.out.println(list);
			if (flip) {
				Collections.reverse(list);
			}
			for (Integer num : list) {
				result[idx++] = num;
			}
			flip = !flip;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };
		int[] result = findDiagonalOrder(mat);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
