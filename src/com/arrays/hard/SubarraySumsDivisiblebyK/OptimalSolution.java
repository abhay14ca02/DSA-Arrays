package com.arrays.hard.SubarraySumsDivisiblebyK;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return the number of non-empty 
//subarrays that have a sum divisible by k. A subarray is a contiguous part of an array.
//Input: nums = [4,5,0,-2,-3,1], k = 5, Output: 7
//Explanation: There are 7 subarrays with a sum divisible by k = 5:
//[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

public class OptimalSolution {
	private static int subarraysDivByK(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// Base case: remainder 0 has frequency 1
		map.put(0, 1);
		int total = 0, sum = 0;
		for (int num : nums) {
			sum += num;
			int rem = sum % k;
			// Handle negative remainders
			if (rem < 0) {
				rem += k;
			}
			if (map.containsKey(rem)) {
				total += map.get(rem);
				map.put(rem, map.get(rem) + 1);
			} else {
				map.put(rem, 1);
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		int result = subarraysDivByK(nums, k);
		System.out.println(result);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(N)