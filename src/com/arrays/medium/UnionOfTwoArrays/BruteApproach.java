package com.arrays.medium.UnionOfTwoArrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
//The union of two arrays can be defined as the common and distinct elements in the two arrays.
//Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2], Output: [1, 2, 3]
//Input: a[] = [1, 2, 3], b[] = [4, 5, 6], Output: [1, 2, 3, 4, 5, 6]

public class BruteApproach {

	private static List<Integer> findUnion(int[] arr1, int[] arr2) {
		Set<Integer> result = new LinkedHashSet<Integer>();

		for (int num1 : arr1) {
			result.add(num1);
		}

		for (int num2 : arr2) {
			result.add(num2);
		}

		return new ArrayList<Integer>(result);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 8 };
		int[] arr2 = { 2, 3, 4, 4, 5, 9 };
		List<Integer> result = findUnion(arr1, arr2);
		System.out.println(result);
	}
}

// Time Complexity : O(N+M)
// Space Complexity : O(N+M)
