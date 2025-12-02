package com.arrays.easy.TwoSumCountPairs;

// Given an array arr[] of n integers and a target value, find the number of pairs of integers in the array whose sum is equal to target.
// Input: arr[] = [1, 5, 7, -1, 5], target = 6
// Output:  3
// Input: arr[] = [1, 1, 1, 1], target = 2
// Output:  6
import java.util.HashMap;
import java.util.Map;

public class OptimalApproach2 {

	// We will use Map here, and check if target - arr[i] is present in Map or not.
	// If present then we will have our elements and get the frequency of element
	// else we will add arr[i] including frequency of element in Map till array is
	// iterated.
	private static int countPairs(int[] arr, int target) {

		if (arr.length < 2) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int num : arr) {
			int desiredNum = target - num;

			if (map.containsKey(desiredNum)) {
				count += map.get(desiredNum); // add all previous occurrences
			}
			map.put(num, map.getOrDefault(num, 0) + 1); // store frequency
		}
		return count;
	}

	private static int countNoOfPairs(int[] arr, int target) {

		if (arr.length < 2) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int num : arr) {
			int desiredNum = target - num;

			if (map.containsKey(desiredNum)) {
				count += map.get(desiredNum); // add all previous occurrences
				System.out.println(map.get(desiredNum));
			}
			// Now update frequency of current number
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1); // increment existing freq
			} else {
				map.put(num, 1); // first occurrence
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int target = 6;
		int res = countPairs(arr, target);
		int res1 = countNoOfPairs(arr, target);
		System.out.println("Total pairs :: " + res);
		System.out.println(res1);
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N)