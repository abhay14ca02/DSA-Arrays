package com.arrays.hard.PascalTriangleII;

import java.util.ArrayList;
import java.util.List;

//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//Input: rowIndex = 3, Output: [1,3,3,1]

public class BruteSolution {

	private static List<Integer> generateRow(int rowIndex) {
		List<Integer> row = new ArrayList<>();
		for (int i = 0; i <= rowIndex; i++) {
			row.add(nCr(rowIndex, i));
		}
		return row;
	}

	private static int nCr(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	private static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int rowIndex = 3;
		List<Integer> res = generateRow(rowIndex);
		System.out.println(res);
	}
}

//Time Complexity : O(N^2)
//Space Complexity : O(1)