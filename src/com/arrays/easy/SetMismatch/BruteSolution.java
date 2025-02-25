package com.arrays.easy.SetMismatch;

import java.util.HashMap;
import java.util.Map;

//You have a set of integers s, which originally contains all the numbers from 1 to n. 
//Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
//which results in repetition of one number and loss of another number.
//Input: nums = [1,2,2,4], Output: [2,3]
public class BruteSolution {

	private static int[] findErrorNums(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int duplicate = -1;
		int missing = -1;
		int n = nums.length;
		for (Integer num : nums) {
			int value = map.getOrDefault(num, 0);
			map.put(num, value + 1);

		}
		for (int i = 1; i <= n; i++) {
			if (map.get(i) != null && map.get(i) > 1) {
				duplicate = i;
			}
			if (map.get(i) == null) {
				missing = i;
				break;
			}
		}
		int[] ans = { duplicate, missing };
		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 4 };
		int[] ans = findErrorNums(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N)