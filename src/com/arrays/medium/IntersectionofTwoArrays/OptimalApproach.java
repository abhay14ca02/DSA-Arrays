package com.arrays.medium.IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2], Output: [2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4], Output: [9,4], Explanation: [4,9] is also accepted.
public class OptimalApproach {
	// Approach-3 (Sorting and binary search)
	private static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);// NLogN
		Set<Integer> set = new HashSet<Integer>();
		for (int num2 : nums2) {// M
			if (binarySearch(nums1, num2)) {// LogM
				set.add(num2);
			}
		}
		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}
		return result;
	}

	private static boolean binarySearch(int[] nums1, int num2) {
		int start = 0;
		int end = nums1.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums1[mid] == num2) {
				return true;
			} else if (nums1[mid] < num2) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
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
//T.C : O(nlogn + mlogm)
//S.C : O(unique elements)