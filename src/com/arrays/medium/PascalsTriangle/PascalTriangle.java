package com.arrays.medium.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//Input: numRows = 5, Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

public class PascalTriangle {
	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<>(i + 1);
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					int num = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
					row.add(num);
				}
			}
			result.add(row);
		}
		return result;
	}

	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> result = generate(numRows);
		System.out.println(result);
	}
}
