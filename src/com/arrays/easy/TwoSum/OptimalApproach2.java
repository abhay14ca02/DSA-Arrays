package com.arrays.easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

public class OptimalApproach2 {

	private static int[] findTwoSum(int[] nums, int target) {
		
		// We will use Map here, and check if target - nums[i] is present in Map or not.
		// If present then we will have our elements else we will add nums[i] in Map till array is iterated.

		int[] res = { -1, -1 };
		int n = nums.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

			int desiredNum = target - nums[i];

			if (map.containsKey(desiredNum)) {

				res[0] = map.get(desiredNum);
				res[1] = i;
				return res;
			}

			map.put(nums[i], i);
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int res[] = findTwoSum(nums, target);
		System.out.print("{" + res[0] + " " + res[1] + "}");
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N)
