package com.arrays.medium.majorityelementnby2;

import java.util.Arrays;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.
//Input: nums = [3,2,3], Output: 3
//Input: nums = [2,2,1,1,1,2,2], Output: 2

public class BetterApproach2 {
	private static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > n / 2) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int element = majorityElement(nums);
		System.out.println("Majority Element is : " + element);
	}
}
//Time Complexity:O(NLogN) + O(N)
//Space Complexity:O(1)