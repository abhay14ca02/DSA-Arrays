package com.arrays.easy.CountPairsWithAbsDiffK;

import java.util.HashMap;
import java.util.Map;

//Given an array nums[] and a positive integer k, the task is to count all pairs (i, j) 
//such that i < j and absolute value of (nums [i] - nums[j]) is equal to k. 
//Input: nums = [1,2,2,1], k = 1
//Output: 4

public class OptimalApproach2 {

	// The idea is to count the frequency of each number in a hash map as we Iterate
	// over the array and for each element nums[i],
	// we need another element say complement such that abs(nums[i] - complement) =
	// k.
	// Now, we can have two cases:
	// |nums[i] - nums[j]| = k
	// nums[i] - nums[j] = k or nums[j] - nums[i] = k. Which becomes like below
	// nums[j] = nums[i] + k
	// nums[j] = nums[i] - k
	// So, we must check (num + k) & (num - k)
	private static int countPairs(int[] nums, int k) {

		int n = nums.length;
		if (n < 2) {
			return 0;
		}
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer num : nums) {
			// Check both ways: num-k and num+k
			if (map.containsKey(num - k)) {
				count += map.get(num - k);
			}
			if (map.containsKey(num + k)) {
				count += map.get(num + k);
			}
			// Add current number to frequency map
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 1 };
		int k = 1;
		int count = countPairs(nums, k);
		System.out.println(count);
	}
}
// Time Complexity : O(N)
// Space Complexity : O(N)
