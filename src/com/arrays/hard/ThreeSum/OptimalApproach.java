package com.arrays.hard.ThreeSum;

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

			// moving 2 pointers:
			int left = i + 1;
			int right = n - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum < 0) {
					left++;
				} else if (sum > 0) {
					right--;
				} else {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					// Adjust left & right pointers to find more possible triplets
					left++;
					right--;
					// skip the duplicates:
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
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