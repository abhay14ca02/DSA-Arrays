package com.arrays.medium.SortanArray;

import java.util.HashMap;
import java.util.Map;

//Input: nums = [5,2,3,1], Output: [1,2,3,5]
//We can sort this array by applying counting sort. Counting sort works when range is given.
public class OptimalSolution {
	private static int[] sortArray(int[] nums) {
		int n = nums.length;
		int minE = Integer.MAX_VALUE;
		int maxE = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			minE = Math.min(minE, nums[i]);
			maxE = Math.max(maxE, nums[i]);
		}
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int i = 0;
		for (int num = minE; num <= maxE; num++) {
			while (map.getOrDefault(num, 0) > 0) {
				nums[i++] = num;
				map.put(num, map.get(num) - 1);
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 2, 3, 1 };
		int[] result = sortArray(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(N+K)
//Space Complexity : O(N)