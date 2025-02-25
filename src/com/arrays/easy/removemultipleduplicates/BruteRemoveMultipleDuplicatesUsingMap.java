package com.arrays.easy.removemultipleduplicates;

import java.util.HashMap;
import java.util.Map;

//Remove Duplicates in-place from Sorted Array. The relative order of the elements should be kept the same
//intput arr[]={1,1,2,2,2,3,3}
// output : 1,2,3
public class BruteRemoveMultipleDuplicatesUsingMap {

	private static int removeDuplicateElements(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			//int idx = 0;
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
				// We can add unique elements in array like below
				//arr[idx++] = arr[i];
			}
		}
		
		int j = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			arr[j] = entry.getKey();
			j++;
		}
		return j;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5 };
		int size = removeDuplicateElements(arr);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
// Time Complexity : O(N)
// Space Complexity : O(n)