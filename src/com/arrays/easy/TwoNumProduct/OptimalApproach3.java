package com.arrays.easy.TwoNumProduct;

import java.util.HashMap;
import java.util.Map;

//Given an array arr[] of n distinct integers and a target value, the task is to check whether 
//there is a pair of elements in the array whose product is equal to target.
//Input: arr[] = [1, 5, 7, -1, 5], target = 35
//Output: true
//Input: arr[] = [-10, 20, 9, -40], target = 30
//Output: false

public class OptimalApproach3 {

	private static boolean isProduct(int[] arr, long target) {

		// We will take Map here, Iterate through the array and check if desiredNum =
		// (int) (target / num) is present in Map or not
		// If present then return true else add in Map

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int num = arr[i];

			// Check if current number can be a factor of the target.
			if (target % num == 0) {

				int desiredNum = (int) (target / num);
				// If the desiredNum has been seen before, return true.
				if (map.containsKey(desiredNum)) {
					return true;
				}
				// Mark the current number as seen.
				map.put(arr[i], i);

			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		long target = 35;
		System.out.println(isProduct(arr, target));
	}
}

// Time Complexity : O(N)
// Space Complexity : O(n)