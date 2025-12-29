package com.arrays.medium.IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.List;

//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2], Output: [2,2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4], Output: [4,9]
public class OptimalSolution {

	public static int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<Integer>();
		int[] count = new int[1000 + 1];
		for (int num1 : nums1) {
			count[num1]++;
		}
		for (int num2 : nums2) {
			if (count[num2] != 0) {
				list.add(num2);
				count[num2]--;
			}
		}
		int[] result = new int[list.size()];
		int i = 0;
		for (int num : list) {
			result[i++] = num;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] result = intersect(nums1, nums2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(N+M)
//Space complexity : O(1001)