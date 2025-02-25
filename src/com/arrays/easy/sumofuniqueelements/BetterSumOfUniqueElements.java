package com.arrays.easy.sumofuniqueelements;

import java.util.HashMap;
import java.util.Map;
//Sum of Unique Elements
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array
public class BetterSumOfUniqueElements {

	private static int sumOfUniqueElements(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) == 1) {

				sum = sum + nums[i];
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		System.out.println(sumOfUniqueElements(nums));
	}
}
