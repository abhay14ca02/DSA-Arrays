package com.arrays.hard.PascalTriangleIII;

//To find the element at the coordinates (R,C) where R is the row number and C is the Column number
// int r = 5, c = 3;
public class OptimalSolution {
	// Function to compute binomial coefficient (nCr)
	public static long findPascalElement(int r, int c) {
		// Element is C(r-1, c-1)
		int n = r - 1, k = c - 1;
		long result = 1;
		// Compute C(n, k) using iterative formula
		for (int i = 0; i < k; i++) {
			result *= (n - i);
			result /= (i + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		int r = 5, c = 3;
		System.out.println(findPascalElement(r, c));
	}
}
//Time: O(k) → only loop k times
//Space: O(1)