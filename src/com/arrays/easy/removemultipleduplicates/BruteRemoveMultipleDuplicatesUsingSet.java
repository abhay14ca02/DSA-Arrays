package com.arrays.easy.removemultipleduplicates;

import java.util.HashSet;
import java.util.Set;

//Remove Duplicates in-place from Sorted Array. The relative order of the elements should be kept the same
//intput arr[]={1,1,2,2,2,3,3}
//output : 1,2,3
public class BruteRemoveMultipleDuplicatesUsingSet {

	private static int removeDuplicateElements(int[] arr) {

		// We can use Set collection. Set does not allow duplicate
		Set<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			hashSet.add(arr[i]);
		}
		
		int j = 0;
		for (int ele : hashSet) {
			arr[j] = ele;
			j++;
		}

		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };
		int size = removeDuplicateElements(arr);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

// Time Complexity : O(N)
// Space Complexity : O(N)
