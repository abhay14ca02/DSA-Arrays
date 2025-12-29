package com.arrays.medium.majorityelementnbyk;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums and an integer k, find all elements appearing more than n/k times.
// Input : nums: [3, 1, 2, 2, 1, 2, 3, 3], k = 4, Output = {3,2}
public class BruteApproach {

	private static List<Integer> findMajorityNK(int[] nums, int k) {

		List<Integer> result = new ArrayList<Integer>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {

				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count > n / k) {
				result.add(nums[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2, 2, 1, 2, 3, 3 };
		int k = 4;
		List<Integer> result = findMajorityNK(nums, k);
		System.out.println(result);
	}
}
// Time Complexity : O(N*N)
// Space Complexity : O(1)
