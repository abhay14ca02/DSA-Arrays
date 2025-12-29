package com.arrays.easy.FindTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OptimalApproach {

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		Set<Integer> set1 = new HashSet<Integer>();

		Set<Integer> set2 = new HashSet<Integer>();

		for (Integer num : nums1) {
			set1.add(num);
		}

		for (Integer num : nums2) {
			set2.add(num);
		}

		List<Integer> diff1 = new ArrayList<Integer>();

		List<Integer> diff2 = new ArrayList<Integer>();

		// List 1: elements in set1 but NOT in set2
		for (int num : set1) {
			if (!set2.contains(num))
				diff1.add(num);
		}
		// List 2: elements in set2 but NOT in set1
		for (int num : set2) {
			if (!set1.contains(num))
				diff2.add(num);
		}

		result.add(diff1);
		result.add(diff2);

		return result;
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };
		List<List<Integer>> res = findDifference(nums1, nums2);
		System.out.println(res);
	}
}

// Time Complexity : O(N+M)
// Space Complexity : O(N+M)
