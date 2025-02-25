package com.arrays.easy.MinimumCommonValue;

import java.util.HashSet;
import java.util.Set;

//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
//If there is no common integer amongst nums1 and nums2, return -1.
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
//Input: nums1 = [1,2,3], nums2 = [2,4], Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2.
public class BetterApproach {
	private static int getCommon(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int j = 0; j < nums2.length; j++) {
			if (set.contains(nums2[j])) {

				return nums2[j];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 6 };
		int[] nums2 = { 2, 3, 4, 5 };
		int commonVal = getCommon(nums1, nums2);
		System.out.println(commonVal);
	}
}
//Time Complexity:O(N+M)
//Space Complexity:O(N)