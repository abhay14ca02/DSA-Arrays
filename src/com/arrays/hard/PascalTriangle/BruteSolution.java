package com.arrays.hard.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly
//Input: numRows = 5, Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

public class BruteSolution {

	public static List<List<Integer>> generateTriangle(int numRows) {
		// Result list to hold all rows
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int r = 0; r < numRows; r++) {
			List<Integer> curRow = new ArrayList<>();
			for (int c = 0; c <= r; c++) {
				curRow.add(nCr(r, c)); // Compute each element using factorial
			}
			triangle.add(curRow);
		}
		return triangle;
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
		int numRows = 5;
		List<List<Integer>> result = generateTriangle(numRows);
		System.out.println(result);
	}
}
// Time Complexity : O(N^3)
// Space Complexity : O(N)
