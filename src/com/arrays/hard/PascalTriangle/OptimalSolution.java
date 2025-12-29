package com.arrays.hard.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly
//Input: numRows = 5, Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

public class OptimalSolution {

	public static List<List<Integer>> generateTriangle(int numRows) {
		// Result list to hold all rows
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> row = generateRow(i);
			triangle.add(row);
		}
		return triangle;
	}

	private static List<Integer> generateRow(int row) {
		int ans = 1;
		List<Integer> ansRow = new ArrayList<Integer>();
		ansRow.add(ans);
		
		for (int col = 1; col < row; col++) {
			ans = ans * (row - col);
			ans = ans / col;
			ansRow.add(ans);
		}
		return ansRow;
	}

	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> result = generateTriangle(numRows);
		System.out.println(result);
	}
}
// Time Complexity : O(N^2)
// Space Complexity : O(N)
