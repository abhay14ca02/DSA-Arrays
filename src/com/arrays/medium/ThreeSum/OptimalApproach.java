package com.arrays.medium.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Input: nums = [-1,0,1,2,-1,-4], Output: [[-1,-1,2],[-1,0,1]]
public class OptimalApproach {

	private static List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		if (n < 3) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < n - 2; i++) {

			// skip the duplicates:
			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			//moving 2 pointers:
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {

					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					result.add(list);
					j++;
					k--;
					// skip the duplicates:
					while (j < k && nums[j] == nums[j - 1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k + 1]) {
						k--;
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
//Time Complexity: O(NlogN)+O(N^2)
//Space Complexity : O(1)