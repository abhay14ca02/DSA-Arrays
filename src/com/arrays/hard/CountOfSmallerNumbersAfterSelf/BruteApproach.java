package com.arrays.hard.CountOfSmallerNumbersAfterSelf;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums, return an integer array counts where counts[i] 
//is the number of smaller elements to the right of nums[i].
//Input: nums = [5,2,6,1], Output: [2,1,1,0]
public class BruteApproach {

	private static List<Integer> countSmaller(int[] nums) {

		int n = nums.length;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
			result.add(count);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 2, 6, 1 };
		List<Integer> res = countSmaller(nums);
		System.out.println(res);
	}
}

// Time Complexity: O(N^2)
// Space Complexity : O(N)