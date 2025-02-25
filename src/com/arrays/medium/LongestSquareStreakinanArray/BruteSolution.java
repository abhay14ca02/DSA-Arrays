package com.arrays.medium.LongestSquareStreakinanArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Approach-1 (Using sorting and map)
//Input: nums = [4,3,6,16,8,2], Output: 3
public class BruteSolution {
	public static int longestSquareStreak(int[] nums) {
		Arrays.sort(nums);
		int maxStreak = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {

			int root = (int) Math.sqrt(num);
			if (root * root == num && map.containsKey(root)) {
				map.put(num, map.get(root) + 1);
			} else {
				map.put(num, 1);
			}
			maxStreak = Math.max(maxStreak, map.get(num));
		}
		return maxStreak < 2 ? -1 : maxStreak;

	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 6, 16, 8, 2 };
		int result = longestSquareStreak(nums);
		System.out.println(result);
	}
}
//T.C : O(nlogn)
//S.C : O(n)