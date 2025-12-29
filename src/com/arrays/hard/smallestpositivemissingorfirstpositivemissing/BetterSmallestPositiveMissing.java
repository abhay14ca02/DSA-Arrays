package com.arrays.hard.smallestpositivemissingorfirstpositivemissing;

import java.util.HashSet;
import java.util.Set;

public class BetterSmallestPositiveMissing {

	private static int findSmallestPositiveMissing(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();

		// Insert all numbers from array into the set

		for (int num : arr) {
			set.add(num);
		}

		// Check for smallest missing positive
		int smallest = 1;

		while (set.contains(smallest)) {
			smallest++;
		}
		return smallest;
	}

	private static int findSmallestPositiveMissingNum(int[] arr) {

		// Here we need to find max of the array then we can take countArr size = max+1

		int n = arr.length;

		boolean present[] = new boolean[n + 1];

		// Step 1: Mark presence

		for (int num : arr) {

			if (num > 0 && num <= n) {
				present[num] = true;
			}

		}
		// Step 2: Find first missing

		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				return i;
			}

		}
		// Step 3: If all present
		
		return n + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// int[] arr1 = { 0, -10, 1, 3, -20, 1 };
		int[] arr2 = { 0, -10, 1, 3, -20, 1, 3 };
		int smallestMissing = findSmallestPositiveMissing(arr);
		System.out.println("Smallest Positive Missing Number is " + smallestMissing);

		int smallestMissingNum = findSmallestPositiveMissingNum(arr2);

		System.out.println("Smallest Positive Missing Number is " + smallestMissingNum);
	}

}
// Time Complexity : O(N)
// Space Complexity : O(N)