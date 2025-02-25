package com.arrays.medium.majorityelementnby3;

import java.util.ArrayList;
import java.util.List;

//Given an integer array of size n, find all elements that appear more than [ n/3 ] times.
//Input: nums = [3,2,3], Output: [3]
//Input: nums = [1], Output: [1]
//Input: nums = [1,2], Output: [1,2]
public class BruteMajorityElementBy3 {
	private static List<Integer> majorityElement(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int majorityCount = 0;
			if (result.size() == 2) {// As, we have at most 2 majority elements only which appear more than [ n/3 ] times.
				break;
			}
			for (int j = i; j < n; j++) {
				if (nums[i] == nums[j]) {
					majorityCount++;
				}
			}
			if (majorityCount > Math.floor(n / 3)) {
				result.add(nums[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = { 11,33,33,11,33,11 };
		List<Integer> result = majorityElement(nums);
		System.out.println(result);
	}
}
