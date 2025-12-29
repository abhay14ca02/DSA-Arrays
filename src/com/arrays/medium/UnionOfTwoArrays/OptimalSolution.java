package com.arrays.medium.UnionOfTwoArrays;

import java.util.ArrayList;
import java.util.List;

//Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
//The union of two arrays can be defined as the common and distinct elements in the two arrays.
//Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2], Output: [1, 2, 3]
//Input: a[] = [1, 2, 3], b[] = [4, 5, 6], Output: [1, 2, 3, 4, 5, 6]

public class OptimalSolution {

	private static List<Integer> findUnion(int[] arr1, int[] arr2) {
		List<Integer> result = new ArrayList<Integer>();

		int n1 = arr1.length, n2 = arr2.length;
		int i = 0, j = 0;
		while (i < n1 && j < n2) {

			// Skip duplicates in arr1
			if (i > 0 && arr1[i] == arr1[i - 1]) {
				i++;
				continue;
			}
			// Skip duplicates in arr2
			if (j > 0 && arr2[j] == arr2[j - 1]) {
				j++;
				continue;
			}
			if (arr1[i] < arr2[j]) {
				result.add(arr1[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				result.add(arr2[j]);
				j++;
			} else {// arr1[i] == arr2[j]
				result.add(arr1[i]);
				i++;
				j++;
			}
		}
		// Add remaining elements from arr1
		while (i < n1) {
			if (i == 0 || arr1[i] != arr1[i - 1])
				result.add(arr1[i]);
			i++;
		}
		// Add remaining elements from arr2
		while (j < n2) {
			if (j == 0 || arr2[j] != arr2[j - 1])
				result.add(arr2[j]);
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 8 };
		int[] arr2 = { 2, 3, 4, 4, 5, 9 };
		List<Integer> result = findUnion(arr1, arr2);
		System.out.println(result);
	}
}
//Time Complexity : O(N+M)
//Space Complexity : O(1)
