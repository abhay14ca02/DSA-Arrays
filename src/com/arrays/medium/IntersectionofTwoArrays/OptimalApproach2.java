package com.arrays.medium.IntersectionofTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2], Output: [2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4], Output: [9,4], Explanation: [4,9] is also accepted.
public class OptimalApproach2 {
	// Approach-4 (Sorting and two-pointers)
	private static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int n = nums1.length;
		int m = nums2.length;
		List<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < n && j < m) {

			if (i > 0 && nums1[i] == nums1[i - 1]) {
				i++;
				continue;
			}
			if (j > 0 && nums2[j] == nums2[j - 1]) {
				j++;
				continue;
			}
			if (nums1[i] == nums2[j]) {
				result.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
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
//T.C : O(n + m) + O(n log n + m log m)
//S.C : O(min(n, m))