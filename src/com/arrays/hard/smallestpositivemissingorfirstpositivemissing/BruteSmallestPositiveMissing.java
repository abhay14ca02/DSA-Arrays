package com.arrays.hard.smallestpositivemissingorfirstpositivemissing;

import java.util.HashMap;
import java.util.Map;

public class BruteSmallestPositiveMissing {

	private static int findSmallestPositiveMissing(int[] arr) {

		int size = arr.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < size; i++) {

			if (arr[i] > 0) {
				map.put(arr[i], 1);
			}
		}
		for (int i = 1; i <= size; i++) {

			if (!map.containsKey(i)) {

				return i;
			}
		}

		return size + 1;
	}

	private static int findSmallestPositiveMissingNum(int[] arr) {

	// Here we need to find max of the array then we can take countArr size = max+1
		
		int n = arr.length;

		int countArr[] = new int[n + 1];

		for (int i = 0; i < n; i++) {

			if (arr[i] > 0) {
				countArr[arr[i]]++;
			}
		}

		for (int i = 1; i <= n; i++) {

			if (countArr[i] == 0) {
				return i;
			}
		}
		return n + 1;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 0, -10, 1, 3, -20, 1 };
		int[] arr2 = { 0, -10, 1, 3, -20, 1, 3 };
		int smallestMissing = findSmallestPositiveMissing(arr1);
		System.out.println("Smallest Positive Missing Number is " + smallestMissing);

		int smallestMissingNum = findSmallestPositiveMissingNum(arr2);

		System.out.println("Smallest Positive Missing Number is " + smallestMissingNum);
	}

}
// Time Complexity : O(N)
// Space Complexity : O(N)