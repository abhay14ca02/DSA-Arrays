package com.arrays.medium.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Input: nums = [100,4,200,1,3,2], Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class OptimalApproach {
	private static int findLongestConsecutive(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		// put all the array elements into set
		Set<Integer> set = new HashSet<Integer>();

		for (int num : nums) {
			set.add(num);
		}

		int longest = 1;

		for (int val : set) {
			// If current element is the starting element of a sequence
			if (set.contains(val) && !set.contains(val - 1)) {
				// Then check for next elements in the sequence
				int cur = val, count = 1;
				while (set.contains(cur + 1)) {
					cur++;
					count++;
				}
				// Update optimal length
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		int longest = findLongestConsecutive(nums);
		System.out.println(longest);
	}
}
//Time Complexity : O(N) + O(N) = O(2N)
//Space Complexity : O(N)