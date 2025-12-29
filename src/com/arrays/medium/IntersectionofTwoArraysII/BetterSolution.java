package com.arrays.medium.IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2], Output: [2,2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4], Output: [4,9]
public class BetterSolution {

	// Using one set
	private static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int num1 : nums1) {
			set.add(num1);
		}
		for (int num2 : nums2) {
			if (set.contains(num2)) {
				result.add(num2);
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
//Time Complexity : O(N+M)
//Space complexity : O(N)
