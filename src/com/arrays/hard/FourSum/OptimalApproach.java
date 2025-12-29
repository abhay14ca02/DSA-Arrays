package com.arrays.hard.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//0 <= a, b, c, d < n, a, b, c, and d are distinct. nums[a] + nums[b] + nums[c] + nums[d] == target
//Input: nums = [1,0,-1,0,-2,2], target = 0, Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
public class OptimalApproach {
	private static List<List<Integer>> fourSum(int[] nums, int target) {
		int n = nums.length;
		if (n < 4) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < n - 3; i++) {
			// avoid the duplicates while moving i:
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n - 2; j++) {
				// avoid the duplicates while moving j:
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				// 2 pointers:
				int left = j + 1;
				int right = n - 1;
				while (left < right) {
					long sum = nums[i] + nums[j];
					sum += nums[left] + nums[right];
					if (sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						// Adjust left & right pointers to find more possible triplets
						left++;
						right--;
						// Skip duplicate 'left'
						while (left < right && nums[left] == nums[left - 1])
							left++;
						// Skip duplicate 'right'
						while (left < right && nums[right] == nums[right + 1])
							right--;
					} else if (sum < target)
						left++;
					else
						right--;

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
//Time Complexity : O(N^3) + O(NLogN)
//Space Complexity : O(No. of unique quadruplets)