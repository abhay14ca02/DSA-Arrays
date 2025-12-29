package com.arrays.medium.majorityelementnby3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an integer array of size n, find all elements that appear more than [ n/3 ] times.
//Input: nums = [3,2,3], Output: [3]
//Input: nums = [1], Output: [1]
//Input: nums = [1,2], Output: [1,2]

public class BetterApproach {
	@SuppressWarnings("unused")
	private static List<Integer> majorityElement(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n = nums.length;

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : map.keySet()) {
			if (map.get(num) > n / 3) {
				result.add(num);
			}

			// As, we have at most 2 majority elements only which appear more than [ n/3 ]
			if (result.size() == 2) {
				break;
			}
		}
		return result;
	}

//Time complexity : O(N) + O(N), We take 2 passes to find majority element
//Space Complexity : O(N)

//We can optimize it further and we can only one pass to find majority element
	
	private static List<Integer> findMajorityElement(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n = nums.length;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			// checking if num is the majority element:
			if (map.get(num) > n / 3 && !result.contains(num)) {
				result.add(num);
			}
			// As, we have at most 2 majority elements only which appear more than [ n/3 ]
			if (result.size() == 2) {
				break;
			}
		}
		return result;
	}

//Time complexity : O(N)
//Space Complexity : O(N)
	public static void main(String[] args) {
		int[] nums = { 11, 33, 33, 11, 33, 11 };
		List<Integer> result = findMajorityElement(nums);
		System.out.println(result);
	}
}