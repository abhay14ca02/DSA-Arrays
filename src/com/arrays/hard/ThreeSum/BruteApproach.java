package com.arrays.hard.ThreeSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Input: nums = [-1,0,1,2,-1,-4], Output: [[-1,-1,2],[-1,0,1]]

public class BruteApproach {
	private static List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		if (n < 3) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						Collections.sort(list);
						if (!result.contains(list)) {
							result.add(list);
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = threeSum(nums);
		System.out.println(result);
	}
}
//Time Complexity : O(N^3)
//Space Complexity:O(Unique Triplets)