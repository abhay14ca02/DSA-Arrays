package com.arrays.basic.easy.missingnumber1lc;

import java.util.HashMap;
import java.util.Map;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
//Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
//Output: 8
public class BetterMissingNumber {

	private static int findMissingNum(int[] arr) {
		
        // We can use Hashing technique also but if we need to add the frequency of negative number then it won't be handled.
		// If the size of the array is 10^5 then it will be difficult to handle
		// By using HashMap
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			map.put(arr[i], 1);
		}
		
		for (int i = 1; i <= n; i++) {
			if (map.get(i) == null) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int missingNum = findMissingNum(arr);
		System.out.println("Missing Number is : " + missingNum);
	}
}
