package com.arrays.medium.ConvertanArrayIntoa2DArrayWithConditions;

import java.util.ArrayList;
import java.util.List;

//Input: nums = [1,3,4,1,2,3,1], Output: [[1,3,4,2],[1,3],[1]]
public class OptimalSolution {
	private static List<List<Integer>> findMatrix(int[] nums) {

		int n = nums.length;
		int map[] = new int[n + 1];
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int num : nums) {
			int freq = map[num];
			if (freq == result.size()) {
				result.add(new ArrayList<>());// add one more row
			}
			result.get(freq).add(num);
			map[num]++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 1, 2, 3, 1 };
		List<List<Integer>> result = findMatrix(nums);
		System.out.print(result);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)