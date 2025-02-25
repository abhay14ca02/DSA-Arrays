package com.arrays.medium.SubarraySumsDivisiblebyK;

import java.util.HashMap;
import java.util.Map;

public class OptimalSolution {
	private static int subarraysDivByK(int[] nums, int k) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int result = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			int rem = sum % k;
			if (rem < 0) {
				rem += k;
			}
			if (map.containsKey(rem)) {
				result += map.get(rem);
				map.put(rem, map.get(rem) + 1);
			} else {
				map.put(rem, 1);
			}
		}
		return result;
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