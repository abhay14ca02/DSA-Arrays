package com.arrays.medium.majorityelementnby2;

import java.util.HashMap;
import java.util.Map;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.
//Input: nums = [3,2,3], Output: 3
//Input: nums = [2,2,1,1,1,2,2], Output: 2
public class BetterApproach {
	private static int majorityElement(int[] nums) {

		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > Math.floor(n / 2)) {
				return entry.getKey();
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
//Time Complexity:O(N)
//Space Complexity:O(N)