package com.arrays.easy.singlenumber;

import java.util.HashMap;
import java.util.Map;

//Single Number
//Given an array arr[] of positive integers where every element appears even times except for one. 
//Find that number occurring an odd number of times
//Input : arr[] = { 1, 1, 2, 2, 2 }
//Output : 2
public class BetterSingleNumber {

	private static int getSingleNumber(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : map.keySet()) {
			if (map.get(num) % 2 != 0) {
				return num;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2 };
		System.out.println(getSingleNumber(arr));
	}
}

// Time Complexity : O(N)
// Space Complexity : O(N)