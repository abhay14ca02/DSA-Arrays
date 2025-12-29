package com.arrays.easy.AppearsOnceAndTheOtherNumbersTwice;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Input: nums = [2,2,1], output = 1
//Input: nums = [4,1,2,1,2], Output: 4
public class BetterApproach2 {

	private static int singleNumber(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) { // check count
				return entry.getKey(); // return the number
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 1, 2, 1, 2 };
		int num = singleNumber(nums);
		System.out.println(num);
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N)