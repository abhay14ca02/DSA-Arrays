package com.arrays.easy.MinimumCommonValue;

//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
//If there is no common integer amongst nums1 and nums2, return -1.
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
//Input: nums1 = [1,2,3], nums2 = [2,4], Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2.
public class OptimalApproach {
	private static int getCommon(int[] nums1, int[] nums2) {

		int n = nums1.length;
		int m = nums2.length;
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (nums1[i] == nums2[j]) {
				return nums1[i];
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
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
//Time Complexity:O(m+n)
//Space Complexity:O(1)