package com.arrays.hard.CountSubarraysWithGivenXOR;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers arr[] and a number k, the task is to count 
//the number of subarrays having XOR of their elements as k.
//Input: arr = [4, 2, 2, 6, 4], k = 6, Output: 4
//Input: arr = [5, 6, 7, 8, 9], k = 5, Output: 2

public class OptimalSolution {

	public static int countSubarrayXOR(int[] arr, int k) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);// Handles subarrays starting from index 0
		int count = 0, prefixXor = 0;
		for (int i = 0; i < n; i++) {
			prefixXor ^= arr[i];
			int tar = prefixXor ^ k;
			if (map.containsKey(tar)) {
				count += map.get(tar);
			}
			map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;
		int res = countSubarrayXOR(arr, k);
		System.out.println(res);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(N)