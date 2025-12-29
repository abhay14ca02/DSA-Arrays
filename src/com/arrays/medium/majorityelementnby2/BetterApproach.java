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
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : map.keySet())
			if (map.get(num) > n / 2) {
				return num;
			}
		return -1;
	}

//Time Complexity:O(N) + O(N)
//Space Complexity:O(N)

//We can optimize it further and we can only one pass to find majority element

	private static int majorityEle(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {

			map.put(num, map.getOrDefault(num, 0) + 1);

			// checking if num is the majority element:
			if (map.get(num) > n / 2) {
				return num;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int element = majorityElement(nums);
		System.out.println(element);

		int ele = majorityEle(nums);
		System.out.println(ele);
	}
}
//Time Complexity:O(N)
//Space Complexity:O(N)