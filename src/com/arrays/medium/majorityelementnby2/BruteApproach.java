package com.arrays.medium.majorityelementnby2;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.
//Input: nums = [3,2,3], Output: 3
//Input: nums = [2,2,1,1,1,2,2], Output: 2

public class BruteApproach {
	private static int majorityElement(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (nums[j] == nums[i]) {
					count++;
				}
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
		System.out.println(element);
	}
}
//Time Complexity:O(N*N)
//Space Complexity:O(1)