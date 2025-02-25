package com.arrays.medium.IntersectionofTwoArrays;

import java.util.HashSet;
import java.util.Set;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2], Output: [2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4], Output: [9,4], Explanation: [4,9] is also accepted.
public class BetterApproach {
	private static int[] intersection(int[] nums1, int[] nums2) {
		// Using 2 sets
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int j = 0; j < nums2.length; j++) {
			if (set.contains(nums2[j])) {
				set1.add(nums2[j]);
			}
		}
		int[] result = new int[set1.size()];
		int i = 0;
		for (Integer num : set1) {
			result[i++] = num;
		}
		return result;
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
//Space Complexity :O(N+M)