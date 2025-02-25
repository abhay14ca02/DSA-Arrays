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
		for (int i = 0; i < n; i++) {

			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);

			} else {
				map.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > Math.floor(n / 3)) {
				result.add(entry.getKey());
			}
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
		int min = (int) (n / 3) + 1;
		for (int i = 0; i < n; i++) {
			int value = map.getOrDefault(nums[i], 0);
			map.put(nums[i], value + 1);
			// checking if nums[i] is the majority element:
			if (map.get(nums[i]) == min) {
				result.add(nums[i]);
			}
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