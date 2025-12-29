package com.arrays.hard.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//0 <= a, b, c, d < n, a, b, c, and d are distinct. nums[a] + nums[b] + nums[c] + nums[d] == target
//Input: nums = [1,0,-1,0,-2,2], target = 0, Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

public class BetterApproach2 {

	private static List<List<Integer>> fourSum(int[] nums, int target) {
		int n = nums.length;
		if (n < 4) {
			return new ArrayList<List<Integer>>();
		}
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < n - 3; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; // skip duplicates
			}
			for (int j = i + 1; j < n - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue; // skip duplicates
				}
				Set<Long> set = new HashSet<Long>();

				for (int k = j + 1; k < n; k++) {
					// taking bigger data type
					// to avoid integer overflow:
					long sum = nums[i] + nums[j];
					sum += nums[k];
					long fourth = target - sum;
					
					if (set.contains(fourth)) {
						result.add(Arrays.asList(nums[i], nums[j], (int) fourth, nums[k]));

						// skip duplicates for k
						while (k + 1 < n && nums[k] == nums[k + 1])
							k++;
					}

					set.add((long) nums[k]);
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

//Time Complexity: O(N^3) + NLogN
//Space Complexity: O(no. of the quadruplets) + O(N)
