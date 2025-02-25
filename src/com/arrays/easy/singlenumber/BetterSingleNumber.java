package com.arrays.easy.singlenumber;

import java.util.HashMap;
import java.util.Map;

//Single Number
//Given an array arr[] of positive integers where every element appears even times except for one. Find that number occurring an odd number of times
//Input : arr[] = { 1, 1, 2, 2, 2 }
//Output : 2
public class BetterSingleNumber {

	private static int getSingleNumber(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int i;
		for (i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) % 2 != 0) {

				break;
			}
		}
		return arr[i];

	}
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2 };
		System.out.println(getSingleNumber(arr));
	}
}
