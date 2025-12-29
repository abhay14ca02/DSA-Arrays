package com.arrays.hard.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] 
//such that: 0 <= a, b, c, d < n, a, b, c, and d are distinct. nums[a] + nums[b] + nums[c] + nums[d] == target
//Input: nums = [1,0,-1,0,-2,2], target = 0, Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
public class BruteApproach {

	private static List<List<Integer>> fourSum(int[] nums, int target) {

		int n = nums.length;
		if (n < 4) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < n - 3; i++) {

			for (int j = i + 1; j < n - 2; j++) {
				for (int k = j + 1; k < n - 1; k++) {
					for (int l = k + 1; l < n; l++) {
						// taking bigger data type
						// to avoid integer overflow:
						long sum = (long) nums[i] + nums[j];
						sum += nums[k];
						sum += nums[l];
						if (sum == target) {
							List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
							Collections.sort(temp);
							if (!result.contains(temp)) {
								result.add(temp);
							}
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> result = fourSum(nums, target);
		System.out.println(result);
	}
}
//Time Complexity :O(N^4)
//Space Complexity:O(no. of the quadruplets)
