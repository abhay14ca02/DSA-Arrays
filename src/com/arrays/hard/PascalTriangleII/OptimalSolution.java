package com.arrays.hard.PascalTriangleII;

import java.util.ArrayList;
import java.util.List;

//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//Input: rowIndex = 3, Output: [1,3,3,1]
public class OptimalSolution {

	public static List<Integer> getRow(int rowIndex) {
		int row = rowIndex + 1; // number of elements in this row
		long ans = 1;
		List<Integer> ansRow = new ArrayList<Integer>();
		ansRow.add((int) ans);
		for (int col = 1; col < row; col++) {
			ans = ans * (row - col);
			ans = ans / col;
			ansRow.add((int) ans);
		}
		return ansRow;
	}

	public static void main(String[] args) {
		int rowIndex = 3;
		List<Integer> result = getRow(rowIndex);
		System.out.println(result);
	}
}

//Time Complexity : O(N)
//Space Complexity : O(1)