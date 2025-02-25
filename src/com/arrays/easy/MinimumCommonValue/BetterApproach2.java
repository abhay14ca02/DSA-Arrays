package com.arrays.easy.MinimumCommonValue;

//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
//If there is no common integer amongst nums1 and nums2, return -1.
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
//Input: nums1 = [1,2,3], nums2 = [2,4], Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2.
public class BetterApproach2 {
	private static int getCommon(int[] nums1, int[] nums2) {

		int n = nums1.length;
		for (int i = 0; i < n; i++) {
			if (getCommonVal(nums2, nums1[i]))
				return nums1[i];
		}
		return -1;
	}

	private static boolean getCommonVal(int[] nums2, int i) {

		int start = 0;
		int end = nums2.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums2[mid] == i) {
				return true;
			} else if (nums2[mid] < i) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 6 };
		int[] nums2 = { 2, 3, 4, 5 };
		int commonVal = getCommon(nums1, nums2);
		System.out.println(commonVal);
	}
}
//Time Complexity:O(mLogn)
//Space Complexity:O(1)