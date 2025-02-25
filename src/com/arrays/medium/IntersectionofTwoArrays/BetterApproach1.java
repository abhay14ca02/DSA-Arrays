package com.arrays.medium.IntersectionofTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2], Output: [2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4], Output: [9,4], Explanation: [4,9] is also accepted.
public class BetterApproach1 {
	// Using one set
	private static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {

			set.add(nums1[i]);
		}
		for (int j = 0; j < nums2.length; j++) {
			if (set.contains(nums2[j])) {
				result.add(nums2[j]);
				set.remove(nums2[j]);

			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] result = intersection(nums1, nums2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity:O(N+M)
//Space Complexity :O(N)