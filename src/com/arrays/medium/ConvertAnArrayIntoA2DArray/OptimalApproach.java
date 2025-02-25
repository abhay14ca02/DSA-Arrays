package com.arrays.medium.ConvertAnArrayIntoA2DArray;

import java.util.ArrayList;
import java.util.List;

//You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
//The 2D array should contain only the elements of the array nums.
//Each row in the 2D array contains distinct integers.
//The number of rows in the 2D array should be minimal.
//Return the resulting array. If there are multiple answers, return any of them.
//Note that the 2D array can have a different number of elements on each row.
//Input: nums = [1,3,4,1,2,3,1], Output: [[1,3,4,2],[1,3],[1]]

public class OptimalApproach {
	private static List<List<Integer>> findMatrix(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int n = nums.length;
		int[] freqCount = new int[n + 1];
		for (int i = 0; i < n; i++) {

			int freq = freqCount[nums[i]];
			if (freq == result.size()) {
				result.add(new ArrayList<Integer>());// Add one more row
			}
			result.get(freq).add(nums[i]);
			freqCount[nums[i]]++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 1, 2, 3, 1 };
		List<List<Integer>> result = findMatrix(nums);
		System.out.println(result);
	}
}
//Time Complexity:O(N)
//Space Complexity:O(N)+O(N)
