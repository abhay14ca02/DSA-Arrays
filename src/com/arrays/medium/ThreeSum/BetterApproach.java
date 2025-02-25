package com.arrays.medium.ThreeSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Input: nums = [-1,0,1,2,-1,-4], Output: [[-1,-1,2],[-1,0,1]]
public class BetterApproach {

	private static List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		if (n < 3) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < n - 2; i++) {
			Set<Integer> set = new HashSet<Integer>();
			int tar = -nums[i];
			for (int j = i + 1; j < n; j++) {
				int third = tar - nums[j];
				if (set.contains(third)) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(third);
					Collections.sort(list);
					if (!result.contains(list)) {
						result.add(list);
					}
				}
				set.add(nums[j]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1,0,1,2,-1,-4 };
		List<List<Integer>> result = threeSum(nums);
		System.out.println(result);
	}
}
//Time Complexity : O(N^2)
//Space Complexity:O(Unique Triplets) + O(N)