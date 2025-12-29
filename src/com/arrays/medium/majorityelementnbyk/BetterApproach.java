package com.arrays.medium.majorityelementnbyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an integer array nums and an integer k, find all elements appearing more than n/m times.
//Input : nums: [3, 1, 2, 2, 1, 2, 3, 3], k = 4

public class BetterApproach {

	private static List<Integer> findMajorityNK(int[] nums, int k) {

		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = nums.length;

		for (int num : nums) {

			map.put(num, map.getOrDefault(num, 0) + 1);

			if (map.get(num) > n / k && !result.contains(num)) {
				result.add(num);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2, 2, 1, 2, 3, 3 };
		int k = 4;

		List<Integer> result = findMajorityNK(nums, k);
		System.out.println(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)
